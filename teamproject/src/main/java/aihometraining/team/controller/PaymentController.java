package aihometraining.team.controller;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aihometraining.team.challenge.mapper.ChallengeEnterMapper;
import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.challenge.service.ChallengeEnterService;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlan;
import aihometraining.team.dto.ChallengeGatherPlanDo;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassTake;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.Payment;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.mapper.PaymentMapper;
import aihometraining.team.service.PaymentService;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Controller
public class PaymentController {
	
	private PaymentService paymentService;
	private PaymentMapper paymentMapper;
	private ChallengeEnterMapper challengeEnterMapper;
	private ChallengeEnterService challengeEnterService;
	private MemberMapper memberMapper;
	private ChallengeGatherMapper challengeGatherMapper;
	
	public PaymentController(PaymentService paymentService, PaymentMapper paymentMapper
							,ChallengeEnterMapper challengeEnterMapper, ChallengeEnterService challengeEnterService
							,MemberMapper memberMapper, ChallengeGatherMapper challengeGatherMapper) {
		this.paymentService = paymentService;
		this.paymentMapper = paymentMapper;
		this.challengeEnterMapper = challengeEnterMapper;
		this.challengeEnterService = challengeEnterService;
		this.memberMapper = memberMapper;
		this.challengeGatherMapper = challengeGatherMapper;
	}
	
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	
	//위시리스트
	@GetMapping("/wishList")
	public String wishList(Model model, HttpServletRequest request
							,@RequestParam(name="sortStandard", required = false) String sortStandard) {
		
		HttpSession session = request.getSession();
		String SEMAIL = (String) session.getAttribute("SEMAIL");
		
		System.out.println(sortStandard);
		
		List<WishList> wishList = paymentService.getWishList(SEMAIL, sortStandard);
			
		model.addAttribute("title", "위시리스트");
		model.addAttribute("wishList", wishList);
		
		return "member/wishList";
	}
	
	//위시리스트 삭제
	@PostMapping("/wishList")
	@ResponseBody
	public boolean wishList(@RequestParam(name="wishListCode", required = false) String[] wishListCodeArray) {
		
		boolean result = paymentService.deleteWishList(wishListCodeArray);
		if(result == true) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	//수강신청 화면
	@GetMapping("/signUpForClass")
	public String eClassTake(Model model , HttpServletRequest request
							,@RequestParam(name="eClassCode") String eClassCode
							,@RequestParam(name="memberEmail") String memberEmail) {
		
		Member member = paymentService.getEClassTakeMember(memberEmail);
		EClassApproved eClassApproved = paymentService.getEClassApproved(eClassCode);
		
		
		model.addAttribute("title", "수강신청");
		model.addAttribute("member", member);
		model.addAttribute("eClassApproved", eClassApproved);
		
		
		return "eClass/eClassTake";
	}
	
	//수강신청 insert
	@PostMapping("/signUpForClass")
	public String eClassTake(EClassTake eClassTake, RedirectAttributes reAttr) {
		
		paymentService.addEClassTake(eClassTake);
		reAttr.addAttribute("paymentGroupCode", eClassTake.getPaymentGroupCode());
		
		//위시리스트 삭제 처리
		
		return "redirect:/payment";
	}
	
	
	//결제처리
	@PostMapping("/payment")
	public String payment(Model model, Payment payment, RedirectAttributes reAttr
							,ChallengeGatherPlanDo challengeGatherPlanDo) {
		
		model.addAttribute("title", "결제");
		String paymentGroupCode =payment.getPaymentGroupCode();
		
		log.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%챌린지 게더 플랜두 : {}", challengeGatherPlanDo);
		int result = paymentService.addPayment(payment);
		if(result == 1 && paymentGroupCode.startsWith("c") == true ) {
			challengeEnterService.challengeGatherPlanDoInsert(challengeGatherPlanDo);
		}
		
		reAttr.addAttribute("paymentCode", payment.getPaymentCode());
		
		return "redirect:/mypage/mypaymentList/paymentDetail";
	}
	

	//결제화면
	@GetMapping("/payment")
	public String payment(Model model,@RequestParam(name="paymentGroupCode") String paymentGroupCode) {
		
		model.addAttribute("title", "결제");
		String paymentGoodsName = null;
		int paymentGoodsPrice = 0;
		int paymentGoodsSetDate = 0;
		String memberEmail = null;
		String memberPhone = null;
		
		if(paymentGroupCode.startsWith("e")) {
			Map<String,String> eClassTakeInfo = paymentMapper.getEClassTake(paymentGroupCode);
			String eClassCode = eClassTakeInfo.get("eClassApprovedCode");
			memberEmail = eClassTakeInfo.get("memberEmail");
			memberPhone = eClassTakeInfo.get("memberPhone");
			
			EClassApproved eClass= paymentMapper.getEClassApproved(eClassCode);
			
			if(Objects.nonNull(eClass)) { 
				paymentGoodsName = eClass.geteClassApprovedName(); 
				paymentGoodsPrice = eClass.geteClassApprovedPrice();
				paymentGoodsSetDate = eClass.geteClassApprovedSetDate(); 
			}
			
		}else {
			Map<String,String> challengeEnterInfo = paymentMapper.getCallengeEnter(paymentGroupCode);
			String challengeCode = challengeEnterInfo.get("challengeGatherCode");
			memberEmail = challengeEnterInfo.get("memberEmail");
			
			ChallengeGather challenge = challengeEnterMapper.getChallengeEnterByCode(challengeCode);
			  
			if(Objects.nonNull(challenge)) { 
				paymentGoodsName = challenge.getChallengeGatherName();
				paymentGoodsPrice = challenge.getChallengeEnterDeposit();
				model.addAttribute("challenge", challenge);
			}
			
			List<ChallengeGatherPlan> challengeGatherPlan = challengeGatherMapper.getGatherDatail(challengeCode);
			model.addAttribute("challengeGatherPlan",challengeGatherPlan.get(0));
			
			log.info("challenge : {}", challenge);
			log.info("challengeGatherPlan: {}", challengeGatherPlan.get(0));
		}
		
		Member member = memberMapper.getMemberInfoByEmail(memberEmail);
		
		model.addAttribute("paymentGoodsName", paymentGoodsName);
		model.addAttribute("paymentGoodsPrice", paymentGoodsPrice);
		model.addAttribute("paymentGoodsSetDate", paymentGoodsSetDate);
		model.addAttribute("member", member);
		model.addAttribute("memberPhone", memberPhone);
		model.addAttribute("paymentGroupCode", paymentGroupCode);
		
		return "payment/payment";
	}
	
	
	
	//문자 인증
	@PostMapping("/memberPhoneCheck")
	public @ResponseBody String memberPhoneCheck(@RequestParam(value="to") String to) throws CoolsmsException {
		
		
		return paymentService.PhoneNumberCheck(to);
	}
}

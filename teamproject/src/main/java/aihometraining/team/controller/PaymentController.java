package aihometraining.team.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aihometraining.team.challenge.mapper.ChallengeEnterMapper;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassTake;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.mapper.PaymentMapper;
import aihometraining.team.service.PaymentService;

@Controller
public class PaymentController {
	
	private PaymentService paymentService;
	private PaymentMapper paymentMapper;
	private ChallengeEnterMapper challengeEnterMapper;
	private MemberMapper memberMapper;
	
	public PaymentController(PaymentService paymentService, PaymentMapper paymentMapper
							,ChallengeEnterMapper challengeEnterMapper
							,MemberMapper memberMapper) {
		this.paymentService = paymentService;
		this.paymentMapper = paymentMapper;
		this.challengeEnterMapper = challengeEnterMapper;
		this.memberMapper = memberMapper;
	}
	

	
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
	
	@PostMapping("/signUpForClass")
	public String eClassTake(EClassTake eClassTake, RedirectAttributes reAttr) {
		
		
		//수강신청 insert하기
		paymentService.addEClassTake(eClassTake);
		reAttr.addAttribute("paymentGroupCode", eClassTake.getPaymentGroupCode());
		
		return "redirect:/payment";
	}
	

	//결제화면
	@GetMapping("/payment")
	public String payment(Model model,@RequestParam(name="paymentGroupCode") String paymentGroupCode) {
		
		model.addAttribute("title", "결제");
		String paymentGoodsName = null;
		int paymentGoodsPrice = 0;
		int paymentGoodsSetDate = 0;
		Member member = null;
		
		if(paymentGroupCode.startsWith("e")) {
			//String eClassCode = paymentMapper.getEClassTake(paymentGroupCode);		
			//EClassApproved eClass= paymentMapper.getEClassApproved(eClassCode);
			//paymentMapper.getEClassTakeMember(memberEmail)
			Map<String,String> eClassBy = paymentMapper.getEClassTake(paymentGroupCode);
			
			/*if(Objects.nonNull(eClass)) { 
				paymentGoodsName = eClass.geteClassApprovedName(); 
				paymentGoodsPrice = eClass.geteClassApprovedPrice();
				paymentGoodsSetDate = eClass.geteClassApprovedSetDate(); 
				//member = memberMapper.getMemberInfoByEmail(eClass.getMemberEmail());
			}*/
			 
		}/*else {
			String challengeCode = paymentMapper.getCallengeEnter(paymentGroupCode);
			ChallengeGather challenge=challengeEnterMapper.getChallengeEnterByCode(challengeCode);
			  
			if(Objects.nonNull(challenge)) { 
				paymentGoodsName = challenge.getChallengeGatherName();
				paymentGoodsPrice = challenge.getChallengeEnterDeposit();
			}
			 
		}*/
		
		model.addAttribute("paymentGoodsName", paymentGoodsName);
		model.addAttribute("paymentGoodsPrice", paymentGoodsPrice);
		model.addAttribute("paymentGoodsSetDate", paymentGoodsSetDate);
		model.addAttribute("member", member);
		
		return "payment/payment";
	}
	
	
	
	@PostMapping("/payment")
	public String payment(Model model) {
		
		//결제처리
		model.addAttribute("title", "결제");
		
		return "redirect:/mypage/mypaymentList/paymentDetail";
	}
}

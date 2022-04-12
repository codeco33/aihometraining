package aihometraining.team.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.PaymentMapper;
import aihometraining.team.service.PaymentService;

@Controller
public class PaymentController {
	
	private PaymentService paymentService;
	private PaymentMapper paymentMapper;
	
	public PaymentController(PaymentService paymentService, PaymentMapper paymentMapper) {
		this.paymentService = paymentService;
		this.paymentMapper = paymentMapper;
	}
	
	@GetMapping("/challengeadmin")
	public String challengeadmin(Model model) {
		
		model.addAttribute("title", "챌린지 관리자 페이지");
		
		return "challenge/challengeadmin";
		
	}
	
	//위시리스트
	@SuppressWarnings("null")
	@GetMapping("/wishList")
	public String wishList(Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String SEMAIL = (String) session.getAttribute("SEMAIL");
				
		List<WishList> wishList = paymentService.getWishList(SEMAIL);
			
		model.addAttribute("title", "위시리스트");
		model.addAttribute("wishList", wishList);
		
		return "member/wishList";
	}
	
	//위시리스트 삭제
	@PostMapping("/wishList")
	public String wishList(@RequestParam(name="wishListCode", required = false) String wishListCode) {
		paymentMapper.deleteWishList(wishListCode);
		
		return "redirect:/wishList";
	}
	
	
	
	//수강신청 화면
	@GetMapping("/signUpForClass")
	public String eClassTake(Model model , HttpServletRequest request
							,@RequestParam(name="eClassCode", required = false) String eClassCode
							,@RequestParam(name="memberEmail", required = false) String memberEmail) {
		
		Member member = paymentService.getEClassTakeMember(memberEmail);
		EClassApproved eClassApproved = paymentService.getEClassApproved(eClassCode);
		
		
		model.addAttribute("title", "수강신청");
		model.addAttribute("member", member);
		model.addAttribute("eClassApproved", eClassApproved);
		
		
		return "eClass/eClassTake";
	}
	

	
	@GetMapping("/payment")
	public String payment(Model model) {
		
		
		
		model.addAttribute("title", "결제");
		
		return "payment/payment";
	}
	
	@PostMapping("/payment")
	public String payment(Model model, String a) {
		
		
		model.addAttribute("title", "결제");
		
		return "redirect:/mypage/mypaymentList/paymentDetail";
	}
}

package aihometraining.team.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassTake;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.WishList;
import aihometraining.team.service.PaymentService;

@Controller
public class PaymentController {
	
	private PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@GetMapping("/challengeadmin")
	public String challengeadmin(Model model) {
		
		model.addAttribute("title", "챌린지 관리자 페이지");
		
		return "challenge/challengeadmin";
		
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
							,@RequestParam(name="eClassCode", required = false) String eClassCode
							,@RequestParam(name="memberEmail", required = false) String memberEmail) {
		
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
		
		return "redirect:/payment";
	}
	

	
	@GetMapping("/payment")
	public String payment(Model model) {
		
		//결제화면 model에 담기
		model.addAttribute("title", "결제");
		
		return "payment/payment";
	}
	
	@PostMapping("/payment")
	public String payment(Model model, String a) {
		
		//결제처리
		model.addAttribute("title", "결제");
		
		return "redirect:/mypage/mypaymentList/paymentDetail";
	}
}

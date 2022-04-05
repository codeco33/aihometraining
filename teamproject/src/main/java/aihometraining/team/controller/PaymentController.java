package aihometraining.team.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PaymentController {
	
	
	@GetMapping("/paymentList")
	public String paymentList(Model model) {
		
		
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "결제 내역");
		
		return "payment/paymentList";
	}
	
	@GetMapping("/paymentList/paymentDetail")
	public String paymentDetail(Model model) {
		
		
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "결제 내역");
		model.addAttribute("subTitle", "결제 상세 내역");
		model.addAttribute("layoutDeco", "layout/default");
		
		return "payment/paymentDetail";
	}
	
	@GetMapping("/signUpForClass")
	public String eClassTake(Model model) {
		
		
		
		model.addAttribute("title", "수강신청");
		
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

package aihometraining.team.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {
	
	
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	
	@GetMapping("/paymentList")
	public String paymentList(Model model) {
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "결제 내역");
		
		return "payment/paymentList";
	}
	

}

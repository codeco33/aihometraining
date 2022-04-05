package aihometraining.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RefundController {
	
	@GetMapping("/refundList")
	public String refundList(Model model) {
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "환불 내역");
		
		return "refund/refundList";
	}
	
	@GetMapping("/refundStandard")
	public String refundStandard(Model model) {
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "환불 기준 관리");
		
		return "refund/refundStandard";
	}
	
	@GetMapping("/refundList/refundDetail")
	public String refundDetail(Model model) {
		
		
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "환불 내역");
		model.addAttribute("subTitle", "환불 상세 내역");
		model.addAttribute("layoutDeco", "layout/default");
		
		return "refund/refundDetail";
	}
	
}

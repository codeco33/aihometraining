package aihometraining.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PointController {
	@GetMapping("/givePoint")
	public String givePoint(Model model) {
		
		model.addAttribute("leftMenuList", "포인트");
		model.addAttribute("title", "포인트 지급");
		
		return "point/givePoint";
	}
	
	@GetMapping("/pointList")
	public String pointList(Model model) {
		
		model.addAttribute("leftMenuList", "포인트");
		model.addAttribute("title", "포인트 내역");
		
		return "point/pointList";
	}
	
	@GetMapping("/pointStandard")
	public String pointStandard(Model model) {
		
		model.addAttribute("leftMenuList", "포인트");
		model.addAttribute("title", "포인트 지급 기준");
		
		return "point/pointStandard";
	}
}

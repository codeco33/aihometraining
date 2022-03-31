package aihometraining.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class ReportController {
	@GetMapping("/reportList")
	public String reportList(Model model) {
		
		model.addAttribute("leftMenuList", "신고");
		model.addAttribute("title", "신고 관리자 페이지");
		
		return "report/reportList";
	}
	@GetMapping("/reportStandardList")
	public String reportStandardList(Model model) {
		
		model.addAttribute("leftMenuList", "신고");
		model.addAttribute("title", "신고 기준");
		
		return "report/reportStandardList";
		
	}
}

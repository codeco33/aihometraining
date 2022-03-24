package aihometraining.team.eclassController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class eClassController {
	
	@GetMapping("/eClassApprovedList")
	public String eClassApprovedList(Model model) {
		
		model.addAttribute("title", "개설 승인된 리스트");
		
		return "eClass/eclassApprovedList";
	}
	@GetMapping("/OpenApplyForm")
	public String OpenApplyForm(Model model) {
		
		model.addAttribute("title", "운통클래스 신청폼");
		
		return "eClass/eClassOpenApplyForm";
	}
}

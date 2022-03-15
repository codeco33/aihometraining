package aihometraining.team.challengeConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/challenge/challengeConfig")
public class ChallengeConfigController {
	
	@GetMapping("/configList")
	public String challengeConfigList(Model model) {
		
		model.addAttribute("title", "challengeConfigList");
		model.addAttribute("leftMenuList", "운동클래스");
		return "challenge/challengeConfig/challengeConfigList";
		
	}
}

package aihometraining.team.challenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/challenge/challengeEnter")
public class ChallengeEnterController {
	@GetMapping("/challengeEnterList")
	public String challengeEnterList(Model model) {
		
		model.addAttribute("title", "참가 챌린지 목록");
		
		return "challenge/challengeEnter/challengeEnterList";
		
	}
}

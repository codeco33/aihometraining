package aihometraining.team.challengeGather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/challenge/challengeGather")
public class ChallengeGaterController {
	
	@GetMapping("/challengeGatherList")
	public String challengeGather(Model model) {
		model.addAttribute("title", "챌린지 모집 목록");
		return "challenge/challengeGather/challengeGatherList";
	}
}

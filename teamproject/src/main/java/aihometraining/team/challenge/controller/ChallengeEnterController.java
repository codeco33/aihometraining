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
		model.addAttribute("headerList", "챌린지");
		
		return "challenge/challengeEnter/challengeEnterList";
		
	}
	
	@GetMapping("/challengeEnterDetail")
	public String challengeEnterDetail(Model model) {
		
		model.addAttribute("title", "참가 챌린지 세부정보");
		model.addAttribute("headerList", "챌린지");
		
		return "challenge/challengeEnter/challengeEnterDetail";
		
	}
	
	@GetMapping("/challengePlanDoInsert")
	public String challengePlanDoInsert(Model model) {
		
		model.addAttribute("title", "참가 챌린지 인증하기");
		model.addAttribute("headerList", "챌린지");
		
		return "challenge/challengeEnter/challengePlanDoInsert";
		
	}
	@GetMapping("/challengeEnterPaymemt")
	public String challengeEnterPaymemt(Model model) {
		
		model.addAttribute("title", "챌린지 참가결제");
		model.addAttribute("headerList", "챌린지");
		
		return "challenge/challengeEnter/challengeEnterPaymemt";
		
	}
}

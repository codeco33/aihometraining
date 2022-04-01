package aihometraining.team.challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.dto.ChallengeGather;

@Controller
@RequestMapping("/challenge/challengeEnter")
public class ChallengeEnterController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeEnterController.class);

	
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
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeEnter/challengeEnterPaymemt";
		
	}
	
	@PostMapping("/challengeEnterPaymemt")
	public String challengeEnterPaymemt(ChallengeGather challengeGather) {
		
		log.info("challengeGather 조회  challengeGather : {}", challengeGather);
		
		return null;
		
	}
}

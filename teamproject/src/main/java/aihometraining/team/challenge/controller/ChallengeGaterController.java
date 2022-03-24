package aihometraining.team.challenge.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.challenge.service.ChallengeGatherService;
import aihometraining.team.dto.ChallengeGather;

@Controller
@RequestMapping("/challenge/challengeGather")
public class ChallengeGaterController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeGaterController.class);

	
	//DI 의존성 주입
	private ChallengeGatherService challengeGatherService;
	public ChallengeGaterController(ChallengeGatherService challengeGatherService) {
		this.challengeGatherService = challengeGatherService;
	}
	
	//challengeGatherList
	@GetMapping("/challengeGatherList")
	public String challengeGather(Model model) {
		
		List<ChallengeGather> challengeGatherList = challengeGatherService.getChallengeGatherList();
		
		log.info("챌린지 카테고리 조회  challengeGatherList : {}", challengeGatherList);
		
		model.addAttribute("title", "챌린지 모집 목록");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("challengeGatherList", challengeGatherList);
		return "challenge/challengeGather/challengeGatherList";
	}
	
	//challengeGaterInsert
	@GetMapping("/challengeGatherInsert")
	public String challengeGatherInsert(Model model) {
		
		model.addAttribute("title", "챌린지 모집하기");
		model.addAttribute("headerList", "챌린지");
		
		return "challenge/challengeGather/challengeGatherInsert";
		
	}
}

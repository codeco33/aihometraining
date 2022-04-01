package aihometraining.team.challenge.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.challenge.service.ChallengeGatherService;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlan;

@Controller
@RequestMapping("/challenge/challengeGather")
public class ChallengeGaterController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeGaterController.class);

	
	//DI 의존성 주입
	private ChallengeGatherService challengeGatherService;
	private ChallengeGatherMapper challengeGatherMapper;
	
	public ChallengeGaterController(ChallengeGatherService challengeGatherService, ChallengeGatherMapper challengeGatherMapper) {
		this.challengeGatherService = challengeGatherService;
		this.challengeGatherMapper = challengeGatherMapper;
	}
	
	//test
	@GetMapping("/test")
	public String test(Model model) {
		
		model.addAttribute("test", "test화면");
		
		return "challenge/challengeGather/test";
	}
	
	//challengeGatherAdmin
	@GetMapping("/gatherAdmin")
	public String challengeGatherAdmin(Model model) {
		
		model.addAttribute("title", "모집 챌린지 관리자");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeadmin";
		
	}
	
	//ajax
	/*
	 * @PostMapping("/gatherDetail")
	 * 
	 * @ResponseBody public List<ChallengeGatherPlan>
	 * getGatherDatail(@RequestParam(value = "challengeGatherCode") String
	 * challengeGatherCode) {
	 * 
	 * log.info("요청받은 challengeGatherCode값  challengeGatherCode : {}",
	 * challengeGatherCode);
	 * 
	 * List<ChallengeGatherPlan> gatherDetail =
	 * challengeGatherMapper.getGatherDatail(challengeGatherCode);
	 * 
	 * log.info("챌린지모집 세부내용 조회  gatherDetail : {}", gatherDetail);
	 * 
	 * return gatherDetail;
	 * 
	 * }
	 */
	
	@GetMapping("/gatherDetail")
	@ResponseBody
	public List<ChallengeGatherPlan> getGatherDatail(String challengeGatherCode){
		log.info("챌린지모집 세부내용 조회  challengeGatherCode : {}", challengeGatherCode);
		List<ChallengeGatherPlan> gatherDetail = challengeGatherMapper.getGatherDatail(challengeGatherCode);
		log.info("챌린지모집 세부내용 조회  gatherDetail : {}", gatherDetail);
		return gatherDetail;
		
	}
	
	//challengeGatherList
	@GetMapping("/challengeGatherList")
	public String challengeGather(Model model) {
		
		List<ChallengeGather> challengeGatherList = challengeGatherService.getChallengeGatherList();
		
		log.info("모집챌린지 조회  challengeGatherList : {}", challengeGatherList);
		
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

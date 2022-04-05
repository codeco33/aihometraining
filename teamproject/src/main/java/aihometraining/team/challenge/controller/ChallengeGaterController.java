package aihometraining.team.challenge.controller;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.challenge.service.ChallengeGatherService;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlan;
import aihometraining.team.dto.ChallengeSetting;

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
	@GetMapping("/gatherDetail")
	@ResponseBody
	public List<ChallengeGatherPlan> getGatherDatail(String challengeGatherCode){
		log.info("챌린지모집 세부내용 조회  challengeGatherCode : {}", challengeGatherCode);
		List<ChallengeGatherPlan> gatherDetail = challengeGatherMapper.getGatherDatail(challengeGatherCode);
		log.info("챌린지모집 세부내용 조회  gatherDetail : {}", gatherDetail);
		return gatherDetail;
		
	}
	
	//모집 챌린지 목록 화면
	@GetMapping("/challengeGatherList")
	public String challengeGather(Model model) {
		
		List<ChallengeGather> challengeGatherList = challengeGatherService.getChallengeGatherList();
		
		log.info("모집챌린지 조회  challengeGatherList : {}", challengeGatherList);
		
		model.addAttribute("title", "챌린지 모집 목록");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("challengeGatherList", challengeGatherList);
		return "challenge/challengeGather/challengeGatherList";
	}
	
	//모집 챌린지 등록 화면
	@GetMapping("/challengeGatherInsert")
	public String challengeGatherInsert(Model model) {
		
		//챌린지 카테고리조회
		List<ChallengeCategory> challengeCateList = challengeGatherService.getChallengeCate();
		
		//챌린지 세팅조회
		List<ChallengeSetting> challengeSettingList = challengeGatherService.getChallengeSetting();
		
		model.addAttribute("title", "챌린지 모집하기");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("challengeCateList", challengeCateList);
		model.addAttribute("challengeSettingList", challengeSettingList);
		
		return "challenge/challengeGather/challengeGatherInsert";
		
	}
	
	//모집챌린지 등록처리
	@PostMapping("/challengeGatherInsert")
	public String challengeGatherInsert(ChallengeGather challengeGather) {
		
		log.info("모집챌린지 등록폼에서 입력받은 데이터: {}", challengeGather);
		
		challengeGatherService.challengeGatherInsert(challengeGather);
		
		return "redirect:/challenge/challengeGather/challengeGatherList";
		
	}
	
	
	
	
}

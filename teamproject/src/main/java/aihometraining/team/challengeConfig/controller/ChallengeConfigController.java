package aihometraining.team.challengeConfig.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.challengeConfig.service.ChallengeConfigService;
import aihometraining.team.dto.ChallengeCategory;

@Controller
@RequestMapping("/challenge/challengeConfig")
public class ChallengeConfigController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeConfigController.class);

	
	//DI 의존성 주입
	private ChallengeConfigService challengeConfigService;
	
	public ChallengeConfigController(ChallengeConfigService challengeConfigService) {
		this.challengeConfigService = challengeConfigService;
	}
	
	@GetMapping("/configList")
	public String challengeConfigList(Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberEmail", "id001@email.com");
		
		List<ChallengeCategory> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
		
		paramMap = null;
		
		log.info("챌린지 카테고리 조회  challengeCategoryList : {}", challengeCategoryList);
		
		model.addAttribute("title", "challengeConfigList");
		model.addAttribute("leftMenuList", "챌린지 관리 설정");
		model.addAttribute("challengeCategoryList", challengeCategoryList);
		
		return "challenge/challengeConfig/challengeConfigList";
		
	}
	@GetMapping("/challengeCategoryInsert")
	public String challengeCategoryInsert(Model model) {
		
		model.addAttribute("title", "challengeCategoryInsert");
		model.addAttribute("leftMenuList", "챌린지 카테고리 등록");
		
		return "challenge/challengeConfig/challengeCategoryInsert";
		
	}
	@GetMapping("/challengeSettingInsert")
	public String challengeSettingInsert(Model model) {
		
		model.addAttribute("title", "challengeSettingInsert");
		model.addAttribute("leftMenuList", "챌린지 세팅 등록");
		
		return "challenge/challengeConfig/challengeSettingInsert";
		
	}
	@GetMapping("/challengeList")
	public String challengeList(Model model) {
		
		model.addAttribute("title", "challengeList");
		model.addAttribute("leftMenuList", "모집 챌린지 목록");
		
		return "challenge/challengeConfig/challengeList";
		
	}
	@GetMapping("/challengeListIng")
	public String challengeListIng(Model model) {
		
		model.addAttribute("title", "challengeListIng");
		model.addAttribute("leftMenuList", "진행 챌린지 목록");
		
		return "challenge/challengeConfig/challengeListIng";
		
	}
	@GetMapping("/challengePoint")
	public String challengePoint(Model model) {
		
		model.addAttribute("title", "challengePoint");
		model.addAttribute("leftMenuList", "챌린지 포인트 관리");
		
		return "challenge/challengeConfig/challengePoint";
		
	}
	@GetMapping("/challengeReportList")
	public String challengeReportList(Model model) {
		
		model.addAttribute("title", "challengeReportList");
		model.addAttribute("leftMenuList", "챌린지 신고 관리");
		
		return "challenge/challengeConfig/challengeReportList";
		
	}
	
}

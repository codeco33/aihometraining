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

import aihometraining.team.challenge.service.ChallengeConfigService;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.mapper.CommonMapper;

@Controller
@RequestMapping("/challenge/challengeConfig")
public class ChallengeConfigController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeConfigController.class);

	
	//DI 의존성 주입
	private ChallengeConfigService challengeConfigService;
	
	public ChallengeConfigController(ChallengeConfigService challengeConfigService) {
		this.challengeConfigService = challengeConfigService;
		
	}
	
	//관리설정test
	@GetMapping("/test")
	public String test(Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberEmail", "id001@email.com");
		
		//List<ChallengeCategory> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
		List<Map<String, Object>> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
		
		paramMap = null;
		
		log.info("챌린지 카테고리 조회  challengeCategoryList : {}", challengeCategoryList);
		
		model.addAttribute("title", "챌린지 관리 설정");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("challengeCategoryList", challengeCategoryList);
		
		return null;
		
	}
	
	//챌린지 관리설정
	@GetMapping("/configList")
	public String challengeConfigList(Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberEmail", "id001@email.com");
		
		//List<ChallengeCategory> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
		List<Map<String, Object>> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
		
		paramMap = null;
		
		log.info("챌린지 카테고리 조회  challengeCategoryList : {}", challengeCategoryList);
		
		model.addAttribute("title", "챌린지 관리 설정");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("challengeCategoryList", challengeCategoryList);
		
		return "challenge/challengeConfig/challengeConfigList";
		
	}
	
	//챌린지 카테고리 등록폼
	@GetMapping("/challengeCategoryInsert")
	public String challengeCategoryInsert(Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberEmail", "id001@email.com");
		
		//운동클래스카테고리small 조회
		List<EClassCategorySmall> classCategoryList = challengeConfigService.getClassCategoryList();
		
		paramMap = null;
		
		log.info("운동클래스카테고리small 조회  classCategoryList : {}", classCategoryList);
		
		model.addAttribute("title", "챌린지 카테고리 등록");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("classCategoryList", classCategoryList);
		
		return "challenge/challengeConfig/challengeCategoryInsert";
		
	}
	
	//챌린지 카테고리 등록 처리
	@PostMapping("/challengeCategoryInsert")
	public String challengeCategoryInsert(ChallengeCategory challengeCategory) {
		
		log.info("챌린지 카테고리 등록 폼에서 입력받은 데이터: {}", challengeCategory); //받은 내용이 여기{}에 담긴다.
		
		challengeConfigService.challengeCategoryInsert(challengeCategory);
		
		return "redirect:/challenge/challengeConfig/configList";
		
	}
	
	//챌린지 카테고리 수정화면
	@GetMapping("/challengeCategoryUpdate")
	public String challengeCategoryUpdate(Model model
										, @RequestParam(name="challengeCategoryCode", required = false) String challengeCategoryCode) {
		
		log.info("챌린지 카테고리 수정화면 폼 쿼리 스트링 challengeCategoryCode : {}", challengeCategoryCode);
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("memberEmail", "id001@email.com"); //로그인 처리가 아직 안되서 임시로 넣은값
		
		//카테고리 코드별 챌린지 카테고리 정보 조회
		ChallengeCategory challengeCategory = challengeConfigService.getChallengeCategoryByCode(challengeCategoryCode);
		
		//운동클래스카테고리small 조회
		List<EClassCategorySmall> classCategoryList = challengeConfigService.getClassCategoryList();
		
		paramMap = null;
		
		log.info("카테고리 코드별 챌린지 카테고리 정보 조회  challengeCategory : {}", challengeCategory);
		log.info("운동클래스카테고리small 조회  classCategoryList : {}", classCategoryList);
		
		model.addAttribute("title", "챌린지 카테고리 수정");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("challengeCategory", challengeCategory);
		model.addAttribute("classCategoryList", classCategoryList);
		
		return "challenge/challengeConfig/challengeCategoryUpdate";
	}
	
	//챌린지 카테고리 수정처리
	@PostMapping("/challengeCategoryUpdate")
	public String challengeCategoryUpdate(ChallengeCategory challengeCategory) {
		
		log.info("챌린지 카테고리 수정 폼에서 입력받은 데이터: {}", challengeCategory); //받은 내용이 여기{}에 담긴다.
		
		challengeConfigService.challengeCategoryUpdate(challengeCategory);
		
		return "redirect:/challenge/challengeConfig/configList";
	}
	
	//챌린지 세팅 등록
	@GetMapping("/challengeSettingInsert")
	public String challengeSettingInsert(Model model) {
		
		model.addAttribute("title", "챌린지 세팅 등록");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeConfig/challengeSettingInsert";
		
	}
	
	//챌린지 모집 중인 목록
	@GetMapping("/challengeList")
	public String challengeList(Model model) {
		
		model.addAttribute("title", "모집 챌린지 목록");
		model.addAttribute("leftMenuList", "모집");
		
		return "challenge/challengeConfig/challengeList";
		
	}
	
	//진행중인 챌린지 목록
	@GetMapping("/challengeListIng")
	public String challengeListIng(Model model) {
		
		model.addAttribute("title", "진행 챌린지 목록");
		model.addAttribute("leftMenuList", "진행");
		
		return "challenge/challengeConfig/challengeListIng";
		
	}
	
	//챌린지 포인트 관리
	@GetMapping("/challengePoint")
	public String challengePoint(Model model) {
		
		model.addAttribute("title", "챌린지 포인트 관리");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeConfig/challengePoint";
		
	}
	
	/**
	 * 챌린지 신고 관리
	 * 
	 */
	@GetMapping("/challengeReportList")
	public String challengeReportList(Model model) {
		
		model.addAttribute("title", "챌린지 신고 관리");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeConfig/challengeReportList";
		
	}
	
}

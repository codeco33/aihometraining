package aihometraining.team.challenge.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.challenge.service.ChallengeConfigService;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengePointGive;
import aihometraining.team.dto.ChallengeSetting;
import aihometraining.team.dto.EClassCategorySmall;

@Controller
@RequestMapping("/admin")
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
		public String challengeConfigList(Model model  
										 ,@RequestParam(value="searchKey", required = false) String searchKey
										 ,@RequestParam(value="searchValue", required = false) String searchValue
										 ,@RequestParam(value="searchDate", required = false) String searchDate
										 ,@RequestParam(value="searchStart", required = false) String searchStart
										 ,@RequestParam(value="searchEnd", required = false) String searchEnd
										 ,@RequestParam(value="searchKey2", required = false) String searchKey2
										 ,@RequestParam(value="searchValue2", required = false) String searchValue2) {
			
			Map<String, Object> paramMap = new HashMap<String, Object>();
			/* paramMap.put("memberEmail", "id001@email.com"); */
			//searchKey = challengeCategoryName challengeCategoryName(property) -> challengeCategoryName(colum) => searchKey = challengeCategoryName
			//searchKey = eClassCategorySmallName eClassCategorySmallName(property) -> eClassCategorySmallName(colum) => searchKey = eClassCategorySmallName
			
			if(searchKey != null) {
				if("challengeCategoryName".equals(searchKey)) {
					searchKey = "challengeCategoryName";
					searchDate = "challengeCategoryRegDate";
				}else if("eClassCategorySmallName".equals(searchKey)) {
					searchKey = "eClassCategorySmallName";
					searchDate = "challengeCategoryRegDate";
				}
			}
			if(searchKey2 != null) {
				if("challengeSettingCode".equals(searchKey2)) {
					searchKey2 = "challengeSettingCode";
				}else if("challengeSettingUpdateDo".equals(searchKey2)) {
					searchKey2 = "challengeSettingUpdateDo";
				}
			}
			
			paramMap.put("searchKey", searchKey);
			paramMap.put("searchValue", searchValue);
			paramMap.put("searchKey2", searchKey2);
			paramMap.put("searchValue2", searchValue2);
			paramMap.put("searchDate", searchDate);
			paramMap.put("searchStart", searchStart);
			paramMap.put("searchEnd", searchEnd);
			
			//List<ChallengeCategory> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
			List<Map<String, Object>> challengeCategoryList =  challengeConfigService.getChallengeCategoryList(paramMap);
			List<Map<String, Object>> challengeSettingList = challengeConfigService.getChallengeSettingList(paramMap);
			
			paramMap = null;
			
			log.info("챌린지 카테고리 조회  challengeCategoryList : {}", challengeCategoryList);
			
			model.addAttribute("title", "챌린지 관리 설정");
			model.addAttribute("leftMenuList", "챌린지");
			model.addAttribute("challengeCategoryList", challengeCategoryList);
			model.addAttribute("challengeSettingList", challengeSettingList);
			return "challenge/challengeConfig/challengeConfigList";
			
		}
	
	//챌린지 카테고리 등록폼
	@GetMapping("/challengeCategoryInsert")
	public String challengeCategoryInsert(Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		/* paramMap.put("memberEmail", "id001@email.com"); */
		
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
	public String challengeCategoryInsert(ChallengeCategory challengeCategory, HttpSession session) {
		
		log.info("챌린지 카테고리 등록 폼에서 입력받은 데이터: {}", challengeCategory); //받은 내용이 여기{}에 담긴다.
		
		String sEmail = (String) session.getAttribute("SEMAIL");
		
		challengeConfigService.challengeCategoryInsert(challengeCategory, sEmail);
		
		return "redirect:/admin/configList";
		
	}
	
	//챌린지 카테고리 수정화면
	@GetMapping("/challengeCategoryUpdate")
	public String challengeCategoryUpdate(Model model
										, @RequestParam(name="challengeCategoryCode", required = false) String challengeCategoryCode) {
		
		log.info("챌린지 카테고리 수정화면 폼 쿼리 스트링 challengeCategoryCode : {}", challengeCategoryCode);
		
		
		
		//카테고리 코드별 챌린지 카테고리 정보 조회
		ChallengeCategory challengeCategory = challengeConfigService.getChallengeCategoryByCode(challengeCategoryCode);
		
		//운동클래스카테고리small 조회
		List<EClassCategorySmall> classCategoryList = challengeConfigService.getClassCategoryList();
		
		
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
	public String challengeCategoryUpdate(ChallengeCategory challengeCategory, HttpSession session) {
		
		log.info("챌린지 카테고리 수정 폼에서 입력받은 데이터: {}", challengeCategory); //받은 내용이 여기{}에 담긴다.
		
		String sEmail = (String) session.getAttribute("SEMAIL");
		
		challengeConfigService.challengeCategoryUpdate(challengeCategory, sEmail);
		
		return "redirect:/admin/configList";
	}
	
	//챌린지 카테고리 삭제처리
	@GetMapping("/challengeCategoryDelete")
	public String challengeCategoryDelete(Model model
										, @RequestParam(name="challengeCategoryCode", required = false) String challengeCategoryCode) {
		
		log.info("챌린지 카테고리 삭제버튼 눌렀을때 스트링 값 challengeCategoryCode : {}", challengeCategoryCode);
		
		//챌린지 카테고리 코드에 따른 신고내역 삭제(챌린지 카테고리 삭제처리 )
		challengeConfigService.categoryDeleteBycateCode(challengeCategoryCode);
		
		return "redirect:/admin/configList";
		
	}
	
	//챌린지 세팅 등록
	@GetMapping("/challengeSettingInsert")
	public String challengeSettingInsert(Model model) {
		
		model.addAttribute("title", "챌린지 세팅 등록");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeConfig/challengeSettingInsert";
		
	}
	
	//챌린지 세팅 등록 처리
	@PostMapping("/challengeSettingInsert")
	public String challengeSettingInsert(ChallengeSetting challengeSetting) {
		
		log.info("챌린지 세팅  폼에서 입력받은 데이터: {}", challengeSetting);
		
		challengeConfigService.challengeSettingInsert(challengeSetting);
		
		return "redirect:/admin/configList";
		
	}
	
	//챌린지 세팅 수정 화면
	@GetMapping("/challengeSettingUpdate")
	public String chllengeSettingUpdate(Model model, @RequestParam(name="challengeSettingCode", required = false) String challengeSettingCode) {
		
		log.info("챌린지 세팅 수정화면 폼 쿼리 스트링 challengeSettingCode : {}", challengeSettingCode);
		
		//챌린지 세팅 코드 별 세팅정보 조회
		ChallengeSetting challengeSetting = challengeConfigService.getChallengeSettingByCode(challengeSettingCode);
		
		model.addAttribute("title", "챌린지 수정 화면");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("challengeSetting", challengeSetting);
		
		return "challenge/challengeConfig/challengeSettingUpdate";
		
	}
	
	//챌린지 세팅 수정 처리
	@PostMapping("/challengeSettingUpdate")
	public String chllengeSettingUpdate(ChallengeSetting challengeSetting) {
		
		log.info("챌린지 세팅 수정 폼에서 입력받은 데이터 challengeSetting : {}", challengeSetting);
		
		challengeConfigService.challengeSettingUpdate(challengeSetting);
		
		return "redirect:/admin/configList";
		
	}
	
	//챌린지 모집 중인 목록
	@GetMapping("/challengeList")
	public String challengeList(Model model
							   ,@RequestParam(value="searchKey", required = false) String searchKey
							   ,@RequestParam(value="searchValue", required = false) String searchValue
							   ,@RequestParam(value="searchDate", required = false) String searchDate
							   ,@RequestParam(value="searchStart", required = false) String searchStart
							   ,@RequestParam(value="searchEnd", required = false) String searchEnd
							   ,@RequestParam(value="gatherStartDate", required = false) String gatherStartDate
							   ,@RequestParam(value="gatherEndDate", required = false) String gatherEndDate) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		if(searchKey != null) {
			if("challengeGatherCode".equals(searchKey)) {
				searchKey = "challengeGatherCode";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						gatherStartDate = "challengeGatherStartDate";
						gatherEndDate = "challengeGatherEndDate";
					}
				}
			}else if("memberEmail".equals(searchKey)) {
				searchKey = "cg.memberEmail";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						gatherStartDate = "challengeGatherStartDate";
						gatherEndDate = "challengeGatherEndDate";
					}
				}
			}else if("challengeCategoryName".equals(searchKey)) {
				searchKey = "challengeCategoryName";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						gatherStartDate = "challengeGatherStartDate";
						gatherEndDate = "challengeGatherEndDate";
					}
				}
			}else if("challengeGatherName".equals(searchKey)) {
				searchKey = "challengeGatherName";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						gatherStartDate = "challengeGatherStartDate";
						gatherEndDate = "challengeGatherEndDate";
					}
				}
			}
		}
		
		
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchDate", searchDate);
		paramMap.put("gatherStartDate", gatherStartDate);
		paramMap.put("searchStart", searchStart);
		paramMap.put("searchEnd", searchEnd);
		paramMap.put("gatherEndDate", gatherEndDate);
		
		List<Map<String, Object>> gatherList = challengeConfigService.getGetherList(paramMap);
		
		paramMap = null;
		
		log.info("모집챌린지 gatherList : {}", gatherList);
		
		model.addAttribute("title", "모집 챌린지 목록");
		model.addAttribute("leftMenuList", "모집");
		model.addAttribute("gatherList", gatherList);
		
		return "challenge/challengeConfig/challengeList";
		
	}
	
	//ajax 챌린지 모집 목록 자세한 내용 조회
	@PostMapping("/listDetail")
	@ResponseBody
	public List<ChallengeGather> getListDetailByCode(String challengeGatherCode){
		
		log.info("모집챌린지 String challengeGatherCode : {}", challengeGatherCode);
		
		List<ChallengeGather> listDetail = challengeConfigService.getListDetailByCode(challengeGatherCode);
		log.info("모집 챌린지 세부 내용 조회 ListDetail : {}", listDetail);
		
		return listDetail;
		
	}
	
	//진행중인 챌린지 목록
	@GetMapping("/challengeListIng")
	public String challengeListIng(Model model
								   ,@RequestParam(value="searchKey", required = false) String searchKey
								   ,@RequestParam(value="searchValue", required = false) String searchValue
								   ,@RequestParam(value="searchDate", required = false) String searchDate
								   ,@RequestParam(value="ingStartDate", required = false) String ingStartDate
								   ,@RequestParam(value="searchStart", required = false) String searchStart
								   ,@RequestParam(value="searchEnd", required = false) String searchEnd
								   ,@RequestParam(value="ingEndDate", required = false) String ingEndDate) {
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		if(searchKey != null) {
			if("challengeGatherCode".equals(searchKey)) {
				searchKey = "challengeGatherCode";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						ingStartDate = "challengeGatherStartDate";
						ingEndDate = "challengeGatherEndDate";
					}
				}
			}else if("memberEmail".equals(searchKey)) {
				searchKey = "cg.memberEmail";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						ingStartDate = "challengeGatherStartDate";
						ingEndDate = "challengeGatherEndDate";
					}
				}
			}else if("challengeCategoryName".equals(searchKey)) {
				searchKey = "challengeCategoryName";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						ingStartDate = "challengeGatherStartDate";
						ingEndDate = "challengeGatherEndDate";
					}
				}
			}else if("challengeGatherName".equals(searchKey)) {
				searchKey = "challengeGatherName";
				if(searchDate != null) {
					if("challengeGatherRegDate".equals(searchDate)) {
						searchDate = "challengeGatherRegDate";
					}else{
						ingStartDate = "challengeGatherStartDate";
						ingEndDate = "challengeGatherEndDate";
					}
				}
			}
		}
		
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchDate", searchDate);
		paramMap.put("ingStartDate", ingStartDate);
		paramMap.put("searchStart", searchStart);
		paramMap.put("searchEnd", searchEnd);
		paramMap.put("ingEndDate", ingEndDate);
		
		List<Map<String, Object>> challengeIngList = challengeConfigService.getChallengeIngList(paramMap);
		
		paramMap = null;
		
		log.info("진행 챌린지 목록 조회 challengeIngList: {}", challengeIngList);
		
		model.addAttribute("title", "진행 챌린지 목록");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("challengeIngList", challengeIngList);
		
		return "challenge/challengeConfig/challengeListIng";
		
	}
	
	//챌린지 포인트 관리
	@GetMapping("/challengePoint")
	public String challengePoint(Model model
							   ,@RequestParam(value="searchKey", required = false) String searchKey
							   ,@RequestParam(value="searchValue", required = false) String searchValue
							   ,@RequestParam(value="searchDate", required = false) String searchDate
							   ,@RequestParam(value="searchStart", required = false) String searchStart
							   ,@RequestParam(value="searchEnd", required = false) String searchEnd) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		if(searchKey != null) {
			if("challengeCategoryName".equals(searchKey)) {
				searchKey = "challengeCategoryName";
				searchDate = "challengeCategoryRegDate";
			}else if("eClassCategorySmallName".equals(searchKey)) {
				searchKey = "eClassCategorySmallName";
				searchDate = "challengeCategoryRegDate";
			}
		}
		
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchDate", searchDate);
		paramMap.put("searchStart", searchStart);
		paramMap.put("searchEnd", searchEnd);
		
		//챌린지 포인트 관리 목록 조회
		List<Map<String, Object>> pointList = challengeConfigService.getChallengePointList(paramMap);
		
		paramMap = null;
		
		log.info("챌린지 포인트 목록 조회 pointList: {}", pointList);
		
		model.addAttribute("title", "챌린지 포인트 관리");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("pointList", pointList);
		
		return "challenge/challengeConfig/challengePoint";
	}
	
	//ajax
	//챌린지 포인트 코드별 포인트 관리 세부 조회
	@PostMapping("/pointDetail")
	@ResponseBody
	public List<ChallengePointGive> getPointDetailByCode(String challengePointGiveCode){
		
		log.info("챌린지 포인트 관리 String challengePointGiveCode : {}", challengePointGiveCode);
		
		List<ChallengePointGive> pointDetailList = challengeConfigService.getPointDetailByCode(challengePointGiveCode);
		
		return pointDetailList;
	}
	//챌린지 포인트지급 페이지로 연결(수경님)
	@PostMapping("/challengePoint")
	public String challengePointGiveUpdate(ChallengePointGive challengePointGive) {
		log.info("모달에서 보낸 값 조회  challengePointGive : {}", challengePointGive);
		
		return "point/givePoint";
		
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

package aihometraining.team.eclassController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import aihometraining.team.challenge.controller.ChallengeConfigController;
import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.EClassCategoryMedium;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.dto.EClassOpenApplyForm;
import aihometraining.team.dto.EClassQuestion;
import aihometraining.team.dto.EClassSectionCurriculum;
import aihometraining.team.dto.EClassSectionTitle;
import aihometraining.team.eclassService.eClassService;

@Controller
public class eClassController {
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeConfigController.class);
	
	private eClassService eClassService;
	private EClassCategoryLarge eClassCategoryLarge;
	private EClassCategoryMedium eClassCategoryMedium;
	private EClassCategorySmall eClassCategorySmall;
	
	public eClassController( eClassService eClassService
							,EClassCategoryLarge eClassCategoryLarge
							,EClassCategoryMedium eClassCategoryMedium
							,EClassCategorySmall eClassCategorySmall) {
		this.eClassService = eClassService;
		this.eClassCategoryLarge = eClassCategoryLarge;
		this.eClassCategoryMedium = eClassCategoryMedium;
		this.eClassCategorySmall = eClassCategorySmall;
	}
	
	@GetMapping("/eClassApprovedList")
	public String eClassApprovedList(Model model) {
		
		model.addAttribute("title", "개설 승인된 리스트");
		
		return "eClass/eclassApprovedList";
	}
	
	@GetMapping("/OpenApplyForm")
	public String OpenApplyForm(Model model) {
		
		/*
		 * model.addAttribute("title", "운통클래스 신청폼");
		 * model.addAttribute("eclasscategorylargeList", eClassCategoryLarge);
		 * model.addAttribute("eClassCategoryMediumList", eClassCategoryMedium);
		 * model.addAttribute("eClassCategorySmallList", eClassCategorySmall);
		 */
		
		return "eClass/eClassOpenApplyForm";
	}
	@PostMapping("/EClassOpenApplyForm")
	public String EClassOpenApplyFormInsert( Model model
											,EClassOpenApplyForm eClassOpenApplyForm
											,EClassApproved eClassApproved
											,EClassIntroduce eClassIntroduce
											,EClassSectionTitle eClassSectionTitle
											,EClassSectionCurriculum eClassSectionCurriculum
											,EClassQuestion eClassQuestion
											,EClassAnswer eClassAnswer) {
		
		log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassApproved,eClassIntroduce,eClassSectionTitle,eClassSectionCurriculum,eClassQuestion,eClassAnswer);
		
		eClassService.EClassOpenApplyFormInsert(eClassOpenApplyForm, eClassApproved,eClassIntroduce,eClassSectionTitle,eClassSectionCurriculum,eClassQuestion,eClassAnswer);
		
		model.addAttribute("title", "개설신청 완료");
		
		return "";
	}
	
	@GetMapping("/eClassApproved")
	public String eClassApproved(Model model) {
	
		model.addAttribute("title", "개설 승인된 클래스");
		
		return "eClass/eClassApproved";
	}
	
	@GetMapping("/eClassOpenApplyadminList")
	public String eClassOpenApplyadminList(Model model) {
		
		model.addAttribute("title", "개설 신청 리스트");
		
		return "eClass/eClassOpenApplyadminList";
	}
	
	@GetMapping("/eClassApplyadminList")
	public String eClassApplyadminList(Model model) {
		
		model.addAttribute("title", "관리자 운동클래스목록");
		
		return "eClass/eClassApplyadminList";
	}
	
	@GetMapping("/myApplyList")
	public String MyApplyList(Model model) {
			
		model.addAttribute("title", "나의 개설신청 현황");
		
		return "/eClass/myEClassApplyList";
	}
	
	@GetMapping("/myeClassList")
	public String myeClassList(Model model) {
		
		model.addAttribute("title", "내 운동클래스");
		
		return "/eClass/myeClassList";
	}
	
}

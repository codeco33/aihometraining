package aihometraining.team.eClassController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.dto.EClassQuestion;
import aihometraining.team.dto.EClassSectionCurriculum;
import aihometraining.team.dto.EClassSectionTitle;
import aihometraining.team.eclassService.eClassService;
import aihometraining.team.mapper.EClassMapper;

@Controller
public class eClassController {
	
	private static final Logger log = LoggerFactory.getLogger(eClassController.class);
	
	private eClassService eClassService;
	private EClassMapper eClassMapper;
	
	public eClassController( eClassService eClassService, EClassMapper eClassMapper) {
		
		this.eClassService = eClassService;
		this.eClassMapper = eClassMapper;
	}
	
	@GetMapping("/eClassApprovedList")
	public String eClassApprovedList(Model model) {
		
		model.addAttribute("title", "개설 승인된 리스트");
		
		return "eClass/eclassApprovedList";
	}
	
	@GetMapping("/OpenApplyForm")
	public String OpenApplyForm(Model model) {
		
		//운동 클래스 카테고리 조회
		List<EClassCategorySmall> eClassCategoryLargeList = eClassService.eClassCategoryLargeList();
		List<EClassCategorySmall> eClassCategoryMediumList = eClassService.eClassCategoryMediumList();
		
		log.info("eClassController.javaOpenAppleyForm 데이터: {}", eClassCategoryLargeList); //받은 내용이 여기{}에 담긴다.
		log.info("eClassController.javaOpenAppleyForm 데이터: {}", eClassCategoryMediumList); //받은 내용이 여기{}에 담긴다.

		
		model.addAttribute("title", "운통클래스 신청폼");
		model.addAttribute("eClassCategoryLargeList", eClassCategoryLargeList);
		model.addAttribute("eClassCategoryMediumList", eClassCategoryMediumList);
		
		return "eClass/eClassOpenAppleyForm";
	}
	
	@PostMapping("/CategoryLarge")
	@ResponseBody
	public List<EClassCategorySmall> EClassLarge(@RequestParam(value="eClassCategoryLargeCode", required = false) String eClassCategoryLargeCode){
		
		log.info("eClassController EClassLarge 데이터: {}", eClassCategoryLargeCode);
		
		List<EClassCategorySmall> categoryLarge = eClassMapper.eClassCategoryLarge(eClassCategoryLargeCode);
		
		return categoryLarge;
	}
	@PostMapping("/CategoryMedium")
	@ResponseBody
	public List<EClassCategorySmall> EClassMedium (@RequestParam(value = "eClassCategoryMediumCode", required = false) String eClassCategoryMediumCode){
	
		List<EClassCategorySmall> categoryMedium = eClassMapper.eClassCategoryMedium(eClassCategoryMediumCode);
		
		return categoryMedium;
	}
	
	@GetMapping("/openAppley")
	public String EClassOpenAppleyFormInsert( EClassCategorySmall eClassCategorySmall
											, EClassIntroduce eClassIntroduce
											, EClassSectionTitle eClassSectionTitle
											, EClassSectionCurriculum eClassSectionCurriculum
											, EClassQuestion eClassQuestion
											, EClassAnswer eClassAnswer
											, EClassApproved eClassApproved
											, HttpSession session) {
		
		
		  String mamberEmail = (String) session.getAttribute("SEMAIL");
		  eClassService.EClassIntroduceInsert(eClassIntroduce, mamberEmail);
		  eClassService.EClassSectionTitleInsert(eClassSectionTitle, mamberEmail);
		  eClassService.EClassSectionCurriculumInsert(eClassSectionCurriculum, mamberEmail, eClassSectionTitle);
		  eClassService.EClassQuestionInsert(eClassQuestion, mamberEmail);
		  eClassService.EClassAnswerInsert(eClassAnswer, mamberEmail, eClassQuestion);
		  eClassService.EClassPriceInsert( eClassApproved
				  						 , eClassCategorySmall
				  						 , mamberEmail 
				  						 , eClassIntroduce 
				  						 , eClassSectionTitle 
				  						 , eClassSectionCurriculum 
				  						 , eClassQuestion 
				  						 , eClassAnswer);
		  
		  log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassCategorySmall);
		  log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassIntroduce);
		  log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassSectionTitle);
		  log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassSectionCurriculum);
		  log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassQuestion);
		  log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassAnswer);
		 
		return "redirect:/eClassOpenAppleyComplete";
	}
	
	@GetMapping("/openAppleyUpdate")
	public String EClassOpenAppleyFormUpdate(Model model
											,@RequestParam(value = "eClassApprovedCode",required = false)String eclassapprovedCode) {

			EClassApproved eClassApproved = eClassService.eClassApprovedByCode(eclassapprovedCode);
		
			//운동 클래스 카테고리 조회
			List<EClassCategorySmall> eClassCategoryLargeList = eClassService.eClassCategoryLargeList();
			List<EClassCategorySmall> eClassCategoryMediumList = eClassService.eClassCategoryMediumList();
			
			log.info("eClassController.EClassOpenAppleyFormUpdate eClassCategoryLargeList 데이터: {}", eClassCategoryLargeList); //받은 내용이 여기{}에 담긴다.
			log.info("eClassController.EClassOpenAppleyFormUpdate eClassCategoryMediumList 데이터: {}", eClassCategoryMediumList); //받은 내용이 여기{}에 담긴다.
			log.info("eClassController.EClassOpenAppleyFormUpdate eClassApproved 데이터: {}", eClassApproved); //받은 내용이 여기{}에 담긴다.
			
			model.addAttribute("title", "운통클래스 신청 폼 수정화면");
			model.addAttribute("eClassCategoryLargeList", eClassCategoryLargeList);
			model.addAttribute("eClassCategoryMediumList", eClassCategoryMediumList);
			model.addAttribute("eClassApproved", eClassApproved);
			
			
		return "eClass/eClassOpenAppleyFormUpdate";
	}
	
	@GetMapping("/AppleyUpdate")
	public String EClassAppleyFormUpdate( EClassCategorySmall eClassCategorySmall
										, EClassIntroduce eClassIntroduce
										, EClassSectionTitle eClassSectionTitle
										, EClassSectionCurriculum eClassSectionCurriculum
										, EClassQuestion eClassQuestion
										, EClassAnswer eClassAnswer
										, EClassApproved eClassApproved
										, HttpSession session) {
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터 : {}",eClassCategorySmall);
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터 eClassIntroduce.geteClassIntroduceCode() : {}",eClassIntroduce.geteClassIntroduceCode());
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터 eClassSectionTitle.geteClassSectionTitleCode() : {}",eClassSectionTitle.geteClassSectionTitleCode());
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터 eClassSectionCurriculum.geteClassSectionCurriculumCode() : {}",eClassSectionCurriculum.geteClassSectionCurriculumCode());
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터eClassQuestion.geteClassQuestionCode() : {}",eClassQuestion.geteClassQuestionCode());
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터eClassAnswer.geteClassAnswerCode() : {}",eClassAnswer.geteClassAnswerCode());
		log.info("운동클래스 신청 수정폼에서 입력 받은 데이터eClassApproved.geteClassApprovedCode() : {}",eClassApproved.geteClassApprovedCode());
		
		String mamberEmail = (String) session.getAttribute("SEMAIL");

		eClassService.EClassIntroduceUpdate(eClassIntroduce, mamberEmail);
		eClassService.EClassSectionTitleUpdate(eClassSectionTitle, mamberEmail);
		eClassService.EClassSectionCurriculumUpdate(eClassSectionCurriculum, mamberEmail);
		eClassService.EClassQuestionUpdate(eClassQuestion, mamberEmail);
		eClassService.EClassAnswerUpdate(eClassAnswer, mamberEmail);
		eClassService.EClassPriceUpdate(eClassApproved
									  , eClassCategorySmall
									  , mamberEmail 
									  , eClassIntroduce 
									  , eClassSectionTitle 
									  , eClassSectionCurriculum 
									  , eClassQuestion 
									  , eClassAnswer);



		return "redirect:/myEClassApplyList";
	}
	@GetMapping("/openAppleyDelete")
	public String EClassAppleyFormDelete( EClassIntroduce eClassIntroduce
										, EClassSectionTitle eClassSectionTitle
										, EClassSectionCurriculum eClassSectionCurriculum
										, EClassQuestion eClassQuestion
										, EClassAnswer eClassAnswer
										, EClassApproved eClassApproved) {
		
		eClassMapper.EClassIntroduceDelete(eClassIntroduce);
		eClassMapper.EClassSectionTitleDelete(eClassSectionTitle);
		eClassMapper.EClassSectionCurriculumDelete(eClassSectionCurriculum);
		eClassMapper.EClassQuestionDelete(eClassQuestion);
		eClassMapper.EClassAnswerDelete(eClassAnswer);
		eClassMapper.EClassPriceDelete(eClassApproved);
		
		return "redirect:/myEClassApplyList";
	}
	
	@GetMapping("/eClassOpenAppleyComplete") 
	public String complete (Model model) {
	  
		model.addAttribute("title", "신청완료");
		  
		return "eClass/eClassOpenAppleyComplete"; 
	
	}
	 
	@GetMapping("/eClassApproved")
	public String eClassApproved(Model model) {
	
		model.addAttribute("title", "개설 승인된 클래스");
		
		return "eClass/eClassApproved";
	}
	
	@GetMapping("/eClassOpenApplyadminList")
	public String eClassOpenApplyadminList(Model model
										  ,EClassApproved eClassApproved) {
		
		List<EClassApproved> adminList = eClassService.eClassOpenAppleyadminList(eClassApproved);
		
		model.addAttribute("title", "개설 신청 관리자 리스트");
		model.addAttribute("adminList", adminList);
		
		return "eClass/eClassOpenApplyadminList";
	}
	
	@GetMapping("/eClassApplyadminList")
	public String eClassApplyadminList(Model model) {
		
		model.addAttribute("title", "승인된 운동클래스 목록(관리자)");
		
		return "eClass/eClassApprovedadminList";
	}
	
	@GetMapping("/myApplyList")
	public String MyApplyList(Model model
							 ,EClassApproved eClassApproved
							 ,HttpSession session) {
		
		String eClassOpenAppleyMemberEmail = (String) session.getAttribute("SEMAIL");
		
		List<EClassApproved> eClassOpenAppleyList = eClassService.MyApplyList(eClassOpenAppleyMemberEmail);
		
		log.info("eClassOpenAppleyList MyApplyList eClassOpenAppleyMemberEmail : {}",eClassOpenAppleyMemberEmail);
		log.info("eClassOpenAppleyList MyApplyList eClassOpenAppleyMemberEmail : {}",eClassOpenAppleyList);
		
		model.addAttribute("title", "나의 개설신청 현황");
		model.addAttribute("eClassOpenAppleyList", eClassOpenAppleyList);
		
		
		return "eClass/myEClassApplyList";
	}
	@GetMapping("/stateApproval")
	public String eClassApprovedState(EClassApproved eClassApproved) {
		
		eClassService.priceStateUpdate(eClassApproved);
		
		return "redirect:/eClassOpenApplyadminList";
	}
	
	@GetMapping("/eclassadmin/studentList")
	public String studentList(Model model) {
		
		model.addAttribute("title", "수강생 목록");
		
		return "eClass/studentList";
	}
	
}

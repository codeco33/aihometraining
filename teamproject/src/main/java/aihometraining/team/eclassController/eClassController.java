package aihometraining.team.eclassController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
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
		List<EClassCategorySmall> eClassCategoryList = eClassService.eClassCategoryList();
		
		
		
		log.info("eClassController.javaOpenApplyForm 데이터: {}", eClassCategoryList); //받은 내용이 여기{}에 담긴다.

		
		model.addAttribute("title", "운통클래스 신청폼");
		model.addAttribute("eClassCategoryList", eClassCategoryList);
		
		return "eClass/eClassOpenApplyForm";
	}
	
	@PostMapping("/CategoryLarge")
	@ResponseBody
	public List<EClassCategorySmall> EClassMedium(String eClassCategoryLargeCode){
		
		log.info("eClassController EClassMedium 데이터: {}", eClassCategoryLargeCode);
		
		List<EClassCategorySmall> categoryLarge = eClassMapper.eClassCategoryLarge(eClassCategoryLargeCode);
		
		return categoryLarge;
	}
	@PostMapping("/CategoryMedium")
	@ResponseBody
	public List<EClassCategorySmall> EClassSmall (String eClassCategoryMediumCode){
	
		List<EClassCategorySmall> categorySmall = eClassMapper.eClassCategoryMedium(eClassCategoryMediumCode);
		
		return categorySmall;
	}
	
	@GetMapping("/eClassIntroduce")
	public String EClassIntroduceInsert( Model model
											,EClassIntroduce eClassIntroduce) {
		
		log.info("운동클래스 신청 폼에서 입력 받은 데이터 : {}",eClassIntroduce);
		//1 eClassIntroduceCode 자동생성
		//2 개설된 클래스 코드
		eClassIntroduce.setMemberEmail("id004@email.com");
		eClassService.EClassIntroduceInsert(eClassIntroduce);
		
		model.addAttribute("title", "개설신청 완료");
		
		return "/eClassOpenApplyForm";
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
	
	@GetMapping("/eclassadmin/studentList")
	public String studentList(Model model) {
		
		model.addAttribute("title", "수강생 목록");
		
		return "/eClass/studentList";
	}
	
}

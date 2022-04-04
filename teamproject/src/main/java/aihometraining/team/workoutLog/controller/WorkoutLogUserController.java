package aihometraining.team.workoutLog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogPrivacybounds;
import aihometraining.team.workoutLog.service.WorkoutLogUserService;

@Controller
@RequestMapping("/workoutLog/workoutLogUser")
public class WorkoutLogUserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(WorkoutLogUserController.class);

	
	//DI 의존성 주입 생성자 메소드 주입방식
	private WorkoutLogUserService workoutLogUserService;
	
	public WorkoutLogUserController(WorkoutLogUserService workoutLogUserService) {
		
		this.workoutLogUserService = workoutLogUserService;
	}
	
	// 일지 메인 화면
	@GetMapping("/workoutLogMain")
	public String workoutLogMain(Model model) {
		
		//운동 목표 목룍 조회
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		log.info("운동 목표 목록 조회  workoutGoalList : {}", workoutGoalList);
		
		model.addAttribute("title", "하루 일지");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutLogMain";
			
	}
	
	// 일지 상세 화면
	@GetMapping("/workoutLogList")
	public String workoutLogList(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		log.info("운동 목표 목록 조회  workoutGoalList : {}", workoutGoalList);
		
		model.addAttribute("title", "일지 상세 화면");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutLogList";
		
	}
	
	// 인지 일지 화면
	@GetMapping("/workoutLogBest")
	public String workoutLogBest(Model model) {
		
		model.addAttribute("title", "인기 일지");
		
		return "workoutLog/workoutLogUser/workoutLogBest";
		
	}
	
	// 일지 등록 화면
	@GetMapping("/workoutLogInsert")
	public String workoutLogInsert(Model model) {
		

		//일지 공개범위 목록 조회
		List<WorkoutLogPrivacybounds> workoutLogPrivacyboundsList = workoutLogUserService.getworkoutLogPrivacyboundsList();
		log.info("일지 공개범위 목록 조회  workoutlogPrivacyboundsList : {}", workoutLogPrivacyboundsList);
		
		//운동 클래스 카테고리 small 목록 조회
		List<EClassCategorySmall> eClassCategorySmallList = workoutLogUserService.geteClassCategorySmallList();
		log.info("운동 클래스 카테고리 small 목록 조회  eClassCategorySmallList : {}", eClassCategorySmallList);
		
		model.addAttribute("title", "일지 등록");
		model.addAttribute("workoutLogPrivacyboundsList", workoutLogPrivacyboundsList);
		model.addAttribute("eClassCategorySmallList", eClassCategorySmallList);
		
		return "workoutLog/workoutLogUser/workoutLogInsert";
		
	}
	
	//일지 등록 처리
	@PostMapping("/workoutLogInsert")
	public String workoutLogInsert(WorkoutLog workoutLog) {
		
		log.info("일지 등록 폼에서 입력받은 데이터: {}", workoutLog);
		
		workoutLogUserService.workoutLogInsert(workoutLog);
		
		return "redirect:/workoutLog/workoutLogUser/workoutLogMain";
		
	}
	
	
	
	// 일지 수정 화면
	@GetMapping("/workoutLogUpdate")
	
	public String workoutLogUpdate(Model model) {
		
		model.addAttribute("title", "일지 수정 화면");
		
		return "workoutLog/workoutLogUser/workoutLogUpdate";
		
	}
	
	// 운동 목표 목록 조회
	@GetMapping("/workoutGoalList")
	public String workoutGoalList(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		model.addAttribute("title", "운동 목표");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutGoalList";
		
	}
	
	// 운동 목표 등록
	@GetMapping("/workoutGoalInsert")
	public String workoutGoalInsert(Model model) {
		
		model.addAttribute("title", "운동 목표 등록");
		
		return "workoutLog/workoutLogUser/workoutGoalInsert";
		
	}
	
	
	//운동 계획 화면
	@GetMapping("/workoutGoalPlanList")
	public String workoutGoalPlanList(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		model.addAttribute("title", "운동 계획");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutGoalPlanList";
		
	}
	
	
}


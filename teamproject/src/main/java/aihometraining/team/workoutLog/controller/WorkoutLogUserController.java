package aihometraining.team.workoutLog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.workoutLog.service.WorkoutLogUserService;

@Controller
@RequestMapping("/workoutLog/workoutLogUser")
public class WorkoutLogUserController {
	

	//DI 의존성 주입 생성자 메소드 주입방식
	private WorkoutLogUserService workoutLogUserService;
	
	public WorkoutLogUserController(WorkoutLogUserService workoutLogUserService) {
		
		this.workoutLogUserService = workoutLogUserService;
	}
	
	
	@GetMapping("/workoutLogMain")
	public String workoutLogMain(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		model.addAttribute("title", "하루 일지");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutLogMain";
			
	}
	
	@GetMapping("/workoutGoalList")
	public String workoutGoalList(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		model.addAttribute("title", "운동 목표");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutGoalList";
		
	}
	
	@GetMapping("/workoutGoalInsert")
	public String workoutGoalInsert(Model model) {
		
		model.addAttribute("title", "운동 목표 등록");
		
		return "workoutLog/workoutLogUser/workoutGoalInsert";
		
	}
	
	@GetMapping("/workoutLogUpdate")
	
	public String workoutLogUpdate(Model model) {
		
		model.addAttribute("title", "일지 수정 화면");
		
		return "workoutLog/workoutLogUser/workoutLogUpdate";
		
	}
	
	@GetMapping("/workoutLogList")
	public String workoutLogList(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		model.addAttribute("title", "일지 상세 화면");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutLogList";
		
	}
	
	@GetMapping("/workoutLogBest")
	public String workoutLogBest(Model model) {
		
		model.addAttribute("title", "인기 일지");
		
		return "workoutLog/workoutLogUser/workoutLogBest";
		
	}
	
	@GetMapping("/workoutLogInsert")
	public String workoutLogInsert(Model model) {
		
		model.addAttribute("title", "일지 등록");
		
		return "workoutLog/workoutLogUser/workoutLogInsert";
		
	}
	
	@GetMapping("/workoutGoalPlanList")
	public String workoutGoalPlanList(Model model) {
		
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		model.addAttribute("title", "운동 계획");
		model.addAttribute("workoutGoalList", workoutGoalList);
		
		return "workoutLog/workoutLogUser/workoutGoalPlanList";
		
	}
	
	
}


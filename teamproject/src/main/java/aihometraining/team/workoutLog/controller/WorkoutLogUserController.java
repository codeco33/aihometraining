package aihometraining.team.workoutLog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workoutLog/workoutLogUser")
public class WorkoutLogUserController {
	
	@GetMapping("/workoutLogMain")
	public String workoutLogMain(Model model) {
			
		model.addAttribute("title", "하루 일지");
		
		return "workoutLog/workoutLogUser/workoutLogMain";
			
	}
	
	@GetMapping("/workoutGoalList")
	public String workoutGoalList(Model model) {
		
		model.addAttribute("title", "운동 목표");
		
		return "workoutLog/workoutLogUser/workoutGoalList";
		
	}
	
	@GetMapping("/workoutLogList")
	public String workoutLogList(Model model) {
		
		model.addAttribute("title", "일지 상세 화면");
		
		return "workoutLog/workoutLogUser/workoutLogList";
		
	}
	
	@PostMapping("/workoutLogBest")
	public String workoutLogBest(Model model) {
		
		model.addAttribute("title", "인기 일지");
		
		return "workoutLog/workoutLogUser/workoutLogBest";
		
	}
	
	@PostMapping("/workoutLogInsert")
	public String workoutLogInsert(Model model) {
		
		model.addAttribute("title", "일지 등록");
		
		return "workoutLog/workoutLogUser/workoutLogInsert";
		
	}
	
	@GetMapping("/workoutGoalPlanList")
	public String workoutGoalPlanList(Model model) {
		
		model.addAttribute("title", "운동 계획");
		
		return "workoutLog/workoutLogUser/workoutGoalPlanList";
		
	}
	
	
	
}


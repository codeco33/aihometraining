package aihometraining.team.workoutLogUser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workoutLog/workoutLogUser")
public class WorkoutLogUserController {
	
	@GetMapping("/workoutLogMain")
	public String workoutLogMain(Model model) {
			
		model.addAttribute("title", "하루 일지");
		
		return "workoutLog/workoutLogUser/workoutLogMain";
			
	}
	
	@GetMapping("/workoutLogList")
	public String workoutLogList(Model model) {
		
		model.addAttribute("title", "인기 일지");
		
		return "workoutLog/workoutLogUser/workoutLogList";
		
	}
	
	@GetMapping("/workoutGoalPlanList")
	public String workoutGoalPlanList(Model model) {
		
		model.addAttribute("title", "운동 목표 및 계획");
		
		return "workoutLog/workoutLogUser/workoutGoalPlanList";
		
	}
	
	
	
}


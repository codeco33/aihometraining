package aihometraining.team.workoutLog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workoutLog/workoutLogUserTrainer")
public class workoutLogUserTrainerController {
	
	
	@GetMapping("/workoutGoalPlanTrainerList")
	public String workoutGoalPlanTrainerList(Model model) {
		
		model.addAttribute("title", "운동 계획 관리 화면");
		model.addAttribute("leftMenuList", "트레이너");	
		
		return "workoutLog/workoutLogUserTrainer/workoutGoalPlanTrainerList";
		
	}
	
	

}

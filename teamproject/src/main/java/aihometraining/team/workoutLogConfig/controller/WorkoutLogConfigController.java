package aihometraining.team.workoutLogConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workoutLog/workoutLogConfig")
public class WorkoutLogConfigController {
	
	@GetMapping("/workoutLogConfigMain")
	public String workoutLogConfigMain(Model model) {
		
		model.addAttribute("title", "일지 관리자 화면");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutLogConfigMain";
		
	}
	
	@GetMapping("/workoutCategoryList")
	public String workoutCategoryList(Model model) {
		
		model.addAttribute("title", "운동 카테고리 목록");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryList";
	}
	
	@GetMapping("/workoutAIVideoList")
	public String workoutAIVideoList(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 목록");
		model.addAttribute("leftMenuList", "일지");
		
		
		return "workoutLog/workoutLogConfig/workoutAIVideoList";
		
	}
	
}

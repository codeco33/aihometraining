package aihometraining.team.workoutLog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.dto.WorkoutLogCategory;
import aihometraining.team.workoutLog.service.WorkoutLogConfigService;

@Controller
@RequestMapping("/workoutLog/workoutLogConfig")
public class WorkoutLogConfigController {
	
	//DI 의존성 주입 생성자 메소드 주입방식
	private WorkoutLogConfigService workoutLogConfigService;
	
	public WorkoutLogConfigController(WorkoutLogConfigService workoutLogConfigService) {
		this.workoutLogConfigService = workoutLogConfigService;
		
	}
	
	@GetMapping("/workoutLogConfigMain")
	public String workoutLogConfigMain(Model model) {
		
		model.addAttribute("title", "일지 관리자 화면");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutLogConfigMain";
		
	}
	
	@GetMapping("/workoutCategoryList")
	public String workoutCategoryList(Model model) {
		
		List<WorkoutLogCategory> workoutLogCategoryList = workoutLogConfigService.getWorkoutLogCategoryList();
		
		model.addAttribute("title", "운동 계획 카테고리 목록");
		model.addAttribute("leftMenuList", "일지");
		model.addAttribute("workoutLogCategoryList", workoutLogCategoryList);
		
		
		return "workoutLog/workoutLogConfig/workoutCategoryList";
	}
	
	@PostMapping("/workoutCategoryInsert")
	public String workoutCategoryInsert(Model model) {
		
		model.addAttribute("title", "운동 계획 카테고리 등록");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryInsert";
	}
	
	@GetMapping("/workoutCategoryUpdate")
	public String workoutCategoryUpdate(Model model) {
		
		model.addAttribute("title", "운동 계획 카테고리 수정");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryUpdate";
		
	}
	
	@GetMapping("/workoutCategoryDelete")
	public String workoutCategoryDelete(Model model) {
		
		model.addAttribute("title", "운동 계획 카테고리 삭제");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryDelete";
		
	}
	
	
	@GetMapping("/workoutAIVideoList")
	public String workoutAIVideoList(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 목록");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoList";
		
	}
	
	@PostMapping("/workoutAIVideoInsert")
	public String workoutAIVideoInsert(Model model) {
		
		model.addAttribute("title", "운동 영상 등록");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoInsert";
	}
	
	@GetMapping("/workoutAIVideoUpdate")
	public String workoutAIVideoUpdate(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 수정");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoUpdate";
		
	}
	
	@GetMapping("/workoutAIVideoDelete")
	public String workoutAIVideoDelete(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 삭제");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoDelete";
		
	}
	
	
	
}

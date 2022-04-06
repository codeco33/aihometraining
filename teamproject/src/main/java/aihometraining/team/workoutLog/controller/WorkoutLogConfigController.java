package aihometraining.team.workoutLog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogCategory;
import aihometraining.team.workoutLog.mapper.WorkoutLogConfigMapper;
import aihometraining.team.workoutLog.service.WorkoutLogConfigService;

@Controller
@RequestMapping("/admin")
public class WorkoutLogConfigController {
	
	
	private static final Logger log = LoggerFactory.getLogger(WorkoutLogConfigController.class);

	
	//DI 의존성 주입 생성자 메소드 주입방식
	private WorkoutLogConfigService workoutLogConfigService;
	private WorkoutLogConfigMapper workoutLogConfigMapper;
	 
	public WorkoutLogConfigController(WorkoutLogConfigService workoutLogConfigService, WorkoutLogConfigMapper workoutLogConfigMapper) {
		this.workoutLogConfigService = workoutLogConfigService;
		this.workoutLogConfigMapper = workoutLogConfigMapper;
		
	}
	
	//운동 일지 관리자 메인 화면
	@GetMapping("/workoutLogConfigMain")
	public String workoutLogConfigMain(Model model) {
		
		List<WorkoutLog> workoutLogList = workoutLogConfigService.getWorkoutLogList();
		
		model.addAttribute("title", "일지 관리자 화면");
		model.addAttribute("leftMenuList", "일지");
		model.addAttribute("workoutLogList", workoutLogList);
		
		return "workoutLog/workoutLogConfig/workoutLogConfigMain";
		
	}
	
	//운동 계획 카테고리 목록
	@GetMapping("/workoutCategoryList")
	public String workoutCategoryList(Model model) {
		
		
		List<WorkoutLogCategory> workoutLogCategoryList = workoutLogConfigService.getWorkoutLogCategoryList();
		
		model.addAttribute("title", "운동 계획 카테고리 목록");
		model.addAttribute("leftMenuList", "일지");
		model.addAttribute("workoutLogCategoryList", workoutLogCategoryList);
		
		return "workoutLog/workoutLogConfig/workoutCategoryList";
	}
	
	//운동 계획 카테고리 등록 처리
	@PostMapping("/workoutCategoryInsert")
	public String workoutCategoryInsert(WorkoutLogCategory workoutLogCategory) {
		
		log.info("운동 카테고리 등록 폼에서 입력받은 데이터: {}", workoutLogCategory);
		
		workoutLogConfigService.workoutGoalCategoryInsert(workoutLogCategory);
		
		return "redirect:/workoutLog/workoutLogConfig/workoutCategoryList";
		
	}
	
	
	//운동 계획 카테고리 등록 화면
	@GetMapping("/workoutCategoryInsert")
	public String workoutCategoryInsert(Model model) {
		
		model.addAttribute("title", "운동 계획 카테고리 등록 화면");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryInsert";
	}
	
	/*
	 * // A-jax : 운동 계획 카테고리 수정 모달에 데이터값 가져오기
	 * 
	 * @PostMapping("/workoutLogCategoryModal")
	 * @ResponseBody 
	 * public WorkoutLogCategory getWorkoutLogCategoryModal(@RequestParam(name="workoutLogCategoryCode", required = false) String workoutGoalPlanCategoryCode){
	 * 
	 * WorkoutLogCategory workoutLogCategoryModal = workoutLogConfigMapper.getWorkoutLogCategoryModal(workoutGoalPlanCategoryCode);
	 * 
	 * log.info("운동 계획 카테고리명 조회  workoutGoalPlanCategoryCode : {}", workoutGoalPlanCategoryCode);
	 * 
	 * return workoutLogCategoryModal; 
	 * 
	 * }
	 */
	
	
	  //A-jax : 운동 계획 카테고리명 수정처리
	  
	  @PostMapping("/workoutLogCategoryUpdateModal")
	  @ResponseBody 
	  public int workoutLogCategoryUpdateModal(@RequestParam Map<String, Object> paramMap){	
		  
		  log.info("workoutLogCategoryUpdateModal : {}", paramMap.toString());
		  
		  return  workoutLogConfigMapper.workoutLogCategoryUpdateModal(paramMap); 	  
	  }
	 
	 
	//운동 계획 카테고리 수정
	@GetMapping("/workoutCategoryUpdate")
	public String workoutCategoryUpdate(Model model) {
		
		model.addAttribute("title", "운동 계획 카테고리 수정");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryUpdate";
		
	}
	
	//운동 계획 카테고리 삭제
	@GetMapping("/workoutCategoryDelete")
	public String workoutCategoryDelete(Model model) {
		
		model.addAttribute("title", "운동 계획 카테고리 삭제");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutCategoryDelete";
		
	}
	
	//AI 운동 영상 목록
	@GetMapping("/workoutAIVideoList")
	public String workoutAIVideoList(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 목록");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoList";
		
	}
	
	//AI 운동 영상 등록
	@PostMapping("/workoutAIVideoInsert")
	public String workoutAIVideoInsert(Model model) {
		
		model.addAttribute("title", "운동 영상 등록");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoInsert";
	}
	
	//AI 운동 영상 수정
	@GetMapping("/workoutAIVideoUpdate")
	public String workoutAIVideoUpdate(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 수정");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoUpdate";
		
	}
	
	//AI 운동 영상 삭제
	@GetMapping("/workoutAIVideoDelete")
	public String workoutAIVideoDelete(Model model) {
		
		model.addAttribute("title", "AI 운동 영상 삭제");
		model.addAttribute("leftMenuList", "일지");
		
		return "workoutLog/workoutLogConfig/workoutAIVideoDelete";
		
	}
	
	
	
}

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
	public String workoutLogConfigMain(Model model
									  ,@RequestParam(value="searchKey", required = false) String searchKey
									  ,@RequestParam(value="searchValue", required = false) String searchValue
									  ,@RequestParam(value="searchDate", required = false) String searchDate
									  ,@RequestParam(value="searchStart", required = false) String searchStart
									  ,@RequestParam(value="searchEnd", required = false) String searchEnd
									  ,@RequestParam(name="btnKey", required = false) String btnKey) {
		
		log.info("챌린지 카테고리 조회  btnKey : {}", btnKey);
		
		Map<String, Object> paramMap = new HashMap<String,Object>();
		
		if(searchKey != null) {
			if("memberEmail".equals(searchKey)) {
				searchKey = "w.memberEmail";	//쿼리문과 동일하게(모호하다며 찾을 수 없다며)
				searchDate = "workoutLogUpdateFinalDate";
			}else if("workoutLogTitle".equals(searchKey)) {
				searchKey = "w.workoutLogTitle";
				searchDate = "workoutLogUpdateFinalDate";
			}
		}
		if(btnKey != null) {
			if("오늘".equals(btnKey)) {
				btnKey = "workoutLogUpdateFinalDate";
			}else if("1주일".equals(btnKey)) {
				btnKey = "-1 WEEK";
			}else if("1개월".equals(btnKey)) {
				btnKey = "-1 MONTH";
			}else if("3개월".equals(btnKey)) {
				btnKey = "-3 MONTH";
			}else if("1년".equals(btnKey)) {
				btnKey = "-1 YEAR";
			}
		}
		
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchDate", searchDate);
		paramMap.put("searchStart", searchStart);
		paramMap.put("searchEnd", searchEnd);
		paramMap.put("btnKey", btnKey);
		
		List<Map<String, Object>> workoutLogList = workoutLogConfigService.getWorkoutLogList(paramMap);
		
		List<WorkoutLog> workoutLogNewList = workoutLogConfigService.getNewWorkoutLog();
		log.info("새로운 일지 목록 workoutLogNewList : {}", workoutLogNewList);
		
		paramMap = null;
		
		log.info("일지 검색 workoutLogList : {}", workoutLogList);
		
		model.addAttribute("title", "일지 관리자 화면");
		model.addAttribute("leftMenuList", "일지");
		model.addAttribute("workoutLogList", workoutLogList);
		model.addAttribute("workoutLogNewList", workoutLogNewList);
		
		return "workoutLog/workoutLogConfig/workoutLogConfigMain";
		
	}
	
	//운동 계획 카테고리 목록
	@GetMapping("/workoutCategoryList")
	public String workoutCategoryList( Model model
									  ,@RequestParam(value="searchValue", required = false) String searchValue) {
		
		Map<String, Object> paramMap = new HashMap<String,Object>();
		
		if(searchValue != null) {
			if("workoutGoalPlanCategoryContent".equals(searchValue)) {
				searchValue = "workoutGoalPlanCategoryContent";	//쿼리문과 동일하게(모호하다며 찾을 수 없다며)
			}
		}
		
		paramMap.put("searchValue", searchValue);
		
		List<Map<String, Object>> workoutLogCategoryList = workoutLogConfigService.getWorkoutLogCategoryList(paramMap);
		
		paramMap = null;
		
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
		
		return "redirect:/admin/workoutCategoryList";
		
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
	public String workoutCategoryDelete(@RequestParam(name="workoutGoalPlanCategoryCode", required = false) String workoutGoalPlanCategoryCode, WorkoutLogCategory workoutLogCategory) {
		
		log.info("운동 카테고리 등록 폼에서 삭제 할 데이터: {}", workoutGoalPlanCategoryCode);
		
		workoutLogConfigService.workoutGoalCategoryDelete(workoutGoalPlanCategoryCode);
		
		return "redirect:/admin/workoutCategoryList";
		
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

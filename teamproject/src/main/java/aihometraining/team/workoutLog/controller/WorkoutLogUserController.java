package aihometraining.team.workoutLog.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.EClassCategoryMedium;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogPrivacybounds;
import aihometraining.team.workoutLog.mapper.WorkoutLogUserMapper;
import aihometraining.team.workoutLog.service.WorkoutLogUserService;

@Controller
@RequestMapping("/workoutLog/workoutLogUser")
public class WorkoutLogUserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(WorkoutLogUserController.class);

	
	//DI 의존성 주입 생성자 메소드 주입방식
	private WorkoutLogUserService workoutLogUserService;
	private WorkoutLogUserMapper workoutLogUserMapper;
	
	public WorkoutLogUserController(WorkoutLogUserService workoutLogUserService, WorkoutLogUserMapper workoutLogUserMapper) {
		
		this.workoutLogUserService = workoutLogUserService;
		this.workoutLogUserMapper = workoutLogUserMapper;
	}
	
	// 일지 메인 화면
	@GetMapping("/workoutLogMain")
	public String workoutLogMain(Model model) {
		
		//운동 목표 목룍 조회
		List<WorkoutGoal> workoutGoalList = workoutLogUserService.getworkoutGoalList();
		
		//일지 목록 조회
		List<WorkoutLog> workoutLogList = workoutLogUserService.getworkoutLogList();
		
		log.info("운동 목표 목록 조회  workoutGoalList : {}", workoutGoalList);
		
		model.addAttribute("title", "하루 일지");
		model.addAttribute("workoutGoalList", workoutGoalList);
		model.addAttribute("workoutLogList", workoutLogList);
		
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
	
	// 인기 일지 화면
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
		
		//운동 클래스 카테고리 large 목록 조회
		List<EClassCategoryLarge> eClassCategoryLargeList = workoutLogUserService.geteClassCategoryLargeList();
		log.info("운동 클래스 카테고리 large 목록 조회  eClassCategoryLargeList : {}", eClassCategoryLargeList);
		
		model.addAttribute("title", "일지 등록");
		model.addAttribute("workoutLogPrivacyboundsList", workoutLogPrivacyboundsList);
		model.addAttribute("eClassCategoryLargeList", eClassCategoryLargeList);
		
		return "workoutLog/workoutLogUser/workoutLogInsert";
		
	}
	
	// Ajax : 운동 계획 카테고리 대-중 분류
	@PostMapping("/geteClassCategoryMedium")
	@ResponseBody
	public List<EClassCategoryMedium> geteClassCategoryMedium(@RequestParam(value = "eClassCategoryLargeCode") String eClassCategoryLargeCode){
		
		log.info("운동클래스 카테고리 medium 목록 조회 : {}", eClassCategoryLargeCode);
		
		return workoutLogUserMapper.geteClassCategoryMedium(eClassCategoryLargeCode);
		
	}
	
	// Ajax : 운동 계획 카테고리 중-소 분류
	@PostMapping("/geteClassCategorySmall")
	@ResponseBody
	public List<EClassCategorySmall> geteClassCategorySmall(@RequestParam(value = "eClassCategoryMediumCode") String eClassCategoryMediumCode){
		
		log.info("운동클래스 카테고리 small 목록 조회 : {}", eClassCategoryMediumCode);
		
		return workoutLogUserMapper.geteClassCategorySmall(eClassCategoryMediumCode);
		
	}
	
	
	//일지 등록 처리
		@PostMapping("/workoutLogInsert")
		public String workoutLogInsert(WorkoutLog workoutLog, HttpSession session) {
			
			String sessionEmail = (String) session.getAttribute("SEMAIL");	//형변환을 해줘라
			
			log.info("일지 등록 폼에서 입력받은 데이터: {}", workoutLog);
			
			workoutLogUserService.workoutLogInsert(workoutLog, sessionEmail);
			
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
	
	
	
	
	//달력 이벤트 가져오기
	@GetMapping("/calendarEvents")
	@ResponseBody
	public List<Map<String,Object>> calendarEvents(@RequestParam Map<String, Object> paramMap) {
		
		System.out.println(paramMap.toString());
		
		List<Map<String,Object>> calList = new ArrayList<Map<String,Object>>();
		Map<String, Object> map = null;
		
		map = new HashMap<String, Object>();
		map.put("title", "삼일절");
		map.put("start", "2022-03-01");
		map.put("end", "2022-03-01");		
		calList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "삼일절1");
		map.put("start", "2022-03-02");
		map.put("end", "2022-03-02");		
		calList.add(map);
		
		return calList;
		
	}
	
}


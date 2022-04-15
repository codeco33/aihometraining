package aihometraining.team.diet.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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

import aihometraining.team.diet.mapper.DietMapper;
import aihometraining.team.diet.service.DietService;
import aihometraining.team.dto.DietBank;
import aihometraining.team.dto.DietMealLevelList;
import aihometraining.team.dto.DietNutrientList;
import aihometraining.team.dto.DietOnemealConnection;
import aihometraining.team.dto.DietPlan;


@Controller
@RequestMapping("/diet/mypage/")
public class DietUserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(DietUserController.class);

	
	//DI 의존성 주입
	private DietService dietService;
	private DietMapper dietMapper;
	
	public DietUserController(DietService dietService, DietMapper dietMapper) {
		this.dietService = dietService;
		this.dietMapper = dietMapper;
	}
	
	
	@GetMapping("/dietBankList")
	public String selectDietBankList(Model model) {
		
		
		model.addAttribute("title", "식단 은행 테스트");
		model.addAttribute("role", "식단은행 테스트페이지");
		
		return "diet/dietBankList";
		
	}
	
	
	//개인 식단 페이지 이동, 음식 대분류 조회, 개인 식단 계획 조회
	@GetMapping("/dietMyList")
	public String selectDietMyList(Model model, HttpSession session) {
		model.addAttribute("title", "개인 식단페이지");
		model.addAttribute("role", "개인 식단 페이지 테스트");
		
		
		//음식 대분류 조회
		List<DietMealLevelList> mainMealSort = dietMapper.selectDietMealLevelList();
		model.addAttribute("mainMealSort", mainMealSort);
		
		
		//개인 식단 계획 조회(오늘자)
		DietPlan dietplan = new DietPlan();
		String memberEmail = (String) session.getAttribute("SEMAIL");
		String today = LocalDate.now().toString();
		
		dietplan.setMemberEmail(memberEmail);	
		dietplan.setDietPlanDay(today);

		
		List<HashMap<String, Object>> UserdietPlanList = dietService.selectUserDietPlan(dietplan);
		model.addAttribute("UserdietPlanList",UserdietPlanList);
		
		HashMap<String, Object> UserdietPlanListNutrient = dietService.UserdietPlanList(UserdietPlanList);
		model.addAttribute("UserdietPlanListNutrient", UserdietPlanListNutrient);
		
		log.info("UserdietPlanListNutrient : {}", UserdietPlanListNutrient);
		
		
		
		return "diet/dietMyList";
	}
	
	
	//Ajax 대분류 선택 후 음식 조회(user)
	@PostMapping("/selectUserDietMealList")
	public String selectDietMealList(Model model
									,@RequestParam(name="mainMealSort",required = false) String mainMealSort) {
		
		
		List<DietNutrientList> DietNutrientList = dietMapper.selectDietNutrientList(mainMealSort);
		
		
		model.addAttribute("DietNutrientList", DietNutrientList);
		
		return "diet/AjaxTable/DietUserMealListAjax";
	}
	
	
	//Ajax 개인 식단 계획에 음식 삽입
	@PostMapping("/insertUserDietPlan")
	@ResponseBody
	public int insertUserDietPlan(Model model,
									DietPlan dietplan) {
		
		//삽입시 필요한 새 코드명 
		String newCode = dietService.selectDietBankListNewCode("dietplan", "dietPlanCode");
		dietplan.setDietPlanCode(newCode);
		
		
		
		int insertResult = dietService.insertUserDietPlan(dietplan);
		
		
		return insertResult;
	}
	
	@PostMapping("/selectChangedDietPlanList")
	public String selectChangedDietPlanList(Model model
											,DietPlan dietplan) {
		
		List<HashMap<String, Object>> UserdietPlanList = dietService.selectUserDietPlan(dietplan);
		model.addAttribute("UserdietPlanList",UserdietPlanList);

		
		HashMap<String, Object> UserdietPlanListNutrient = dietService.UserdietPlanList(UserdietPlanList);
		model.addAttribute("UserdietPlanListNutrient", UserdietPlanListNutrient);
		
		log.info("UserdietPlanListNutrient : {}", UserdietPlanListNutrient);
		
		
		return "diet/AjaxTable/DietUserMealplanedListAjax";
	}
	
	@PostMapping("/deleteUserDietPlan")
	@ResponseBody
	public int deleteUserDietPlan(DietPlan dietplan) {
		
		int deleteResult = dietService.deleteUserDietPlan(dietplan);
		
		return deleteResult;
	}
	
	//Ajax 식단 계획 페이지에서 실행 눌렀을 때, 혹은 취소 눌렀을 때 update
	@PostMapping("/updateUserDietPlan")
	@ResponseBody
	public int updateUserDietPlan(DietPlan dietPlan) {
		
		int updateResult = dietService.updateUserDietPlan(dietPlan);
		
		return updateResult;
	}
}


package aihometraining.team.diet.controller;

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
	
	
	@GetMapping("/dietMyList")
	public String selectDietMyList(Model model) {
		model.addAttribute("title", "개인 식단페이지");
		model.addAttribute("role", "개인 식단 페이지 테스트");
		
		return "diet/dietMyList";
	}

	
	
	
	
	
	
}

package aihometraining.team.diet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/diet")
public class DietController {
	
	
	private static final Logger log = LoggerFactory.getLogger(DietController.class);

	
	//DI 의존성 주입
	
	
	@GetMapping("/dietBankList")
	public String getDietBankList(Model model) {
		
		
		model.addAttribute("title", "식단 은행 테스트");
		model.addAttribute("role", "식단은행 테스트페이지");
		
		return "diet/dietBankList";
		
	}
	
	@GetMapping("/dietBankListAdmin")
	public String getDietBankListAdmin(Model model) {
		
		
		model.addAttribute("title", "식단 은행 테스트");
		model.addAttribute("role", "식단은행 테스트페이지");
		
		return "diet/dietBankListAdmin";
		
	}

	
}

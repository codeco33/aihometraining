package aihometraining.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eClass/eClassConfig")
public class EClassController {
	@GetMapping("/eClassCategoryList")
	public String paymentList(Model model) {
		
		model.addAttribute("leftMenuList", "운동 클래스");
		model.addAttribute("title", "운동 클래스 카테고리 관리");
		
		return "eClass/eClassConfig/eClassCategoryList";
	}
}

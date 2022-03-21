package aihometraining.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	@GetMapping("/memberList")
	public String memberList(Model model) {
		
		model.addAttribute("leftMenuList", "회원");
		model.addAttribute("title", "전체 회원 목록 페이지");
		
		return "member/memberList";
	}
	@GetMapping("/memberLevelList")
	public String memberLevelList(Model model) {
		
		model.addAttribute("leftMenuList", "회원");
		model.addAttribute("title", "회원 권한 페이지");
		
		return "member/memberLevelList";
	}
	@GetMapping("/loginList")
	public String loginList(Model model) {
		
		model.addAttribute("leftMenuList", "회원");
		model.addAttribute("title", "로그인 회원 목록 페이지");
		
		return "member/loginList";
	}
	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("leftMenuList", "회원");
		model.addAttribute("title", "로그인 페이지");
		
		return "member/login";
	}
	@GetMapping("/addMember")
	public String addMember(Model model) {
		
		model.addAttribute("leftMenuList", "회원");
		model.addAttribute("title", "회원 가입 페이지");
		
		return "member/addMember";
	}
}

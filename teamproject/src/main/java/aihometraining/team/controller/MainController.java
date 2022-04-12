package aihometraining.team.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aihometraining.team.dto.EClassOpenApplyForm;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.service.MemberService;

@Controller
public class MainController {
	
	private MemberService memberService;
	private MemberMapper memberMapper;
	
	public MainController(MemberService memberService, MemberMapper memberMapper) {
		this.memberService = memberService;
		this.memberMapper = memberMapper;
	}
	
	@GetMapping("/")
	public String main(Model model, HttpSession session) {
		
		System.out.println(session.getAttribute("SLEVEL"));
		System.out.println(session.getAttribute("SNAME"));
		model.addAttribute("title", "메인화면");
		
		return "usermain";
	}
	@GetMapping("/admin")
	public String usermain(Model model, HttpSession session) {
		
		model.addAttribute("title", "관리자 메인화면");
		String sessionLevel = (String) session.getAttribute("SLEVEL");
		
		if(sessionLevel == null || (sessionLevel != null && !sessionLevel.equals("levelCode001"))) {
			return "redirect:/";
		}
		
		return "adminmain";
		
	}
	@GetMapping("/mypage/mypage")
	public String mypage(Model model) {
		
		model.addAttribute("title", "마이페이지");
		
		return "member/mypage";
		
	}
	@GetMapping("/eclassadmin")
	public String eclassadmin(Model model) {
		
		model.addAttribute("title", "운동 클래스 관리자 페이지");
		
		return "eClass/eclassadmin";
		
	}
	
	

}

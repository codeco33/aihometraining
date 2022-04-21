package aihometraining.team.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aihometraining.team.challenge.service.ChallengeGatherService;
import aihometraining.team.dto.Member;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.service.MemberService;

@Controller
public class MemberController {

	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);

	
	//DI 의존성 주입 생성자 메소드 주입 방식
	private MemberService memberService;
	private MemberMapper memberMapper;
	private ChallengeGatherService challengeGatherService;
	
	public MemberController(MemberService memberService, MemberMapper memberMapper, ChallengeGatherService challengeGatherService) {
		this.memberService = memberService;
		this.memberMapper = memberMapper;
		this.challengeGatherService = challengeGatherService;
	}
	
	/* 로그아웃 */
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	
		session.invalidate();
		
		return "redirect:/login";
	}
	/* 로그인 */
	/* 관리자 로그인 */ 
	@GetMapping("/login")
	public String login(Model model
					   ,@RequestParam(value="result", required = false) String result) {
		
		model.addAttribute("title", "회원 로그인");
		
		if(result != null) model.addAttribute("result", result);
		
		return "member/login";
	}
	
	/* 관리자 로그인 처리 */
	@PostMapping("/login")
	public String login(Member member, HttpSession session, RedirectAttributes reAttr) {
		String memberEmail  = member.getMemberEmail();
		String memberPw 	= member.getMemberPw();
		
		Member checkMember = memberMapper.getMemberInfoByEmail(memberEmail);
		log.info("{}", checkMember);
		
		if(checkMember != null && checkMember.getMemberPw() != null && memberPw.equals(checkMember.getMemberPw())) {
			String sessionLevelCode = checkMember.getMemberLevelCode();
			String sessionName = checkMember.getMemberName();
			
			String getMaker = challengeGatherService.getChallengeMaker(memberEmail);
			if(getMaker == null || getMaker =="") {
				getMaker = "권한없음";
			}else {
				getMaker = "권한있음";
			}
			
			session.setAttribute("SEMAIL", 	memberEmail);
			session.setAttribute("SLEVEL", 	sessionLevelCode);
			session.setAttribute("SNAME", 	sessionName);
			session.setAttribute("SCHALLENGE", getMaker);
			
			log.info("로그인 성공");
			
			return "redirect:/";
		}
		
		reAttr.addAttribute("result", "등록된 회원이 없습니다.");
		
		return "redirect:/login";
	}
	/* 일반 회원 로그인 */ 
	@GetMapping("/login2")
	public String login2(Model model
			,@RequestParam(value="result", required = false) String result) {
		
		model.addAttribute("title", "회원 로그인");
		
		if(result != null) model.addAttribute("result", result);
		
		return "member/login2";
	}
	
	/* 일반 회원 로그인 처리 */
	@PostMapping("/login2")
	public String login2(Member member, HttpSession session, RedirectAttributes reAttr) {
		String memberEmail  = member.getMemberEmail();
		String memberPw 	= member.getMemberPw();
		
		Member checkMember = memberMapper.getMemberInfoByEmail(memberEmail);
		log.info("{}", checkMember);
		
		if(checkMember != null && checkMember.getMemberPw() != null && memberPw.equals(checkMember.getMemberPw())) {
			String sessionLevelCode = checkMember.getMemberLevelCode();
			String sessionName = checkMember.getMemberName();
			
			String getMaker = challengeGatherService.getChallengeMaker(memberEmail);
			if(getMaker == null || getMaker =="") {
				getMaker = "권한없음";
			}else {
				getMaker = "권한있음";
			}
			
			session.setAttribute("SEMAIL", 	memberEmail);
			session.setAttribute("SLEVEL", 	sessionLevelCode);
			session.setAttribute("SNAME", 	sessionName);
			session.setAttribute("SCHALLENGE", getMaker);
			
			log.info("로그인 성공");
			
			return "redirect:/";
		}
		
		reAttr.addAttribute("result", "등록된 회원이 없습니다.");
		
		return "redirect:/login2";
	}
	/* 미인증 회원 로그인 */ 
	@GetMapping("/login3")
	public String login3(Model model
			,@RequestParam(value="result", required = false) String result) {
		
		model.addAttribute("title", "회원 로그인");
		
		if(result != null) model.addAttribute("result", result);
		
		return "member/login3";
	}
	
	/* 미인증 회원 로그인 처리 */
	@PostMapping("/login3")
	public String login3(Member member, HttpSession session, RedirectAttributes reAttr) {
		String memberEmail  = member.getMemberEmail();
		String memberPw 	= member.getMemberPw();
		
		Member checkMember = memberMapper.getMemberInfoByEmail(memberEmail);
		log.info("{}", checkMember);
		
		if(checkMember != null && checkMember.getMemberPw() != null && memberPw.equals(checkMember.getMemberPw())) {
			String sessionLevelCode = checkMember.getMemberLevelCode();
			String sessionName = checkMember.getMemberName();
			
			String getMaker = challengeGatherService.getChallengeMaker(memberEmail);
			if(getMaker == null || getMaker =="") {
				getMaker = "권한없음";
			}else {
				getMaker = "권한있음";
			}
			
			session.setAttribute("SEMAIL", 	memberEmail);
			session.setAttribute("SLEVEL", 	sessionLevelCode);
			session.setAttribute("SNAME", 	sessionName);
			session.setAttribute("SCHALLENGE", getMaker);
			
			log.info("로그인 성공");
			
			return "redirect:/";
		}
		
		reAttr.addAttribute("result", "등록된 회원이 없습니다.");
		
		return "redirect:/login3";
	}
	
	
	/**
	 *  이메일 중복 체크
	 *  emailCheck ajax
	 *  @RequestParam(value = "memberEmail") == request.getParameter("memberEmail");
	 */
	@PostMapping("/emailCheck")
	@ResponseBody
	public boolean isEmailCheck(@RequestParam(value = "memberEmail") String memberEmail) {
		boolean emailCheck = false;
		log.info("이메일 중복 체크 클릭 시 요청 받은 memberEmail의 값: {}", memberEmail);
		
		boolean result = memberMapper.isEmailCheck(memberEmail);
		if(result) emailCheck = true;
		
		log.info("이메일 중복 체크 여부 : {}", result);
		return emailCheck;
	}
	
	/* 회원 추가 정보 입력 폼 */
	@GetMapping("/addInfo")
	public String addInfo(Model model, @RequestParam(value="memberEmail", required = false) String memberEmail) {
		
		model.addAttribute("title", "추가 정보 입력");
		Member member = memberService.getMemberInfoByEmail(memberEmail);
		model.addAttribute("member", member);
		
		return "member/addInfo";
		
	}
	
	 /* 회원가입 폼 */
	@GetMapping("/addMember")
	public String addMember(Model model) {
		
		model.addAttribute("title", "회원가입");
		
		return "member/addMember";
	}
	
	/**
	 * 회원 가입 처리
	 * /addMember method 방식이 다르기 때문에 주소를 중복해서 사용 가능
	 * @param member(회원가입 폼 전송시 요소의 name 속성의 값과  dto의 멤버변수의 이름과 같으면 자동으로 바인딩하는 객체)
	 *        커맨드객체
	 * @return redirect: -> request.sendRedirect("")
	 */
	@PostMapping("/addMember")
	public String addMember(Member member, RedirectAttributes reAttr) {
		log.info("회원가입폼에서 입력받은 데이터: {}", member);
		
		memberService.addMember(member);
		
		reAttr.addAttribute("memberEmail", member.getMemberEmail());
		
		return "redirect:/addInfo";
	}
	
	

	
}

package aihometraining.team.controller;

import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aihometraining.team.challenge.service.ChallengeGatherService;
import aihometraining.team.dto.LoginHistory;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.MemberLevel;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.service.MemberService;

@Controller
@RequestMapping("/admin")
public class MemberAdminController {

	
	private static final Logger log = LoggerFactory.getLogger(MemberAdminController.class);

	
	//DI 의존성 주입 생성자 메소드 주입 방식
	private MemberService memberService;
	
	public MemberAdminController(MemberService memberService, MemberMapper memberMapper, ChallengeGatherService challengeGatherService) {
		this.memberService = memberService;
	}
	
	/* 로그인 이력 조회 */
	@SuppressWarnings("unchecked")
	@GetMapping("/loginHistory")
	public String getLoginHistory(Model model) {
		
		Map<String, Object> resultMap = memberService.getLoginHistory();
		
		List<LoginHistory> loginList  = (List<LoginHistory>) resultMap.get("loginList");
		List<Map<String, Object>> loginMapList = (List<Map<String, Object>>) resultMap.get("loginMapList");
		
		model.addAttribute("title", "로그인 이력");
		model.addAttribute("loginList",		loginList);
		model.addAttribute("loginMapList",	loginMapList);
		
		return "member/loginHistory";
	}
	
	
	
	/* 회원 목록 조회 */

	@GetMapping("/memberList")
	public String getMemberList(Model model
							   ,@RequestParam(value="searchKey", required = false) String searchKey
							   ,@RequestParam(value="searchValue", required = false) String searchValue) {
		
		
		log.info("회원 목록 요청");
		log.info("searchValue:{}", searchValue);
		
		if(searchKey != null) {
			if("memberEmail".equals(searchKey)) {
				searchKey = "memberEmail";
			}else if("memberLevelCode".equals(searchKey)) {
				searchKey = "memberLevelCode";
			}
		}
		
		List<Member> memberList = memberService.getMemberList(searchKey, searchValue);

		model.addAttribute("title", "회원 목록 조회");
		model.addAttribute("memberList", memberList);
		
		return "member/memberList";
	}
	
	/* 회원 권한 목록 조회 */
	@GetMapping("/memberLevelList")
	public String memberLevelList(Model model) {
		
		List<MemberLevel> memberLevelList = memberService.getMemberLevelList();
		
		model.addAttribute("leftMenuList", "회원 권한 목록 조회");
		model.addAttribute("title", "회원 권한 목록 조회");
		model.addAttribute("memberLevelList", memberLevelList);
		
		
		return "member/memberLevelList";
	}
	
}

package aihometraining.team.challenge.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aihometraining.team.challenge.service.ChallengeEnterService;
import aihometraining.team.dto.ChallengeEnter;
import aihometraining.team.dto.ChallengeGather;

@Controller
@RequestMapping("/challenge/challengeEnter")
public class ChallengeEnterController {
	
	
private static final Logger log = LoggerFactory.getLogger(ChallengeEnterController.class);
	
	//DI 의존성 주입
	private ChallengeEnterService challengeEnterService;
	
	public ChallengeEnterController(ChallengeEnterService challengeEnterService) {
		this.challengeEnterService = challengeEnterService;
	}
	
	@GetMapping("/challengeEnterList")
	public String challengeEnterList(Model model, HttpSession session) {
		
		log.info("참가챌린지 목록조회시 session: {}", session);
		
		String sEmail = (String) session.getAttribute("SEMAIL");
		
		List<ChallengeEnter> challengeEnterList = challengeEnterService.getChallengeEnterListByEmail(sEmail);
		
		log.info("참가챌린지 목록조회 challengeEnterList: {}", challengeEnterList);
		
		model.addAttribute("title", "참가 챌린지 목록");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("challengeEnterList", challengeEnterList);
		
		return "challenge/challengeEnter/challengeEnterList";
		
	}
	
	@GetMapping("/challengeEnterDetail")
	public String challengeEnterDetail(Model model
									  ,@RequestParam(value="challengeGatherCode", required = false) String challengeGatherCode) {
		
		log.info("참가챌린지 세부조회 화면 스트링 값 challengeEnterCode: {}", challengeGatherCode);
		
		ChallengeGather enterDetail = challengeEnterService.getChallengeEnterByCode(challengeGatherCode);
		
		log.info("참가챌린지 세부 조회  enterDetail: {}", enterDetail);
		
		model.addAttribute("title", "참가 챌린지 세부정보");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("enterDetail", enterDetail);
		
		return "challenge/challengeEnter/challengeEnterDetail";
		
	}
	
	@GetMapping("/challengePlanDoInsert")
	public String challengePlanDoInsert(Model model) {
		
		model.addAttribute("title", "참가 챌린지 인증하기");
		model.addAttribute("headerList", "챌린지");
		
		return "challenge/challengeEnter/challengePlanDoInsert";
		
	}
	@GetMapping("/challengeEnterPaymemt")
	public String challengeEnterPaymemt(Model model) {
		
		model.addAttribute("title", "챌린지 참가결제");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeEnter/challengeEnterPaymemt";
		
	}
	
	@PostMapping("/challengeEnterPaymemt")
	public String challengeEnterPaymemt(ChallengeGather challengeGather) {
		
		log.info("challengeGather 조회  challengeGather : {}", challengeGather);
		
		return "redirect:/challenge/challengeEnter/challengeEnterPaymemt";
		
	}
}

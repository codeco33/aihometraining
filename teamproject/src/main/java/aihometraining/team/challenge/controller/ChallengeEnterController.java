package aihometraining.team.challenge.controller;

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
import org.springframework.web.multipart.MultipartFile;

import aihometraining.team.challenge.service.ChallengeEnterService;
import aihometraining.team.dto.ChallengeEnter;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlanDo;

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
	//챌린지 인증 화면
	@GetMapping("/challengePlanDoInsert")
	public String challengePlanDoInsert(Model model, 
										@RequestParam(value="challengeEnterCode", required = false) String challengeEnterCode) {
		
		log.info("참가 챌린지  challengeEnterCode: {}", challengeEnterCode);
		
		List<ChallengeEnter> challengeEnterByCode = challengeEnterService.getChallengeEnterListByCode(challengeEnterCode);
		
		log.info("참가 챌린지 정보조회  challengeEnterByCode: {}", challengeEnterByCode);
		
		model.addAttribute("title", "참가 챌린지 인증하기");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("challengeEnterByCode", challengeEnterByCode);
		
		return "challenge/challengeEnter/challengePlanDoInsert";
		
	}
	//챌린지 인증 처리
	@PostMapping("/challengePlanDoInsert")
	public String challengePlanDoInsert(ChallengeGatherPlanDo challengeGatherPlanDo
										, HttpSession session
										, @RequestParam MultipartFile[] fileImage
										, HttpServletRequest request) {
		
		log.info("챌린지 인증 등록 폼에서 입력받은 데이터: {}", challengeGatherPlanDo); //받은 내용이 여기{}에 담긴다.
		
		String sEmail = (String) session.getAttribute("SEMAIL");
		
		//파일 업로드 
		String serverName = request.getServerName();
		String fileRealPath = "";
		if("localhost".equals(serverName)) {				
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			//fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}else {
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}
		
		challengeEnterService.challengePlanDoInsert(challengeGatherPlanDo, sEmail, fileImage, fileRealPath);
		
		
		return "redirect:/challenge/challengeEnter/challengePlanDoList";
		
	}
	
	@GetMapping("/challengePlanDoList")
	public String challengePlanDoList(Model model) {
		
		model.addAttribute("title", "인증 챌린지 목록");
		model.addAttribute("leftMenuList", "챌린지");
		
		return "challenge/challengeEnter/challengePlanDoList";
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

package aihometraining.team.challenge.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aihometraining.team.challenge.mapper.ChallengeEnterMapper;
import aihometraining.team.challenge.service.ChallengeEnterService;
import aihometraining.team.dto.ChallengeEnter;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlanDo;
import aihometraining.team.mapper.CommonMapper;

@Controller
@RequestMapping("/challenge/challengeEnter")
public class ChallengeEnterController {
	
	
private static final Logger log = LoggerFactory.getLogger(ChallengeEnterController.class);
	
	//DI 의존성 주입
	private ChallengeEnterService challengeEnterService;
	private ChallengeEnterMapper challengeEnterMapper;
	private CommonMapper commonMapper;
	
	public ChallengeEnterController(ChallengeEnterService challengeEnterService, ChallengeEnterMapper challengeEnterMapper
									,CommonMapper commonMapper) {
		this.challengeEnterService = challengeEnterService;
		this.challengeEnterMapper = challengeEnterMapper;
		this.commonMapper = commonMapper;
	}
	
	//참가챌린지 목록 조회
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
	
	//결제후 참가처리
	@PostMapping("/challengeEnterList")
	public String challengeEnterInsert(ChallengeEnter challengeEnter,ChallengeGatherPlanDo challengeGatherPlanDo, HttpSession session) {
		
		log.info("참가챌린지 목록조회시 session: {}", session);
		String sEmail = (String) session.getAttribute("SEMAIL");
		
		
		challengeEnterService.challengeEnterInsert(challengeEnter,challengeGatherPlanDo, sEmail);
		
		
		return "redirect:/challenge/challengeEnter/challengeEnterList";
		
	}
	
	//참가챌린지 세부 조회
	@GetMapping("/challengeEnterDetail")
	public String challengeEnterDetail(Model model
									  ,@RequestParam(value="challengeGatherCode", required = false) String challengeGatherCode) {
		
		log.info("참가챌린지 세부조회 화면 스트링 값 challengeEnterCode: {}", challengeGatherCode);
		
		ChallengeGather enterDetail = challengeEnterService.getChallengeEnterByCode(challengeGatherCode);
		
		List<String> progressByMember = challengeEnterMapper.getProgressByMember(challengeGatherCode);
		
		log.info("참가챌린지 멤버 진행률>>>>> progressByMember: {}", progressByMember);
		
		log.info("참가챌린지 세부 조회  enterDetail: {}", enterDetail);
		
		model.addAttribute("title", "참가 챌린지 세부정보");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("enterDetail", enterDetail);
		model.addAttribute("progressByMember", progressByMember);
		
		return "challenge/challengeEnter/challengeEnterDetail";
		
	}
	
	//챌린지 인증 화면
	@GetMapping("/challengePlanDoInsert")
	public String challengePlanDoInsert(Model model, 
										@RequestParam(value="challengeGatherPlanDoCode", required = false) String challengeGatherPlanDoCode) {
		
		log.info("참가 챌린지  challengeGatherPlanDoCode: {}", challengeGatherPlanDoCode);
		
		//실행 코드별 챌린지 정보 조회
		List<ChallengeGatherPlanDo> planDoProveByCode = challengeEnterService.getPlanDoProveByCode(challengeGatherPlanDoCode);
		
		log.info("실행 코드별 챌린지 정보 조회  planDoProveByCode: {}", planDoProveByCode);
		
		model.addAttribute("title", "참가 챌린지 인증하기");
		model.addAttribute("headerList", "챌린지");
		model.addAttribute("planDoProveByCode", planDoProveByCode);
		
		return "challenge/challengeEnter/challengePlanDoInsert";
		
	}
	//참가 챌린지 인증 등록처리(update처리)
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
		
		
		return "redirect:/challenge/challengeEnter/challengeEnterList";
		
	}
	
	//챌린지 인증 리스트
	@GetMapping("/challengePlanDoList")
	public String challengePlanDoList(Model model
									 ,HttpSession session
									 ,@RequestParam(value="challengeEnterCode", required = false) String challengeEnterCode) {
		
		String sEmail = (String) session.getAttribute("SEMAIL");
		log.info("sEmail : {}", sEmail);
		List<ChallengeGatherPlanDo> planDoList = challengeEnterService.getPlanDoListByCodeAndEmail(challengeEnterCode, sEmail);
		
		model.addAttribute("title", "인증 챌린지 목록");
		model.addAttribute("leftMenuList", "챌린지");
		model.addAttribute("planDoList", planDoList);
		
		return "challenge/challengeEnter/challengePlanDoList";
	}
	
	/*
	 * @GetMapping("/challengeEnterPaymemt") public String
	 * challengeEnterPaymemt(Model model) {
	 * 
	 * model.addAttribute("title", "챌린지 참가결제"); model.addAttribute("leftMenuList",
	 * "챌린지");
	 * 
	 * return "challenge/challengeEnter/challengeEnterPaymemt";
	 * 
	 * }
	 */
	
	@PostMapping("/challengeEnterPaymemt")
	public String challengeEnterPaymemt(ChallengeGather challengeGather, Model model, RedirectAttributes reAttr, HttpSession session
										,ChallengeEnter challengeEnter, ChallengeGatherPlanDo challengeGatherPlanDo) {
		
		model.addAttribute("title", "챌린지 참가결제");
		
		log.info("20220422 challengeEnterPaymemt challengeGather값 조회  challengeGather : {}", challengeGather);
		
		/* DTO안에 DTO의 property값 받는 또 다른 방법
		 * log.
		 * info("20220422-2 challengeEnterPaymemt challengeGatherPlan값 조회  challengeGatherPlan : {}"
		 * , challengeGatherPlan);
		 */
		
		
		log.info("돈내놔 : {}",challengeGather.getChallengeEnterDeposit());
		
		
		model.addAttribute("challengeGather", challengeGather);
		/* DTO안에 DTO의 property값 받는 또 다른 방법
		 * model.addAttribute("challengeGatherPlan", challengeGatherPlan); */
		
		
		/** 2022-04-24 진수경
		 * 
		 * 결제 기능 구현으로 수정
		 * 
		 * 1 챌린지 참가 테이블 insert
		 * 2 결제
		 * 		3-1 성공시 결제 테이블> 챌린지 계 insert
		 * 		3-2 실패시 챌린지 참가 테이블 delete 
		 */
		String sEmail = (String) session.getAttribute("SEMAIL");
		challengeEnter.setMemberEmail(sEmail);
				
		String newCode = commonMapper.getNewCode("challengeEnterCode", "challengeenter");
		log.info("새로 생성된 코드 newCode : {}",newCode);
		
		int len = challengeEnter.getMemberEmail().indexOf("@");
		String memberId = challengeEnter.getMemberEmail().substring(0, len);
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddhhmm");
		
		String paymentGroupCode = "c"+date.format(new Date())+"_"+memberId;
		
		challengeEnter.setChallengeEnterCode(newCode);
		challengeEnter.setPaymentGroupCode(paymentGroupCode);
		
		log.info("새로 셋팅 된 challengeEnter: {}", challengeEnter);
		
		
		challengeEnterMapper.challengeEnterInsert(challengeEnter);
		
		
		//결제 화면에 paymentGroupCode 넘겨주기
		reAttr.addAttribute("paymentGroupCode", challengeEnter.getPaymentGroupCode());
		
		
		return "redirect:/payment";
		
	}
}

package aihometraining.team.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aihometraining.team.dto.Member;
import aihometraining.team.dto.MemberLevel;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.service.MemberService;

@Controller
@RequestMapping("/mypage")
public class MypageController {
	
	
	private static final Logger log = LoggerFactory.getLogger(MypageController.class);

	//DI 의존성 주입 생성자 메소드 주입 방식
	private MemberService memberService;
	private MemberMapper memberMapper;
	
	public MypageController(MemberService memberService, MemberMapper memberMapper) {
		this.memberService = memberService;
		this.memberMapper  = memberMapper;
	}
	
	/* 회원 탈퇴 처리 */
	@PostMapping("/removeMember")
	public String removeMember(@RequestParam(name="memberEmail", required = false) String memberEmail
							  ,@RequestParam(name="memberPw", required = false, defaultValue = "") String memberPw
							  ,RedirectAttributes reAttr) {
		
		log.info("회원 탈퇴 처리 memberEmail: {}", memberEmail);
		log.info("회원 탈퇴 처리 memberPw: {}", memberPw);
		Member member = memberMapper.getMemberInfoByEmail(memberEmail);
		
		if(member != null && member.getMemberPw() != null && memberPw.equals(member.getMemberPw())) {
			memberService.removeMember(member);
			log.info("회원 탈퇴 성공");
			
			return "redirect:/";
		}
		
		reAttr.addAttribute("memberEmail", memberEmail);
		reAttr.addAttribute("result", "회원의 정보가 일치하지 않습니다.");
		log.info("회원 탈퇴 실패");
		
		return "redirect:/removeMember";
	
	}
	
	/* 회원 탈퇴 화면	 */
	@GetMapping("/removeMember")
	public String removeMember(@RequestParam(name="memberEmail", required = false) String memberEmail
							  ,@RequestParam(name="result", required = false) String result
							  ,Model model) {
		
		model.addAttribute("title", "회원 탈퇴 화면");
		model.addAttribute("memberEmail", memberEmail);
		if(result != null) model.addAttribute("result", result);
		
		return "member/removeMember";
	}
	
	
	/* 회원 수정 처리 */
	@PostMapping("/modifyMember")
	public String modifyMember(Member member) {
		log.info("회원 수정 화면에서 입력받은 값: {}", member);
		memberService.modifyMember(member);
		return "redirect:/";
	}
	
	/* 회원 수정 화면 */
	@GetMapping("/modifyMember")
	public String modifyMember(Model model
							  ,@RequestParam(name="memberEmail", required = false) String memberEmail) {
		log.info("회원 수정 화면 폼 쿼리 스트링 memberEmail : {}", memberEmail);
		
		Member member = memberService.getMemberInfoByEmail(memberEmail);
		List<MemberLevel> memberLevelList = memberService.getMemberLevelList();
		
		model.addAttribute("title", "회원수정화면");
		model.addAttribute("member", member);
		model.addAttribute("levelList", memberLevelList);
		
		return "member/modifyMember";
	}
	
	@GetMapping("/mypaymentList")
	public String mypaymentList(Model model) {
		
		model.addAttribute("title", "결제 내역");
		model.addAttribute("leftMenuList", "거래내역");
		
		return "payment/mypaymentList";
	}
	
	@GetMapping("/myrefundList")
	public String myrefundList(Model model) {
		
		model.addAttribute("title", "환불 내역");
		model.addAttribute("leftMenuList", "거래내역");
		
		return "refund/myrefundList";
	}
	
	@GetMapping("/mypointList")
	public String mypointList(Model model) {
		
		
		
		model.addAttribute("title", "포인트 내역");
		model.addAttribute("leftMenuList", "포인트");
		
		return "point/mypointList";
	}
	
	//결제 상세 내역
	@GetMapping("/mypaymentList/paymentDetail")
	public String paymentDetail(Model model
								,@RequestParam(name="paymentCode") String paymentCode) {
		
		model.addAttribute("title", "결제 내역");
		model.addAttribute("leftMenuList", "거래내역");
		model.addAttribute("subTitle", "결제 상세 내역");
		model.addAttribute("layoutDeco", "layout/mypagedefault");
		model.addAttribute("paymentCode", paymentCode);
		
		return "payment/paymentDetail";
	}
	
	@GetMapping("/myrefundList/refundDetail")
	public String refundDetail(Model model) {
		
		model.addAttribute("title", "환불 내역");
		model.addAttribute("leftMenuList", "거래내역");
		model.addAttribute("subTitle", "환불 상세 내역");
		model.addAttribute("layoutDeco", "layout/mypagedefault");
		
		return "refund/refundDetail";
	}
	
	@GetMapping("/myClassList")
	public String myClassList(Model model) {
		
		model.addAttribute("title", "내 클래스 보기");
		model.addAttribute("leftMenuList", "운동클래스");
		
		return "eClass/myeClassList";
	}
	
	@GetMapping("/mySignUpForClassList")
	public String mySignUpForClassList(Model model) {
		
		model.addAttribute("title", "수강신청 내역");
		model.addAttribute("leftMenuList", "운동클래스");
		
		return "eClass/mySignUpForClassList";
	}
	
	
}

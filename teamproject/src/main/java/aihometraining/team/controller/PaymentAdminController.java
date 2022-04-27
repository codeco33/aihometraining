package aihometraining.team.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.dto.Payment;
import aihometraining.team.mapper.MemberMapper;
import aihometraining.team.mapper.PaymentMapper;
import aihometraining.team.service.MemberService;
import aihometraining.team.service.PaymentService;


@Controller
@RequestMapping("/admin")
public class PaymentAdminController {
	
	//DI 의존성 주입 생성자 메소드 주입 방식
		private PaymentMapper paymentMapper;
		private PaymentService paymentService;
		private ChallengeGatherMapper challengeGatherMapper; 
		
		public PaymentAdminController(PaymentMapper paymentMapper, PaymentService paymentService
									,ChallengeGatherMapper challengeGatherMapper) {
			this.paymentMapper = paymentMapper;
			this.paymentService = paymentService;
			this.challengeGatherMapper = challengeGatherMapper;
		}
	
	/** 
	 * 관리자 결제 내역 조회
	 * */
	@GetMapping("/paymentList")
	public String paymentList(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String memberEmail = (String) session.getAttribute("SEMAIL");
		
		List<Payment> paymentList = paymentMapper.getPaymentList(memberEmail);
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "결제 내역");
		model.addAttribute("paymentList", paymentList);
		
		return "payment/paymentList";
	}
	
	/**
	 * 관리자 결제 상세 내역 조회
	 */
	@GetMapping("/paymentList/paymentDetail")
	public String paymentDetail(Model model,@RequestParam(name="paymentCode") String paymentCode) {
		
		MypageController mc = new MypageController(null, null, paymentMapper, paymentService, challengeGatherMapper);
		mc.paymentDetail(model, paymentCode);
		
		
		model.addAttribute("leftMenuList", "결제/환불");
		model.addAttribute("title", "결제 내역");
		model.addAttribute("subTitle", "결제 상세 내역");
		model.addAttribute("layoutDeco", "layout/default");
		
		return "payment/paymentDetail";
	}
	
	

}

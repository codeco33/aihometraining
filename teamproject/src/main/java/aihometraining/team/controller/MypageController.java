package aihometraining.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MypageController {
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
	
	@GetMapping("/mypaymentList/paymentDetail")
	public String paymentDetail(Model model) {
		
		model.addAttribute("title", "결제 내역");
		model.addAttribute("leftMenuList", "거래내역");
		model.addAttribute("subTitle", "결제 상세 내역");
		model.addAttribute("layoutDeco", "layout/mypagedefault");
		
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

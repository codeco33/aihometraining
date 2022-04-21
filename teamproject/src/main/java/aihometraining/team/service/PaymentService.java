package aihometraining.team.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassTake;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.Payment;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.PaymentMapper;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Service
@Transactional
public class PaymentService {
	
	private PaymentMapper paymentMapper; 
	
	@Autowired
	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}

	//위시리스트 화면
	public List<WishList> getWishList(String SEMAIL, String sortStandard) {
		String sortStr = "wi.wishListRegDate desc";
		List<WishList> wishList;
		
		if(sortStandard == null) {
			wishList = paymentMapper.getWishList(SEMAIL, sortStr);
		}else {
			wishList = paymentMapper.getWishList(SEMAIL, sortStandard);
		}
		
		return wishList;
	}
	
	//수강신청 멤버 정보
	public Member getEClassTakeMember(String memberEmail) {
		return paymentMapper.getEClassTakeMember(memberEmail);
	}
	//수강신청 운동클래스 정보
	public EClassApproved getEClassApproved(String eClassCode) {
		return paymentMapper.getEClassApproved(eClassCode);
	}
	
	//위시리스트 삭제
	public boolean deleteWishList(String[] wishListCodeArray) {
		int cnt = 0;
		for(String wishListCode:wishListCodeArray) {
			int result = paymentMapper.deleteWishList(wishListCode);
			if( result == 1)cnt++;
		}
		
		if(cnt == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	//수강신청
	public void addEClassTake(EClassTake eClassTake) {
		String eClassApprovedCode = eClassTake.geteClassApprovedCode();
		
		int len = eClassTake.getMemberEmail().indexOf("@");
		String memberId = eClassTake.getMemberEmail().substring(0, len);
		
		String eClassTakeCode =  eClassApprovedCode+"_"+memberId;
		
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddhhmm");
		
		String paymentGroupCode = "e"+date.format(new Date())+"_"+memberId;
		
		
		//dto에 위에서 만들어진 코드를 세팅해주기
		eClassTake.seteClassTakeCode(eClassTakeCode);
		eClassTake.setPaymentGroupCode(paymentGroupCode);
		
		paymentMapper.addEClassTake(eClassTake);
	}
	
	//결제처리
	public void addPayment(Payment payment) {
		
		//결제제코드 생성 및 셋팅
		
		int len = payment.getMemberEmail().indexOf("@");
		String memberId = payment.getMemberEmail().substring(0, len);
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddhhmm");
		
		String paymentCode = "p"+date.format(new Date())+"_"+memberId;
		
		
		String paymentMethodCode = paymentMapper.getPaymentMethodCode(payment.getPaymentMethodName());
		
		payment.setPaymentCode(paymentCode);
		payment.setPaymentMethodCode(paymentMethodCode);
		
		paymentMapper.addPayment(payment);
		
		
	}
		
	
	//휴대폰번호 인증문자 보내기
	public String PhoneNumberCheck(String to) throws CoolsmsException{
		String api_key = "NCSE6DHPSWEU1QWE";
		String api_secret = "FU0V81LADNPFPABGKH2RCPOSZEAA7VDJ";
		Message coolsms = new Message(api_key, api_secret);
			
		
		Random rand = new Random(); 
		String numStr = "";
		for(int i=0; i<4; i++) {
			String ran = Integer.toString(rand.nextInt(10)); 
			numStr += ran;
		}
		  
		HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", to);    // 수신전화번호 (ajax로 view 화면에서 받아온 값으로 넘김)
	    params.put("from", "01098042629");    // 발신전화번호. 테스트시에는 발신,수신 둘다 본인 번호로 하면 됨
	    params.put("type", "sms"); 
	    params.put("text", "AI 쌍방향 홈트레이닝 인증번호는 [" + numStr + "] 입니다.");

	    coolsms.send(params); // 메시지 전송
			  
			  
		return numStr;
		 
	}
	
	
	

}

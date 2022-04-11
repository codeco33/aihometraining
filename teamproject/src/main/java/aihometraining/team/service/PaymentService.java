package aihometraining.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {
	
	private PaymentMapper paymentMapper; 
	
	@Autowired
	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}

	//위시리스트 화면
	public List<WishList> getWishList(String SEMAIL) {
		List<WishList> wishList = paymentMapper.getWishList(SEMAIL);
		
		return wishList;
	}
	
	//수강신청 멤버 정보
	public Member getEClassTakeMember(String memberEmail) {
		return null;
	}
	//수강신청 운동클래스 정보
	public EClassApproved getEClassApproved(String eClassCode) {
		return null;
	}
	

}

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
	

}

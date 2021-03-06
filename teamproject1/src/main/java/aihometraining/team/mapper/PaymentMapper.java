package aihometraining.team.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassTake;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.WishList;

@Mapper
public interface PaymentMapper {
	
	//위시리스트 조회
	public List<WishList> getWishList(String SEMAIL, String sortStandard);
	
	//수강신청 멤버정보
	public Member getEClassTakeMember(String memberEmail);
	//수강신청 운동클래스정보
	public EClassApproved getEClassApproved(String eClassCode);
	
	//위시리스트 삭제
	public int deleteWishList(String wishListCode);
	
	//수강신청하기
	public void addEClassTake(EClassTake eClassTake);
	
	//결제화면 수강신청
	public String getEClassTake(String paymentGroupCode);
	//결제화면 챌린지참여
	public String getCallengeEnter(String paymnetGroupCode);
	
}

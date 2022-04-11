package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.WishList;

@Mapper
public interface PaymentMapper {
	
	//위시리스트
	public List<WishList> getWishList(String SEMAIL);
	
	//멤버정보
	public Member getEClassTakeMember(String memberEmail);
	//운동클래스정보
	public EClassApproved getEClassApproved(String eClassCode);
	
}

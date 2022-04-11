package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassTake;
import aihometraining.team.dto.WishList;

@Mapper
public interface PaymentMapper {
	
	//위시리스트
	public List<WishList> getWishList(String SEMAIL);
	
	//수강신청화면
	public WishList getEClassTake(String eClassCode, String memberEmail);
}

package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.WishList;

@Mapper
public interface PaymentMapper {
	
	public List<WishList> getWishList(String SEMAIL);
	
}

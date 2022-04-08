package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;

@Mapper
public interface EClassMapper {
	
	//클래스 카테고리 조회
	public List<EClassCategorySmall> eClassCategoryList();
	
	//클래스 단계별 카테고리 조회
	public List<EClassCategorySmall> eClassCategoryLarge(String eClassCategoryLargeCode);
	public List<EClassCategorySmall> eClassCategoryMedium(String eClassCategoryMediumCode);
	
	//클래스 개설신청 폼 등록
	public int EClassIntroduceInsert(EClassIntroduce eClassIntroduce);
}

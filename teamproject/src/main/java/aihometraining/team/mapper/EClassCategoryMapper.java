package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.EClassCategoryMedium;
import aihometraining.team.dto.EClassCategorySmall;

@Mapper
public interface EClassCategoryMapper {
	
	//운동 클래스 카테고리 대 목록 조회
	public List<EClassCategoryLarge> getEClassCategoryLargeList(String searchKey, String searchValue);
	
	//운동 클래스 카테고리 중 목록 조회
	public List<EClassCategoryMedium> getEClassCategoryMediumList(String searchKey, String searchValue);
	
	//운동 클래스 카테고리 소 목록 조회
	public List<EClassCategorySmall> getEClassCategorySmallList(String searchKey, String searchValue);
	
	//운동 클래스 카테고리 등록
	public int addEClassCategory(EClassCategoryLarge eClassCategoryLarge, EClassCategoryMedium eClassCategoryMedium, EClassCategorySmall eClassCategorySmall);
	
}

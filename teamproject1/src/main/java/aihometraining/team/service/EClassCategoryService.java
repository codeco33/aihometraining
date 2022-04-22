package aihometraining.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.EClassCategoryMedium;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.mapper.EClassCategoryMapper;


@Service
@Transactional
public class EClassCategoryService {
	//DI 의존성 주입 생성자 메서드 주입방식
	private EClassCategoryMapper eClassCategoryMapper;
	
	@Autowired
	public EClassCategoryService(EClassCategoryMapper eClassCategoryMapper) {
		this.eClassCategoryMapper = eClassCategoryMapper;
	}
	
	//운동 클래스 카테고리 등록
	public int addEClassCategory(EClassCategoryLarge eClassCategoryLarge, EClassCategoryMedium eClassCategoryMedium, EClassCategorySmall eClassCategorySmall) {
		
		int result = eClassCategoryMapper.addEClassCategory(eClassCategoryLarge, eClassCategoryMedium, eClassCategorySmall);
		
		return result; 
	}
	
	//운동 클래스 카테고리 대 목록 조회
	public List<EClassCategoryLarge> getEClassCategoryLargeList(String searchKey,
			String searchValue) {
		
		List<EClassCategoryLarge> eClassCategoryLargeList = eClassCategoryMapper.getEClassCategoryLargeList(searchKey, searchValue);
		
		return eClassCategoryLargeList;
	}
	//운동 클래스 카테고리 중 목록 조회
	public List<EClassCategoryMedium> getEClassCategoryMediumList(String searchKey,
			String searchValue) {
		
		List<EClassCategoryMedium> eClassCategoryMediumList = eClassCategoryMapper.getEClassCategoryMediumList(searchKey, searchValue);
		
		return eClassCategoryMediumList;
	}
	//운동 클래스 카테고리 소 목록 조회
	public List<EClassCategorySmall> getEClassCategorySmallList(String searchKey,
			String searchValue) {
		
		List<EClassCategorySmall> eClassCategorySmallList = eClassCategoryMapper.getEClassCategorySmallList(searchKey, searchValue);
		
		return eClassCategorySmallList;
	}
	
}

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

	public List<EClassCategoryLarge> getEClassCategoryList(String searchKey,
			String searchValue) {
		
		List<EClassCategoryLarge> eClassCategoryList = eClassCategoryMapper.getEClassCategoryList(searchKey, searchValue);
		
		return eClassCategoryList;
	}
	
}

package aihometraining.team.eclassService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.mapper.EClassMapper;

@Service
@Transactional
public class eClassService {
	//DI 의존성 주입 생성자 메소드
	private CommonMapper commonMapper;
	private EClassMapper eClassMapper;
	private static final Logger log = LoggerFactory.getLogger(eClassService.class);

	public eClassService(EClassMapper eClassMapper, CommonMapper commonMapper) {
		this.eClassMapper = eClassMapper;
		this.commonMapper = commonMapper;
	}
	
	//클래스 카테고리 조회
	public List<EClassCategorySmall> eClassCategoryList() {
		
		List<EClassCategorySmall> eClassCategoryList = eClassMapper.eClassCategoryList();
		
		return eClassCategoryList;
	}
	
	//클래스 신청 폼 introduce등록처리
	public int EClassIntroduceInsert(EClassIntroduce eClassIntroduce) {
		
		log.info("EClassIntroduceInsert eClassIntroduce 데이터: {}", eClassIntroduce);
		String introduceCode = commonMapper.getNewCode("eClassIntroduceCode", "eclassintroduce");
		log.info("eClassService EClassIntroduceInsert introduceCode",introduceCode);
		eClassIntroduce.seteClassIntroduceCode(introduceCode);
		
		int result = eClassMapper.EClassIntroduceInsert(eClassIntroduce);
		
		return result;
	}
}

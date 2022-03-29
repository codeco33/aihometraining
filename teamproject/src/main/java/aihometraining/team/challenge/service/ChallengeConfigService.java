package aihometraining.team.challenge.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeConfigMapper;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.mapper.CommonMapper;

@Service
@Transactional
public class ChallengeConfigService {
	
	//DI 의존성 주입
	private ChallengeConfigMapper challengeConfigMapper;
	private CommonMapper commonMapper;
	
	public ChallengeConfigService(ChallengeConfigMapper challengeConfigMapper, CommonMapper commonMapper) {
		this.challengeConfigMapper = challengeConfigMapper;
		this.commonMapper = commonMapper;
	}
	
	//챌린지 카테고리 조회
	public List<Map<String, Object>> getChallengeCategoryList(Map<String, Object> paramMap){
		//List<ChallengeCategory> challengeCategoryList =  challengeConfigMapper.getChallengeCategoryList(paramMap);
		List<Map<String, Object>> challengeCategoryList =  challengeConfigMapper.getChallengeCategoryList(paramMap);
		
		return challengeCategoryList;
		
	}
	
	//카테고리 코드별 챌린지 카테고리 정보 조회
	public ChallengeCategory getChallengeCategoryByCode(String challengeCategoryCode) {
		
		ChallengeCategory challengeCategory = challengeConfigMapper.getChallengeCategoryByCode(challengeCategoryCode);
		
		return challengeCategory;
		
	}
	
	//카테고리 등록 처리
	public int challengeCategoryInsert(ChallengeCategory challengeCategory) {
		                                         //pk로 쓸 컬럼명,              테이블명
		String newCode = commonMapper.getNewCode("challengeCategoryCode", "challengecategory");
		
		challengeCategory.setChallengeCategoryCode(newCode);
		challengeCategory.setMemberEmail("id001@email.com");
		
		int result = challengeConfigMapper.challengeCategoryInsert(challengeCategory);
		
		return result;
		
	}
}

package aihometraining.team.challenge.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeConfigMapper;
import aihometraining.team.dto.ChallengeCategory;

@Service
@Transactional
public class ChallengeConfigService {
	
	//DI 의존성 주입
	private ChallengeConfigMapper challengeConfigMapper;
	public ChallengeConfigService(ChallengeConfigMapper challengeConfigMapper) {
		this.challengeConfigMapper = challengeConfigMapper;
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
}

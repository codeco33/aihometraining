package aihometraining.team.challengeConfig.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challengeConfig.mapper.ChallengeConfigMapper;
import aihometraining.team.dto.ChallengeCategory;

@Service
@Transactional
public class ChallengeConfigService {
	
	//DI 의존성 주입
	private ChallengeConfigMapper challengeConfigMapper;
	public ChallengeConfigService(ChallengeConfigMapper challengeConfigMapper) {
		this.challengeConfigMapper = challengeConfigMapper;
	}
	
	public List<ChallengeCategory> getChallengeCategoryList(Map<String, Object> paramMap){
		List<ChallengeCategory> challengeCategoryList =  challengeConfigMapper.getChallengeCategoryList(paramMap);
		return challengeCategoryList;
		
	}
}

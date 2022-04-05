package aihometraining.team.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeSetting;
import aihometraining.team.mapper.CommonMapper;

@Service
@Transactional
public class ChallengeGatherService {
	
	
	
	//DI 의존성 주입
	private ChallengeGatherMapper challengeGatherMapper;
	private CommonMapper commonMapper;
	
	public ChallengeGatherService(ChallengeGatherMapper challengeGatherMapper, CommonMapper commonMapper) {
		this.challengeGatherMapper = challengeGatherMapper;
		this.commonMapper = commonMapper;
	}
	
	//챌린지 모집 목록 조회
	public List<ChallengeGather> getChallengeGatherList() {
		List<ChallengeGather> challengeGatherLlist = challengeGatherMapper.getChallengeGatherList();
		return challengeGatherLlist;
		
	}
	
	//챌린지 카테고리 조회
	public List<ChallengeCategory> getChallengeCate() {
		
		List<ChallengeCategory> challengeCateList = challengeGatherMapper.getChallengeCate();
		
		return challengeCateList;
		
	}
	
	//챌린지 세팅 조회
	public List<ChallengeSetting> getChallengeSetting() {
		
		List<ChallengeSetting> challengeSettingList = challengeGatherMapper.getChallengeSetting();
		
		return challengeSettingList;
		
	}
	
	//챌린지 모집 등록 처리
	public int challengeGatherInsert(ChallengeGather challengeGather) {
		//pk컬럼에 들어갈 코드를 자동으로 만들어주는 Mapper      //pk로 쓸 db의 컬럼명                     //코드가 들어갈 db의 테이블명
		String newCode = commonMapper.getNewCode("challengeGatherCode", "challengegather");
		challengeGather.setChallengeGatherCode(newCode);
		challengeGather.setMemberEmail("id002@email.com");//임시처리
		
		int result = challengeGatherMapper.challengeGatherInsert(challengeGather);
		
		return result;
		
	}
	
	
	
}

package aihometraining.team.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeEnterMapper;
import aihometraining.team.dto.ChallengeEnter;

@Service
@Transactional
public class ChallengeEnterService {
	//DI 의존성 주입
	private ChallengeEnterMapper challengeEnterMapper;
	
	public ChallengeEnterService(ChallengeEnterMapper challengeEnterMapper) {
		this.challengeEnterMapper = challengeEnterMapper;
	}
	
	//회원 이메일별 참가 챌린지 목록 조회
	public List<ChallengeEnter> getChallengeEnterListByEmail(String sEmail){
		
		List<ChallengeEnter> challengeEnterList = challengeEnterMapper.getChallengeEnterListByEmail(sEmail);
		
		return challengeEnterList;
		
	}
}

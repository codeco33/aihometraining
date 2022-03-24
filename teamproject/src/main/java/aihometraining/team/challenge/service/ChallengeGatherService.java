package aihometraining.team.challenge.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.dto.ChallengeGather;

@Service
@Transactional
public class ChallengeGatherService {
	
	//DI 의존성 주입
	private ChallengeGatherMapper challengeGatherMapper;
	
	public ChallengeGatherService(ChallengeGatherMapper challengeGatherMapper) {
		this.challengeGatherMapper = challengeGatherMapper;
	}
	
	public List<ChallengeGather> getChallengeGatherList(){
		List<ChallengeGather> challengeGatherLlist = challengeGatherMapper.getChallengeGatherList();
		return challengeGatherLlist;
		
	}
	
}

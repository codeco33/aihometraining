package aihometraining.team.challenge.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeEnterMapper;
import aihometraining.team.dto.ChallengeEnter;
import aihometraining.team.dto.ChallengeGather;

@Service
@Transactional
public class ChallengeEnterService {
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeEnterService.class);

	
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
	
	//참가 챌린지의 세부 정보 조회
	public ChallengeGather getChallengeEnterByCode(String challengeGatherCode) {
		
		//챌린지 EnterDetail의 공통부분 목록 조회
		ChallengeGather enterDetail = challengeEnterMapper.getChallengeEnterByCode(challengeGatherCode);
		
		//List<ChallengeGatherPlanDo> ChallengeGatherPlanDoList = challengeEnterMapper.getChallengeEnterDetail(challengeGatherCode);
		//enterDetail.setChallengeGatherPlanDoList(ChallengeGatherPlanDoList);
		log.info("참가챌린지 세부 정보 조회(service) enterDetail: {}", enterDetail);
		
		
		return enterDetail;
		
	}
}

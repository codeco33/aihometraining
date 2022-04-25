package aihometraining.team.challenge.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeEnter;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlanDo;

@Mapper
public interface ChallengeEnterMapper {
	//회원 이메일별 참가 챌린지 목록 조회
	public List<ChallengeEnter> getChallengeEnterListByEmail(String sEmail);
	
	//챌린지 EnterDetail의 공통부분 목록 조회
	public ChallengeGather getChallengeEnterByCode(String challengeGatherCode);
	
	//참가 챌린지의 세부 정보 조회
	public List<ChallengeGatherPlanDo> getChallengeEnterDetail(String challengeGatherCode);
	
	//참가 챌린지 코드별 챌린지 정보 조회
	public List<ChallengeEnter> getChallengeEnterListByCode(String challengeEnterCode);
	
	//참가 챌린지 인증 등록처리
	public int challengePlanDoInsert(ChallengeGatherPlanDo challengeGatherPlanDo);
}

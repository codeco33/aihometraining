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
	
	//결제후 참가처리
	public int challengeEnterInsert(ChallengeEnter challengeEnter);
	
	//결제후 참가처리시 동시에 참가자 실행테이블에 등록처리
	public int challengeGatherPlanDoInsert(ChallengeGatherPlanDo challengeGatherPlanDo);
	
	//챌린지 EnterDetail의 공통부분 목록 조회
	public ChallengeGather getChallengeEnterByCode(String challengeGatherCode);
	
	//참가 챌린지의 세부 정보 조회
	public List<ChallengeGatherPlanDo> getChallengeEnterDetail(String challengeGatherCode);

	//참가 챌린지 세부내용 중 참가자별 진행률 조회
	public List<String> getProgressByMember(String challengeGatherCode);
	
	//실행 코드별 챌린지 정보 조회
	public List<ChallengeGatherPlanDo> getPlanDoProveByCode(String challengeGatherPlanDoCode);
	
	//참가 코드와 이메일별 인증 목록 조회
	public List<ChallengeGatherPlanDo> getPlanDoListByCodeAndEmail(String challengeEnterCode, String sEmail);
	
	//참가 챌린지 인증 등록처리(update처리)
	public int challengePlanDoInsert(ChallengeGatherPlanDo challengeGatherPlanDo);
}

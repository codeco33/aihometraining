package aihometraining.team.challenge.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengePointGive;
import aihometraining.team.dto.ChallengeSetting;
import aihometraining.team.dto.EClassCategorySmall;



@Mapper
public interface ChallengeConfigMapper {
	//카테고리 목록 조회
	//public List<ChallengeCategory> getChallengeCategoryList(Map<String, Object> paramMap);
	
	//카테고리 목록 조회 임시용
	public List<Map<String,Object>> getChallengeCategoryList(Map<String, Object> paramMap);
	
	//세팅 목록 조회
	public List<ChallengeSetting> getChallengeSettingList();
	
	//운동클래스카테고리small 조회
	public List<EClassCategorySmall> getClassCategoryList();
	
	//카테고리 코드별 챌린지 카테고리 정보 조회
	public ChallengeCategory getChallengeCategoryByCode(String challengeCategoryCode);
	
	//카테고리 등록 처리
	public int challengeCategoryInsert(ChallengeCategory challengeCategory);
	
	//카테고리 수정처리
	public int challengeCategoryUpdate(ChallengeCategory challengeCategory);
	
	//------------------챌린지 카테고리 삭제프로세스 Start-----------------//
	//챌린지 카테고리 코드에 따른 신고내역 삭제(챌린지 카테고리 삭제처리 )
	public void reportDeleteBycateCode(String challengeCategoryCode);
	
	//챌린지 카테고리 코드에 따른 포인트내역 삭제(챌린지 카테고리 삭제처리 )
	public void pointDeleteBycateCode(String challengeCategoryCode);
	
	//챌린지 카테고리 코드에 따른 실행내역 삭제(챌린지 카테고리 삭제처리 )
	public void planDoDeleteBycateCode(String challengeCategoryCode);
	
	//챌린지 카테고리 코드에 따른 참가내역 삭제(챌린지 카테고리 삭제처리 )
	public void enterDeleteBycateCode(String challengeCategoryCode);
	
	//챌린지 카테고리 코드에 따른 모집계획 내역 삭제(챌린지 카테고리 삭제처리 )
	public void planDeleteBycateCode(String challengeCategoryCode);
	
	//챌린지 카테고리 코드에 따른 모집내역 삭제(챌린지 카테고리 삭제처리 )
	public void gatherDeleteBycateCode(String challengeCategoryCode);
	
	//챌린지 카테고리 코드에 따른 카테고리 삭제(챌린지 카테고리 삭제처리 )
	public void challengeCategoryDelete(String challengeCategoryCode);
	//-------------------삭제프로세스 End-------------------------------//
	
	//세팅 등록 처리
	public void challengeSettingInsert(ChallengeSetting challengeSetting);
	
	//챌린지 세팅 코드 별 세팅정보 조회
	public ChallengeSetting getChallengeSettingByCode(String challengeSettingCode);
	
	//세팅 수정 처리
	public void challengeSettingUpdate(ChallengeSetting challengeSetting);
	
	//모집 챌린지 목록 조회
	public List<Map<String,Object>> getGetherList(Map<String, Object> paramMap);
	
	//모집 챌린지 코드별 모집 챌린지 세부 정보 조회
	public List<ChallengeGather> getListDetailByCode(String challengeGatherCode);
	
	//진행 챌린지 목록 조회
	public List<ChallengeGather> getChallengeIngList();
	
	//챌린지 포인트 관리 목록 조회
	public List<ChallengePointGive> getChallengePointList();
	
	//챌린지 포인트 코드별 포인트 관리 세부 조회
	public List<ChallengePointGive> getPointDetailByCode(String challengePointGiveCode);
}

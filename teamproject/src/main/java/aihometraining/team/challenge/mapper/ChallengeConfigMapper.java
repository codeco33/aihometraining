package aihometraining.team.challenge.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
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
	
	//세팅 등록 처리
	public void challengeSettingInsert(ChallengeSetting challengeSetting);
	
	//모집 챌린지 목록 조회
	public List<ChallengeGather> getGetherList();
	
	//모집 챌린지 코드별 모집 챌린지 세부 정보 조회
	public List<ChallengeGather> getListDetailByCode(String challengeGatherCode);
}

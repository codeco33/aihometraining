package aihometraining.team.challenge.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeCategory;



@Mapper
public interface ChallengeConfigMapper {
	//카테고리 목록 조회
	//public List<ChallengeCategory> getChallengeCategoryList(Map<String, Object> paramMap);
	
	//카테고리 목록 조회 임시용
	public List<Map<String,Object>> getChallengeCategoryList(Map<String, Object> paramMap);
	
	//카테고리 코드별 챌린지 카테고리 정보 조회
	public ChallengeCategory getChallengeCategoryByCode(String challengeCategoryCode);
}

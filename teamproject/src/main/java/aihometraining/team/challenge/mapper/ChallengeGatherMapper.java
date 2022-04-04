package aihometraining.team.challenge.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlan;

@Mapper
public interface ChallengeGatherMapper {
	//모집 챌린지 조회
	public List<ChallengeGather> getChallengeGatherList();
	
	//모집 챌린지 세부내용 조회(모집챌린지와 모집챌린지계획 조회)
	public List<ChallengeGatherPlan> getGatherDatail(String challengeGatherCode);
}

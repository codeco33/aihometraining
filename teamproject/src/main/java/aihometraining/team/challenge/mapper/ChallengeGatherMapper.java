package aihometraining.team.challenge.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeGather;

@Mapper
public interface ChallengeGatherMapper {
	//모집 카테고리 조회
	public List<ChallengeGather> getChallengeGatherList(); 
}

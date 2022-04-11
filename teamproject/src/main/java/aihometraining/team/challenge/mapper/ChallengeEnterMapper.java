package aihometraining.team.challenge.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeEnter;

@Mapper
public interface ChallengeEnterMapper {
	//회원 이메일별 참가 챌린지 목록 조회
	public List<ChallengeEnter> getChallengeEnterListByEmail(String sEmail);
}

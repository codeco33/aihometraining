package aihometraining.team.mapper;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.dto.EClassOpenApplyForm;
import aihometraining.team.dto.EClassQuestion;
import aihometraining.team.dto.EClassSectionCurriculum;
import aihometraining.team.dto.EClassSectionTitle;

@Mapper
public interface EClassMapper {
	//클래스 개설신청 폼 등록
	public int EClassOpenApplyFormInsert( EClassOpenApplyForm eClassOpenApplyForm
										, EClassApproved eClassApproved
										, EClassIntroduce eClassIntroduce
										, EClassSectionTitle eClassSectionTitle
										, EClassSectionCurriculum eClassSectionCurriculum
										, EClassQuestion eClassQuestion
										, EClassAnswer eClassAnswer);
}

package aihometraining.team.mapper;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassOpenApplyForm;

@Mapper
public interface EClassMapper {
	//클래스 개설신청 폼 등록
	public int EClassOpenApplyFormInsert(EClassOpenApplyForm eClassOpenApplyForm);
}

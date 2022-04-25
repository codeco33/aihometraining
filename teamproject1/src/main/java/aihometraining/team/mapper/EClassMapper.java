package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.dto.EClassQuestion;
import aihometraining.team.dto.EClassSectionCurriculum;
import aihometraining.team.dto.EClassSectionTitle;

@Mapper
public interface EClassMapper {
	
	//클래스 카테고리 조회
	public List<EClassCategorySmall> eClassCategoryLargeList();
	public List<EClassCategorySmall> eClassCategoryMediumList();
	
	//클래스 단계별 카테고리 조회
	public List<EClassCategorySmall> eClassCategoryLarge(String eClassCategoryLargeCode);
	public List<EClassCategorySmall> eClassCategoryMedium(String eClassCategoryMediumCode);
	
	//신청한 클래스 조회
	public List<EClassApproved> eClassOpenAppleyList(String eClassOpenAppleyMemberEmail);
	
	//클래스 소개 등록 처리
	public int EClassIntroduceInsert(EClassIntroduce eClassIntroduce);
	//클래스 소개 수정 처리
	public int EClassIntroduceUpdate(EClassIntroduce eClassIntroduce);
	
	//클래스 섹션 등록 처리
	public int EClassSectionTitleInsert(EClassSectionTitle eClassSectionTitle);
	//클래스 섹션 수정 처리
	public int EClassSectionTitleUpdate(EClassSectionTitle eClassSectionTitle);

	//클래스 커리큘럼 등록 처리
	public int EClassSectionCurriculumInsert(EClassSectionCurriculum eClassSectionCurriculum);
	//클래스 커리큘럼 수정 처리
	public int EClassSectionCurriculumUpdate(EClassSectionCurriculum eClassSectionCurriculum);

	//클래스 질문 등록 처리
	public int EClassQuestionInsert(EClassQuestion eClassQuestion);
	//클래스 질문  수정 처리
	public int EClassQuestionUpdate(EClassQuestion eClassQuestion);
	
	//클래스 답변 등록 처리
	public int EClassAnswerInsert(EClassAnswer eClassAnswer);
	//클래스 답변 수정 처리
	public int EClassAnswerUpdate(EClassAnswer eClassAnswer);
	
	//클래스 세부설정 등록 처리
	public int EClassPriceInsert(EClassApproved eClassApproved);
	//클래스 세부설정 수정 처리
	public int EClassPriceUpdate(EClassApproved eClassApproved);
	
	//클래스 수정화면
	public EClassApproved eClassApprovedByCode(String eclassapprovedCode);

}

package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.dto.EClassOpenAppleyForm;
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
	
	//클래스 소개 등록 처리
	public int EClassIntroduceInsert(EClassIntroduce eClassIntroduce, String memberEmail);
	
	//클래스 섹션 등록 처리
	public int EClassSectionTitleInsert(EClassSectionTitle eClassSectionTitle, String memberEmail);

	//클래스 커리큘럼 등록 처리
	public int EClassSectionCurriculumInsert(EClassSectionCurriculum eClassSectionCurriculum, String memberEmail);

	//클래스 질문 등록 처리
	public int EClassQuestionInsert(EClassQuestion eClassQuestion, String memberEmail);
	
	//클래스 답변 등록 처리
	public int EClassAnswerInsert(EClassAnswer eClassAnswer, String memberEmail);
	
	//클래스 세부설정 등록 처리
	public int EClassPriceInsert(EClassOpenAppleyForm eClassOpenAppleyForm, String memberEmail);
}

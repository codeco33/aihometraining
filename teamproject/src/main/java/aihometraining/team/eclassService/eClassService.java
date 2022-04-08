package aihometraining.team.eclassService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassApproved;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
import aihometraining.team.dto.EClassOpenApplyForm;
import aihometraining.team.dto.EClassQuestion;
import aihometraining.team.dto.EClassSectionCurriculum;
import aihometraining.team.dto.EClassSectionTitle;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.mapper.EClassMapper;

@Service
@Transactional
public class eClassService {
	//DI 의존성 주입 생성자 메소드
	private CommonMapper commonMapper;
	private EClassMapper eClassMapper;
	
	public eClassService(EClassMapper eClassMapper, CommonMapper commonMapper) {
		this.eClassMapper = eClassMapper;
		this.commonMapper = commonMapper;
	}
	
	public List<EClassCategorySmall> eClassCategoryList() {
		
		List<EClassCategorySmall> eClassCategoryList = eClassMapper.eClassCategoryList();
		
		return eClassCategoryList;
	}
	
	//클래스 신청 폼 등록처리
	public int EClassOpenApplyFormInsert( EClassOpenApplyForm eClassOpenApplyForm
										, EClassApproved eClassApproved
										, EClassIntroduce eClassIntroduce
										, EClassSectionTitle eClassSectionTitle
										, EClassSectionCurriculum eClassSectionCurriculum
										, EClassQuestion eClassQuestion
										, EClassAnswer eClassAnswer) {
		
		String openApplyCode = (commonMapper.getNewCode("eClassOpenAppleyCode", "openAppleyCode"));
		String introduceCode = (commonMapper.getNewCode("eClassIntroduceCode", "introduceCode"));
		String sectionTitleCode = (commonMapper.getNewCode("eClassSectionTitleCode", "sectionTitleCode"));
		String curriculumCode = (commonMapper.getNewCode("eClassCurriculum", "curriculumCode"));
		String questionCode = (commonMapper.getNewCode("eClassQuestionCode", "questionCode"));
		String answerCode = (commonMapper.getNewCode("eClassAnswerCode", "answerCode"));
		
		eClassOpenApplyForm.seteClassOpenAppleyCode(openApplyCode);
		eClassOpenApplyForm.seteClassOpenApplyMemberEmail("id002@email.com");
		eClassIntroduce.seteClassIntroduceCode(introduceCode);
		eClassSectionTitle.seteClassSectionTitleCode(sectionTitleCode);
		eClassSectionCurriculum.seteClassSectionCurriculum(curriculumCode);
		eClassQuestion.seteClassQuestionCode(questionCode);
		eClassAnswer.seteClassAnswerCode(answerCode);
		
		int result = eClassMapper.EClassOpenApplyFormInsert(eClassOpenApplyForm, eClassApproved, eClassIntroduce, eClassSectionTitle, eClassSectionCurriculum, eClassQuestion, eClassAnswer);
		
		return result;
	}
}

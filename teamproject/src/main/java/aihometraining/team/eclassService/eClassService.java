package aihometraining.team.eclassService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassAnswer;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.EClassIntroduce;
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
	private static final Logger log = LoggerFactory.getLogger(eClassService.class);

	public eClassService(EClassMapper eClassMapper, CommonMapper commonMapper) {
		this.eClassMapper = eClassMapper;
		this.commonMapper = commonMapper;
	}
	
	//클래스 카테고리 조회
	public List<EClassCategorySmall> eClassCategoryList() {
		
		List<EClassCategorySmall> eClassCategoryList = eClassMapper.eClassCategoryList();
		
		return eClassCategoryList;
	}
	
	//클래스 신청 폼 introduce 등록처리
	public int EClassIntroduceInsert(EClassIntroduce eClassIntroduce) {
		
		log.info("EClassIntroduceInsert eClassIntroduce 데이터: {}", eClassIntroduce);
		String introduceCode = commonMapper.getNewCode("eClassIntroduceCode", "eclassintroduce");
		log.info("eClassService EClassIntroduceInsert introduceCode",introduceCode);
		eClassIntroduce.seteClassIntroduceCode(introduceCode);
		
		int result = eClassMapper.EClassIntroduceInsert(eClassIntroduce);
		
		return result;
	}
	
	//클래스 신청 폼 sectiontitle 등록처리
	public int EClassSectionTitleInsert(EClassSectionTitle eClassSectionTitle) {
		
		log.info("EClassSectionTitleInsert eClassSectionTitle 데이터: {}", eClassSectionTitle);
		String sectiontitleCode = commonMapper.getNewCode("eClassSectionTitleCode", "eclasssectiontitle");
		log.info("eClassService EClassSectionTitleInsert eClassSectionTitle", sectiontitleCode);
		eClassSectionTitle.seteClassSectionTitleCode(sectiontitleCode);
		
		int result = eClassMapper.EClassSectionTitleInsert(eClassSectionTitle);
		
		return result;
	}
	
	//클래스 신청 폼 sectionculum 등록처리
	public int EClassSectionCurriculumInsert(EClassSectionCurriculum eClassSectionCurriculum) {
		
		log.info("EClassSectionCurriculumInsert eClassSectionCurriculum 데이터: {}", eClassSectionCurriculum);
		String curriculumCode = commonMapper.getNewCode("eClassSectionCurriculumCode", "eclasssectioncurriculum");
		log.info("eClassService EClassSectionCurriculumInsert eClassSectionCurriculum", curriculumCode);
		eClassSectionCurriculum.seteClassSectionCurriculumCode(curriculumCode);
		
		int result = eClassMapper.EClassSectionCurriculumInsert(eClassSectionCurriculum);
		
		return result;
	}
	
	//클래스 신청 폼 question 등록처리
	public int EClassQuestionInsert(EClassQuestion eClassQuestion) {
		
		log.info("EClassQuestionInsert eClassQuestion 데이터: {}", eClassQuestion);
		String questionCode = commonMapper.getNewCode("eClassQuestionCode", "eclassquestion");
		log.info("eClassService EClassQuestionInsert eClassQuestion", questionCode);
		eClassQuestion.seteClassQuestionCode(questionCode);
		
		int result = eClassMapper.EClassQuestionInsert(eClassQuestion);
		
		return result;
	}
	
	//클래스 신청 폼 answer 등록처리
	public int EClassAnswerInsert(EClassAnswer eClassAnswer) {
		
		log.info("EClassAnswerInsert EClassAnswer 데이터: {}", eClassAnswer);
		String answerCode = commonMapper.getNewCode("EClassAnswerCode", "eclassanswer");
		log.info("eClassService EClassQuestionInsert eClassQuestion", answerCode);
		eClassAnswer.seteClassAnswerCode(answerCode);
		
		int result = eClassMapper.EClassAnswerInsert(eClassAnswer);
		
		return result;
	}
}

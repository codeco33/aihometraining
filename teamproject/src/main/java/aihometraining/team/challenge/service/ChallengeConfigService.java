package aihometraining.team.challenge.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeConfigMapper;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.mapper.CommonMapper;

@Service
@Transactional
public class ChallengeConfigService {
	
	//DI 의존성 주입
	private ChallengeConfigMapper challengeConfigMapper;
	private CommonMapper commonMapper;
	
	public ChallengeConfigService(ChallengeConfigMapper challengeConfigMapper, CommonMapper commonMapper) {
		this.challengeConfigMapper = challengeConfigMapper;
		this.commonMapper = commonMapper;
	}
	
	//챌린지 카테고리 조회
	public List<Map<String, Object>> getChallengeCategoryList(Map<String, Object> paramMap){
		//List<ChallengeCategory> challengeCategoryList =  challengeConfigMapper.getChallengeCategoryList(paramMap);
		List<Map<String, Object>> challengeCategoryList =  challengeConfigMapper.getChallengeCategoryList(paramMap);
		
		return challengeCategoryList;
		
	}
	
	//운동 클래스 카테고리 small 조회
	public List<EClassCategorySmall> getClassCategoryList() {
		
		List<EClassCategorySmall> classCategoryList = challengeConfigMapper.getClassCategoryList();
		
		return classCategoryList;
		
	}
	
	//카테고리 코드별 챌린지 카테고리 정보 조회
	public ChallengeCategory getChallengeCategoryByCode(String challengeCategoryCode) {
		
		ChallengeCategory challengeCategory = challengeConfigMapper.getChallengeCategoryByCode(challengeCategoryCode);
		
		return challengeCategory;
		
	}
	
	//카테고리 등록 처리
	public int challengeCategoryInsert(ChallengeCategory challengeCategory) {
		//pk컬럼에 들어갈 코드를 자동으로 만들어주는 Mapper      //pk로 쓸 db의 컬럼명                     //코드가 들어갈 db의 테이블명
		String newCode = commonMapper.getNewCode("challengeCategoryCode", "challengecategory");
		
		//dto에 위에서 만들어진 코드를 세팅해주기
		challengeCategory.setChallengeCategoryCode(newCode);
		challengeCategory.setMemberEmail("id001@email.com"); //로그인 처리가 아직 안이루어져서 임의로 해놓음!
		
		int result = challengeConfigMapper.challengeCategoryInsert(challengeCategory);
		
		return result;
		
	}
	
	//카테고리 수정처리
	public int challengeCategoryUpdate(ChallengeCategory challengeCategory) {
		
		challengeCategory.setMemberUpdateEmail("id001@email.com");//임시로 처리해둠
		
		int result = challengeConfigMapper.challengeCategoryUpdate(challengeCategory);
		
		return result;
	}
	
	//모집 챌린지 목록 조회
	public List<ChallengeGather> getGetherList(){
		
		List<ChallengeGather> gatherList = challengeConfigMapper.getGetherList();
		
		return gatherList;
		
	}
	
	//모집 챌린지 코드별 모집 챌린지 세부 정보 조회
	public List<ChallengeGather> getListDetailByCode(String challengeGatherCode){
		
		List<ChallengeGather> listDetail = challengeConfigMapper.getListDetailByCode(challengeGatherCode);
		
		return listDetail;
		
	}
}

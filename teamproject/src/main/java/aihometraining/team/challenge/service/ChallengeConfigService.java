package aihometraining.team.challenge.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeConfigMapper;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengePointGive;
import aihometraining.team.dto.ChallengeSetting;
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
	
	//챌린지 세팅 목록 조회
		public List<ChallengeSetting> getChallengeSettingList(){
			
			List<ChallengeSetting> challengeSettingList = challengeConfigMapper.getChallengeSettingList();
			
			return challengeSettingList;
			
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
	public int challengeCategoryInsert(ChallengeCategory challengeCategory, String sEmail) {
		//pk컬럼에 들어갈 코드를 자동으로 만들어주는 Mapper      //pk로 쓸 db의 컬럼명                     //코드가 들어갈 db의 테이블명
		String newCode = commonMapper.getNewCode("challengeCategoryCode", "challengecategory");
		
		
		
		//dto에 위에서 만들어진 코드를 세팅해주기
		challengeCategory.setChallengeCategoryCode(newCode);
		challengeCategory.setMemberEmail(sEmail); //로그인 처리가 아직 안이루어져서 임의로 해놓음!
		
		int result = challengeConfigMapper.challengeCategoryInsert(challengeCategory);
		
		return result;
		
	}
	
	//카테고리 수정처리
	public int challengeCategoryUpdate(ChallengeCategory challengeCategory, String sEmail) {
		
		//session에서 받아온 이메일값
		challengeCategory.setMemberUpdateEmail(sEmail);
		
		int result = challengeConfigMapper.challengeCategoryUpdate(challengeCategory);
		
		return result;
	}
	
	//카테고리 삭제처리 프로세스
		public void categoryDeleteBycateCode(String challengeCategoryCode) {
			//챌린지 카테고리 코드에 따른 신고내역 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.reportDeleteBycateCode(challengeCategoryCode);
			
			//챌린지 카테고리 코드에 따른 포인트내역 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.pointDeleteBycateCode(challengeCategoryCode);
			
			//챌린지 카테고리 코드에 따른 실행내역 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.planDoDeleteBycateCode(challengeCategoryCode);
			
			//챌린지 카테고리 코드에 따른 참가내역 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.enterDeleteBycateCode(challengeCategoryCode);
			
			//챌린지 카테고리 코드에 따른 모집계획 내역 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.planDeleteBycateCode(challengeCategoryCode);
			
			//챌린지 카테고리 코드에 따른 모집내역 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.gatherDeleteBycateCode(challengeCategoryCode);
			
			//챌린지 카테고리 코드에 따른 카테고리 삭제(챌린지 카테고리 삭제처리 )
			challengeConfigMapper.challengeCategoryDelete(challengeCategoryCode);
		}
	
	//세팅 등록 처리
	public void challengeSettingInsert(ChallengeSetting challengeSetting) {
		
		String newCode = commonMapper.getNewCode("challengeSettingCode", "challengesetting");
		
		challengeSetting.setChallengeSettingCode(newCode);
		
		challengeConfigMapper.challengeSettingInsert(challengeSetting);
		
	}
	
	//챌린지 세팅 코드 별 세팅정보 조회
	public ChallengeSetting getChallengeSettingByCode(String challengeSettingCode) {
		
		ChallengeSetting challengeSetting = challengeConfigMapper.getChallengeSettingByCode(challengeSettingCode);
		
		return challengeSetting;
		
	}
	
	//챌린지 세팅 수정 처리
	public void challengeSettingUpdate(ChallengeSetting challengeSetting) {
		
		challengeConfigMapper.challengeSettingUpdate(challengeSetting);
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
	
	//진행 챌린지 목록 조회
	public List<ChallengeGather> getChallengeIngList() {
		
		List<ChallengeGather> challengeIngList = challengeConfigMapper.getChallengeIngList();
		
		return challengeIngList;
		
	}
	
	//챌린지 포인트 관리 목록 조회
	public List<ChallengePointGive> getChallengePointList() {
		
		List<ChallengePointGive> pointList = challengeConfigMapper.getChallengePointList();
		
		return pointList;
		
	}
	
	//챌린지 포인트 코드별 포인트 관리 세부 조회
	public List<ChallengePointGive> getPointDetailByCode(String challengePointGiveCode) {
		
		List<ChallengePointGive> pointDetailList = challengeConfigMapper.getPointDetailByCode(challengePointGiveCode);
		
		return pointDetailList;
	}
}

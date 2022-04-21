package aihometraining.team.challenge.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.challenge.mapper.ChallengeGatherMapper;
import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlan;
import aihometraining.team.dto.ChallengeSetting;
import aihometraining.team.mapper.CommonMapper;

@Service
@Transactional
public class ChallengeGatherService {
	
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeGatherService.class);

	
	//DI 의존성 주입
	private ChallengeGatherMapper challengeGatherMapper;
	private CommonMapper commonMapper;
	
	public ChallengeGatherService(ChallengeGatherMapper challengeGatherMapper, CommonMapper commonMapper) {
		this.challengeGatherMapper = challengeGatherMapper;
		this.commonMapper = commonMapper;
	}
	
	//챌린지 모집 목록 조회
	public List<ChallengeGather> getChallengeGatherList() {
		List<ChallengeGather> challengeGatherLlist = challengeGatherMapper.getChallengeGatherList();
		return challengeGatherLlist;
		
	}
	
	//챌린지 카테고리 조회
	public List<ChallengeCategory> getChallengeCate() {
		
		List<ChallengeCategory> challengeCateList = challengeGatherMapper.getChallengeCate();
		
		return challengeCateList;
		
	}
	
	//챌린지 세팅 조회
	public List<ChallengeSetting> getChallengeSetting() {
		
		List<ChallengeSetting> challengeSettingList = challengeGatherMapper.getChallengeSetting();
		
		return challengeSettingList;
		
	}
	
	//챌린지 모집 등록 처리
	public void challengeGatherInsert(ChallengeGather challengeGather, ChallengeGatherPlan challengeGatherPlan, String sEmail) {//,dto하나더 추가하고(controller)
		//pk컬럼에 들어갈 코드를 자동으로 만들어주는 Mapper      //pk로 쓸 db의 컬럼명                     //코드가 들어갈 db의 테이블명
		String newCode1 = commonMapper.getNewCode("challengeGatherCode", "challengegather");
		challengeGather.setChallengeGatherCode(newCode1);
		
		String newCode2 = commonMapper.getNewCode("challengeGatherPlanCode", "challengegatherplan");
		challengeGatherPlan.setChallengeGatherPlanCode(newCode2);
		
		//날짜계산 도전!
		String stringStart = challengeGather.getChallengeStartDate(); //챌린지 시작기간 가져오기
		String stringEnd = challengeGather.getChallengeEndDate(); //챌린지 종료 기간 가져오기
		String stringProveFrequency = challengeGather.getChallengeGatherProveFrequency(); //인증빈도수 가져오기
		
		//데이터픽커로 선택한 기간을 기준으로 차이 계산하기(주)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US); //문자열을 날짜로 바꾸는법
		LocalDate startGatherDate = LocalDate.parse(stringStart, formatter); //문자열로 받은 챌린지 시작기간을 날짜로 바꿔줌
		LocalDate endGatherDate = LocalDate.parse(stringEnd, formatter); //문자열로 받은 챌린지 종료기간을 날짜로 바꿔줌
		
		//여쭤보자!
		LocalDate startDate = startGatherDate;
		LocalDate endDate = endGatherDate;
		
		//인증빈도수 long형변환
		long proveFrequency = Long.parseLong(stringProveFrequency);
		
		//데이터픽커로 선택한 기간을 기준으로 차이 계산하기(기간차이를 '주'로 계산해줌)
		long weekProve = ChronoUnit.WEEKS.between(startDate, endDate);
		
		
		String proveNumber = Long.toString(proveFrequency * weekProve); //빈도수 * 챌린지기간(주로계산됨)
		
		log.info("빈도수 * 챌린지기간(주로계산됨) proveNumber : {}", proveNumber);
		
		challengeGather.setMemberEmail(sEmail);
		
		//dto(커맨드객체2).set해당프로퍼티(?)(challengeGather.getChallengeCategoryCode());
		//challengeGatherPlan에 challengeGather의 입력값을 다시 넣는 과정
		challengeGatherPlan.setMemberEmail(challengeGather.getMemberEmail());
		challengeGatherPlan.setChallengeGatherCode(challengeGather.getChallengeGatherCode());
		challengeGatherPlan.setChallengeCategoryCode(challengeGather.getChallengeCategoryCode());
		challengeGatherPlan.setChallengeGatherChallengeStartDate(challengeGather.getChallengeStartDate());
		challengeGatherPlan.setChallengeGatherChallengeLastDate(challengeGather.getChallengeEndDate());
		challengeGatherPlan.setChallengeGatherPlanProveNumber(proveNumber);
		
		//챌린지 모집 등록 처리
		challengeGatherMapper.challengeGatherInsert(challengeGather);
		
		//챌린지 모집 계획 등록처리
		challengeGatherMapper.challengeGatherPlanInsert(challengeGatherPlan);
		
	}
	
	//챌린지 개설자 가져오기
	public String getChallengeMaker(String memberEmail) {
		
		String getMater = challengeGatherMapper.getChallengeMaker(memberEmail);
		
		return getMater;
		
	}
	
	
	
}

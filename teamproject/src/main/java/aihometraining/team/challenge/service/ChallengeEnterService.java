package aihometraining.team.challenge.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import aihometraining.team.challenge.mapper.ChallengeEnterMapper;
import aihometraining.team.dto.ChallengeEnter;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlanDo;
import aihometraining.team.dto.FileDto;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.mapper.FileMapper;
import aihometraining.team.util.FileUtil;

@Service
@Transactional
public class ChallengeEnterService {
	
	private static final Logger log = LoggerFactory.getLogger(ChallengeEnterService.class);

	
	//DI 의존성 주입
	private ChallengeEnterMapper challengeEnterMapper;
	private CommonMapper commonMapper;
	private FileUtil fileUtil;
	private FileMapper fileMapper;
	
	public ChallengeEnterService(ChallengeEnterMapper challengeEnterMapper, CommonMapper commonMapper,FileUtil fileUtil, FileMapper fileMapper) {
		this.challengeEnterMapper = challengeEnterMapper;
		this.commonMapper = commonMapper;
		this.fileUtil =  fileUtil;
		this.fileMapper = fileMapper;
	}
	
	//회원 이메일별 참가 챌린지 목록 조회
	public List<ChallengeEnter> getChallengeEnterListByEmail(String sEmail){
		
		List<ChallengeEnter> challengeEnterList = challengeEnterMapper.getChallengeEnterListByEmail(sEmail);
		
		return challengeEnterList;
		
	}
	
	//결제후 참가처리
	public void challengeEnterInsert(ChallengeEnter challengeEnter,ChallengeGatherPlanDo challengeGatherPlanDo,String sEmail) {
		//pk컬럼에 들어갈 코드를 자동으로 만들어주는 Mapper      //pk로 쓸 db의 컬럼명                     //코드가 들어갈 db의 테이블명
		String newCode = commonMapper.getNewCode("challengeEnterCode", "challengeenter");
		log.info("새로 생성된 코드 newCode : {}",newCode);
		String newPayCode = commonMapper.getNewCode("paymentGroupCode", "challengeenter");
		log.info("새로 생성된 코드 newPayCode : {}",newPayCode);
		
		
		challengeEnter.setChallengeEnterCode(newCode);
		challengeEnter.setMemberEmail(sEmail);
		challengeEnter.setPaymentGroupCode(newPayCode);
		
		//결제후 참가처리
		challengeEnterMapper.challengeEnterInsert(challengeEnter);
		
		log.info("참가처리(service) challengeEnter: {}", challengeEnter);
		
		int planProveNumber =  Integer.parseInt(challengeEnter.getChallengeGatherPlan().getChallengeGatherPlanProveNumber()); //필수 인증횟수 = 실행테이블에 insert처리될 갯수
		for(int i=1; i<=planProveNumber; i++) {
			String newPlanDoCode = commonMapper.getNewCode("challengeGatherPlanDoCode", "challengegatherplando");
			log.info("새로 생성된 코드 newPlanDoCode : {}",newPlanDoCode);
			challengeGatherPlanDo.setChallengeGatherPlanDoCode(newPlanDoCode);
			challengeGatherPlanDo.setChallengeGatherPlanCode(challengeEnter.getChallengeGatherPlan().getChallengeGatherPlanCode());
			challengeGatherPlanDo.setMemberEmail(challengeEnter.getChallengeGather().getMemberEmail());
			challengeGatherPlanDo.setChallengeCategoryCode(challengeEnter.getChallengeCategoryCode());
			challengeGatherPlanDo.setChallengeSettingCode(challengeEnter.getChallengeGatherPlan().getChallengeSettingCode());
			challengeGatherPlanDo.setChallengeGatherCode(challengeEnter.getChallengeGatherCode());
			challengeGatherPlanDo.setMemberEnterEmail(challengeEnter.getMemberEmail());
			challengeGatherPlanDo.setChallengeGatherPlanDoState("미인증");
			challengeGatherPlanDo.setChallengeGatherPlanDoProveRound(i);
			log.info(" 참가자 실행테이블에 등록처리(service) challengeGatherPlanDo: {}", challengeGatherPlanDo);
			
			//결제후 참가처리시 동시에 참가자 실행테이블에 등록처리
			challengeEnterMapper.challengeGatherPlanDoInsert(challengeGatherPlanDo);
		}
		
		/*
		 * String newPlanDoCode = commonMapper.getNewCode("challengeGatherPlanDoCode",
		 * "challengegatherplando");
		 * log.info("새로 생성된 코드 newPlanDoCode : {}",newPlanDoCode);
		 * challengeGatherPlanDo.setChallengeGatherPlanDoCode(newPlanDoCode);
		 * challengeGatherPlanDo.setChallengeGatherPlanCode(challengeEnter.
		 * getChallengeGatherPlan().getChallengeGatherPlanCode());
		 * challengeGatherPlanDo.setMemberEmail(challengeEnter.getChallengeGather().
		 * getMemberEmail());
		 * challengeGatherPlanDo.setChallengeCategoryCode(challengeEnter.
		 * getChallengeCategoryCode());
		 * challengeGatherPlanDo.setChallengeSettingCode(challengeEnter.
		 * getChallengeGatherPlan().getChallengeSettingCode());
		 * challengeGatherPlanDo.setChallengeGatherCode(challengeEnter.
		 * getChallengeGatherCode());
		 * challengeGatherPlanDo.setMemberEnterEmail(challengeEnter.getMemberEmail());
		 */
		
	}
	
	//참가 챌린지의 세부 정보 조회
	public ChallengeGather getChallengeEnterByCode(String challengeGatherCode) {
		
		//챌린지 EnterDetail의 공통부분 목록 조회
		ChallengeGather enterDetail = challengeEnterMapper.getChallengeEnterByCode(challengeGatherCode);
		
		//List<ChallengeGatherPlanDo> ChallengeGatherPlanDoList = challengeEnterMapper.getChallengeEnterDetail(challengeGatherCode);
		//enterDetail.setChallengeGatherPlanDoList(ChallengeGatherPlanDoList);
		log.info("참가챌린지 세부 정보 조회(service) enterDetail: {}", enterDetail);
		
		
		return enterDetail;
		
	}
	//실행 코드별 챌린지 정보 조회
	public List<ChallengeGatherPlanDo> getPlanDoProveByCode(String challengeGatherPlanDoCode) {
		
		List<ChallengeGatherPlanDo> planDoProveByCode = challengeEnterMapper.getPlanDoProveByCode(challengeGatherPlanDoCode);
		
		
		return planDoProveByCode;
		
	}
	
	//참가 코드와 이메일별 인증 목록 조회
	public List<ChallengeGatherPlanDo> getPlanDoListByCodeAndEmail(String challengeEnterCode, String sEmail){
		
		log.info("참가 코드와 이메일별 인증 목록 조회(service) challengeEnterCode: {}", challengeEnterCode);
		log.info("참가 코드와 이메일별 인증 목록 조회(service) sEmail: {}", sEmail);
		
		List<ChallengeGatherPlanDo> getPlanDoList = challengeEnterMapper.getPlanDoListByCodeAndEmail(challengeEnterCode, sEmail);
		
		log.info("참가 코드와 이메일별 인증 목록 조회(service) getPlanDoList: {}", getPlanDoList);
		
		return getPlanDoList;
		
	}
	
	//참가 챌린지 인증 등록처리(update처리)
	public int challengePlanDoInsert(ChallengeGatherPlanDo challengeGatherPlanDo,String sEmail, MultipartFile[] fileImage, String fileRealPath) {
		log.info("참가 인증 폼 입력데이터(service) challengeGatherPlanDo: {}", challengeGatherPlanDo);
		
		
		challengeGatherPlanDo.setChallengeGatherPlanDoState("인증");
		challengeGatherPlanDo.setMemberEnterEmail(sEmail);
		
		String planDoCode = challengeGatherPlanDo.getChallengeGatherPlanDoCode();
		log.info("참가 인증 폼 입력데이터(service) planDoCode : {}", planDoCode);
		
		int result = challengeEnterMapper.challengePlanDoInsert(challengeGatherPlanDo);
		
		
		
		List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
		
		fileMapper.addFiles(fileList);
		
		List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
		
		Map<String, String> paramMap = null; 
		
		for(FileDto fileDto : fileList) {
			paramMap =  new HashMap<String, String>();
			paramMap.put("referenceCode", planDoCode);
			paramMap.put("fileIdx", fileDto.getFileIdx());
			paramList.add(paramMap);
		}
		
		fileMapper.addFileControl(paramList);
		
		return result;
		
	}
}

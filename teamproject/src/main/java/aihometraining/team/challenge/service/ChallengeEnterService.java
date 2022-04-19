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
	
	//참가 챌린지의 세부 정보 조회
	public ChallengeGather getChallengeEnterByCode(String challengeGatherCode) {
		
		//챌린지 EnterDetail의 공통부분 목록 조회
		ChallengeGather enterDetail = challengeEnterMapper.getChallengeEnterByCode(challengeGatherCode);
		
		//List<ChallengeGatherPlanDo> ChallengeGatherPlanDoList = challengeEnterMapper.getChallengeEnterDetail(challengeGatherCode);
		//enterDetail.setChallengeGatherPlanDoList(ChallengeGatherPlanDoList);
		log.info("참가챌린지 세부 정보 조회(service) enterDetail: {}", enterDetail);
		
		
		return enterDetail;
		
	}
	//참가 챌린지 코드별 챌린지 정보 조회
	public List<ChallengeEnter> getChallengeEnterListByCode(String challengeEnterCode) {
		
		List<ChallengeEnter> challengeEnterByCode = challengeEnterMapper.getChallengeEnterListByCode(challengeEnterCode);
		
		
		return challengeEnterByCode;
		
	}
	
	//챌린지 인증 등록 처리
	public int challengePlanDoInsert(ChallengeGatherPlanDo challengeGatherPlanDo,String sEmail, MultipartFile[] fileImage, String fileRealPath) {
		log.info("참가 인증 폼 입력데이터(service) challengeGatherPlanDo: {}", challengeGatherPlanDo);
		
		String newCode = commonMapper.getNewCode("challengeGatherPlanDoCode", "challengegatherplando");
		log.info("새로 생성된 코드: {}",newCode);
		
		challengeGatherPlanDo.setChallengeGatherPlanDoCode(newCode);
		challengeGatherPlanDo.setMemberEnterEmail(sEmail);
		
		int result = challengeEnterMapper.challengePlanDoInsert(challengeGatherPlanDo);
		
		List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
		
		fileMapper.addFiles(fileList);
		
		List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
		
		Map<String, String> paramMap = null; 
		
		for(FileDto fileDto : fileList) {
			paramMap =  new HashMap<String, String>();
			paramMap.put("referenceCode", newCode);
			paramMap.put("fileIdx", fileDto.getFileIdx());
			paramList.add(paramMap);
		}
		
		fileMapper.addFileControl(paramList);
		
		return result;
		
	}
}

package aihometraining.team.workoutLog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.FileDto;
import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogLike;
import aihometraining.team.dto.WorkoutLogPrivacybounds;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.mapper.FileMapper;
import aihometraining.team.util.FileUtil;
import aihometraining.team.workoutLog.mapper.WorkoutLogUserMapper;

@Service
@Transactional
public class WorkoutLogUserService {
	
	
	private static final Logger log = LoggerFactory.getLogger(WorkoutLogUserService.class);

	
	//DI 의존성 주입 생성자메소드 주입방식
	private WorkoutLogUserMapper workoutLogUserMapper; 
	private CommonMapper commonMapper;
	private FileUtil fileUtil;
	private FileMapper fileMapper;
	
	@Autowired
	public WorkoutLogUserService(WorkoutLogUserMapper workoutLogUserMapper, CommonMapper commonMapper, FileUtil fileUtil, FileMapper fileMapper) {
		
		this.workoutLogUserMapper = workoutLogUserMapper;
		this.commonMapper = commonMapper;
		this.fileUtil =  fileUtil;
		this.fileMapper = fileMapper;
		
	}
	
	// 일지 좋아요 등록
	public int workoutLogLikeInsert(WorkoutLogLike workoutLogLike) {
		
		String num = commonMapper.getNewCode("workoutLogLikeNum", "workoutloglike");
		workoutLogLike.setWorkoutLogLikeNum(num);
		
		int result = workoutLogUserMapper.workoutLogLikeInsert(workoutLogLike);
		
		return result;
	}
	
	//일지 좋아요 카운트
	public void workoutLogLikeCountUpdate(String workoutLogCode) {
		
		workoutLogUserMapper.workoutLogLikeCountUpdate(workoutLogCode);
		
	}
	
	//일지 목록 조회
	public List<WorkoutLog>	getworkoutLogList(){
		
		List<WorkoutLog> workoutLogList = workoutLogUserMapper.getworkoutLogList();
		
		log.info("workoutLogList : {}", workoutLogList);
		
		return workoutLogList;
		
	}
	
	//일지 코드로 일지 목록 조회
	public WorkoutLog getworkoutLogByCode(String workoutLogCode) {
		
		return workoutLogUserMapper.getworkoutLogByCode(workoutLogCode);
		
	}
	
	
	// 일지 등록 처리
	public int workoutLogInsert(WorkoutLog workoutLog, String sessionEmail, MultipartFile[] fileImage, String fileRealPath) {
		
		String code = commonMapper.getNewCode("workoutLogCode", "workoutlog");
		workoutLog.setWorkoutLogCode(code);
		workoutLog.setMemberEmail(sessionEmail);	
		
		int result =workoutLogUserMapper.workoutLogInsert(workoutLog);
		
		List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
		
		fileMapper.addFiles(fileList);
		
		List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
		
		Map<String, String> paramMap = null; 
		
		for(FileDto fileDto : fileList) {
			paramMap =  new HashMap<String, String>();
			paramMap.put("referenceCode", code);
			paramMap.put("fileIdx", fileDto.getFileIdx());
			paramList.add(paramMap);
		}
		
		fileMapper.addFileControl(paramList);
		
		return result;
	}

	
	// 운동 목표 목록 조회
	public List<WorkoutGoal> getworkoutGoalList(){
	
		List<WorkoutGoal> workoutGoalList = workoutLogUserMapper.getworkoutGoalList();
		
		return workoutGoalList;
		
	}
	
	// 일지 공개범위 목록 조회
	public List<WorkoutLogPrivacybounds> getworkoutLogPrivacyboundsList(){
		
		List<WorkoutLogPrivacybounds> workoutLogprivacyboundsList = workoutLogUserMapper.getworkoutLogPrivacyboundsList();
		
		return workoutLogprivacyboundsList;
	}
	
	// 운동 클래스 카테고리 large 목록 조회
	public List<EClassCategoryLarge> geteClassCategoryLargeList(){
		
		List<EClassCategoryLarge> eClassCategoryLargeList = workoutLogUserMapper.geteClassCategoryLargeList();
		
		return eClassCategoryLargeList;
		
	}
	
	
	
}

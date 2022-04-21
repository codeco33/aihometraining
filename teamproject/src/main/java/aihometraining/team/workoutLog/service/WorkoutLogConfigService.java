package aihometraining.team.workoutLog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import aihometraining.team.dto.AIVideo;
import aihometraining.team.dto.FileDto;
import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogCategory;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.mapper.FileMapper;
import aihometraining.team.util.FileUtil;
import aihometraining.team.workoutLog.mapper.WorkoutLogConfigMapper;
import ch.qos.logback.classic.Logger;

@Service
@Transactional
public class WorkoutLogConfigService {
	
	//DI 의존성 주입 생성자메소드 주입방식
	private WorkoutLogConfigMapper workoutLogConfigMapper;
	private CommonMapper commonMapper;
	private FileUtil fileUtil;
	private FileMapper fileMapper;
	
	@Autowired
	public WorkoutLogConfigService(WorkoutLogConfigMapper workoutLogConfigMapper, CommonMapper commonMapper, FileUtil fileUtil, FileMapper fileMapper) {
		this.workoutLogConfigMapper = workoutLogConfigMapper;
		this.commonMapper = commonMapper;
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
		
	}
	
	// 운동 계획 카테고리 목록 조회
	public List<Map<String, Object>> getWorkoutLogCategoryList(Map<String,Object> paramMap){
		
		List<Map<String, Object>> workoutLogCategoryList = workoutLogConfigMapper.getWorkoutLogCategoryList(paramMap);
		
		return workoutLogCategoryList;
		
	}
	
	// 운동 계획 카테고리 등록 처리
	public int workoutGoalCategoryInsert(WorkoutLogCategory workoutLogCategory) {
		
		String code = commonMapper.getNewCode("workoutGoalPlanCategoryCode", "workoutgoalplancategory");
		workoutLogCategory.setWorkoutGoalPlanCategoryCode(code);
		
		int result = workoutLogConfigMapper.workoutGoalCategoryInsert(workoutLogCategory);
		
		return result;
		
	}
	
	// 운동 계획 카테고리 삭제 처리
	public void workoutGoalCategoryDelete(String workoutGoalPlanCategoryCode) {
		
		workoutLogConfigMapper.GoalPlanInCategoryCodeDelete(workoutGoalPlanCategoryCode);
		workoutLogConfigMapper.workoutLogCategoryDelete(workoutGoalPlanCategoryCode);
		
	}
	
	
	// 운동 일지 목록 조회
	public List<Map<String, Object>> getWorkoutLogList(Map<String, Object> paramMap){
		
		List<Map<String, Object>> workoutLogList = workoutLogConfigMapper.getWorkoutLogList(paramMap);
		
		return workoutLogList;
		
	}
	
	// 새롭게 등록된 일지 조회
	public List<WorkoutLog> getNewWorkoutLog(){
		
		List<WorkoutLog> workoutLogNewList = workoutLogConfigMapper.getNewWorkoutLog();
		
		return workoutLogNewList;
		
	}
	
	//AIVideo 영상(이미지 대체) 등록 처리
	public int workoutAIVideoInsert(AIVideo aiVideo, String sessionEmail, MultipartFile[] fileImage, String fileRealPath) {
		
		String filecode = commonMapper.getNewCode("fileIdx", "aivideo");
		aiVideo.setFileIdx(filecode);
		aiVideo.setMemberEmail(sessionEmail);
		
		int result = workoutLogConfigMapper.workoutAIVideoInsert(aiVideo);
		
		List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
		
		fileMapper.addFiles(fileList);
		
		List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
		
		Map<String, String> paramMap = null; 
		
		for(FileDto fileDto : fileList) {
			paramMap =  new HashMap<String, String>();
			paramMap.put("referenceCode", filecode);
			paramMap.put("fileIdx", fileDto.getFileIdx());
			paramList.add(paramMap);
		}
		
		fileMapper.addFileControl(paramList);
		
		return result;
		
	}
	
	//AIVideo 영상 목록 조회
	public List<AIVideo> getWorkoutAIVideoList(){
		
		List<AIVideo> AIVideoList =  workoutLogConfigMapper.getWorkoutAIVideoList();
		
		return AIVideoList;
		
	}
	
	//ajax 등록이미지 조회
		public List<AIVideo> workoutAIVideoImg(String AIVideoImgCodes){
			
			List<AIVideo> workoutAIVideoImgCodes = workoutLogConfigMapper.workoutAIVideoImg(AIVideoImgCodes);
			
			
			
			return workoutAIVideoImgCodes;
			
		}
	
}

package aihometraining.team.workoutLog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogPrivacybounds;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.workoutLog.mapper.WorkoutLogUserMapper;

@Service
@Transactional
public class WorkoutLogUserService {
	
	//DI 의존성 주입 생성자메소드 주입방식
	private WorkoutLogUserMapper workoutLogUserMapper; 
	private CommonMapper commonMapper;
	
	@Autowired
	public WorkoutLogUserService(WorkoutLogUserMapper workoutLogUserMapper, CommonMapper commonMapper) {
		
		this.workoutLogUserMapper = workoutLogUserMapper;
		this.commonMapper = commonMapper;
		
	}
	
	// 일지 등록 처리
	public int workoutLogInsert(WorkoutLog workoutLog) {
		
		String code = commonMapper.getNewCode("workoutLogcode", "workoutlog");
		workoutLog.setWorkoutLogcode(code);
		workoutLog.setMemberEmail("id004@email.com");	//로그인 처리가 아직 안이루어져서 임의로 해놓음!
		
		int result = workoutLogUserMapper.workoutLogInsert(workoutLog);
		
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
	
	// 운동 클래스 카테고리 small 목록 조회
	public List<EClassCategorySmall> geteClassCategorySmallList(){
		
		List<EClassCategorySmall> eClassCategorySmallList = workoutLogUserMapper.geteClassCategorySmallList();
		
		return eClassCategorySmallList;
		
	}
	
	
}

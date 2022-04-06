package aihometraining.team.workoutLog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogCategory;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.workoutLog.mapper.WorkoutLogConfigMapper;

@Service
@Transactional
public class WorkoutLogConfigService {
	
	//DI 의존성 주입 생성자메소드 주입방식
	private WorkoutLogConfigMapper workoutLogConfigMapper;
	private CommonMapper commonMapper;
	
	@Autowired
	public WorkoutLogConfigService(WorkoutLogConfigMapper workoutLogConfigMapper, CommonMapper commonMapper) {
		this.workoutLogConfigMapper = workoutLogConfigMapper;
		this.commonMapper = commonMapper;
	}
	
	// 운동 계획 카테고리 목록 조회
	public List<WorkoutLogCategory> getWorkoutLogCategoryList(){
		
		List<WorkoutLogCategory> workoutLogCategoryList = workoutLogConfigMapper.getWorkoutLogCategoryList();
		
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
		
		workoutLogConfigMapper.workoutLogCategoryDelete(workoutGoalPlanCategoryCode);
		
	}
	
	
	// 운동 일지 목록 조회
	public List<WorkoutLog> getWorkoutLogList(){
		
		List<WorkoutLog> workoutLogList = workoutLogConfigMapper.getWorkoutLogList();
		
		return workoutLogList;
		
	}
}

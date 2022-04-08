package aihometraining.team.workoutLog.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogCategory;

@Mapper
public interface WorkoutLogConfigMapper {
	
	//운동 카테고리 조회
	public List<WorkoutLogCategory> getWorkoutLogCategoryList();
	
	//운동 카테고리 등록
	public int workoutGoalCategoryInsert(WorkoutLogCategory workoutLogCategory);
	
	//운동 일지 목록 조회
	public List<WorkoutLog> getWorkoutLogList();
	
	/*
	 * 모달에서 운동 계획 카테고리명 가져오기 
	 * public WorkoutLogCategory getWorkoutLogCategoryModal(String workoutGoalPlanCategoryCode);
	 * 
	 */
	
	//모달에서 운동 계획 카테고리명 수정 처리 
	public int workoutLogCategoryUpdateModal(Map<String, Object> paramMap);
	
	//운동 계획 카테고리 삭제 
	public int workoutLogCategoryDelete(String workoutGoalPlanCategoryCode);
	
	//운동 계획 카테고리 코드에 따른 운동 계획 삭제 
	public int workoutLogGoalPlanDelete(String workoutGoalPlanCategoryCode);
	 
	 
	
}

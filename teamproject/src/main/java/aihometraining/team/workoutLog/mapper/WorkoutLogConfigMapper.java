package aihometraining.team.workoutLog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.WorkoutLogCategory;

@Mapper
public interface WorkoutLogConfigMapper {
	
	//운동 카테고리 조회
	public List<WorkoutLogCategory> getWorkoutLogCategoryList();
	
	//운동 카테고리 등록
	public int workoutGoalCategoryInsert(WorkoutLogCategory workoutLogCategory);

}

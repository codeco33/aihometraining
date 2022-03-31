package aihometraining.team.workoutLog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.WorkoutGoal;

@Mapper
public interface WorkoutLogUserMapper {
	
	//운동 카테고리 조회
		public List<WorkoutGoal> getworkoutGoalList();

}

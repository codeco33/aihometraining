package aihometraining.team.workoutLog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.workoutLog.mapper.WorkoutLogUserMapper;

@Service
@Transactional
public class WorkoutLogUserService {
	
	//DI 의존성 주입 생성자메소드 주입방식
	private WorkoutLogUserMapper workoutLogUserMapper; 
	
	@Autowired
	public WorkoutLogUserService(WorkoutLogUserMapper workoutLogUserMapper) {
		
		this.workoutLogUserMapper = workoutLogUserMapper;
		
	}
	
	public List<WorkoutGoal> getworkoutGoalList(){
	
		List<WorkoutGoal> workoutGoalList = workoutLogUserMapper.getworkoutGoalList();
		
		return workoutGoalList;
		
	}
}

package aihometraining.team.workoutLog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.WorkoutLogCategory;
import aihometraining.team.workoutLog.mapper.WorkoutLogConfigMapper;

@Service
@Transactional
public class WorkoutLogConfigService {
	
	//DI 의존성 주입 생성자메소드 주입방식
	private WorkoutLogConfigMapper workoutLogConfigMapper; 
	
	@Autowired
	public WorkoutLogConfigService(WorkoutLogConfigMapper workoutLogConfigMapper) {
		this.workoutLogConfigMapper = workoutLogConfigMapper;
	}
	
	public List<WorkoutLogCategory> getWorkoutLogCategoryList(){
		
		List<WorkoutLogCategory> workoutLogCategoryList = workoutLogConfigMapper.getWorkoutLogCategoryList();
		
		return workoutLogCategoryList;
		
	}
}

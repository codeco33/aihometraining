package aihometraining.team.workoutLog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.EClassCategoryMedium;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.dto.WorkoutGoal;
import aihometraining.team.dto.WorkoutLog;
import aihometraining.team.dto.WorkoutLogLike;
import aihometraining.team.dto.WorkoutLogPrivacybounds;

@Mapper
public interface WorkoutLogUserMapper {
	
	//운동 목표 조회
	public List<WorkoutGoal> getworkoutGoalList();
		
	//일지 공개범위 목록 조회
	public List<WorkoutLogPrivacybounds> getworkoutLogPrivacyboundsList();
		
	//운동 클래스 카테고리 large 목록 조회	
	public List<EClassCategoryLarge> geteClassCategoryLargeList();
		
	//운동 클래스 카테고리 medium 목록 조회
	public List<EClassCategoryMedium> geteClassCategoryMedium(String eClassCategoryLargeCode);
		
	//운동 클래스 카테고리 medium 목록 조회
	public List<EClassCategorySmall> geteClassCategorySmall(String eClassCategoryMediumCode);
	
	//일지 등록 처리
	public int workoutLogInsert(WorkoutLog workoutLog);
		
	//일지 목록 조회
	public List<WorkoutLog>	getworkoutLogList();
	
	//일지 좋아요 카운트 값 수정하기
	public void workoutLogLikeCountUpdate(String workoutLogCode);
	
	//일지 좋아요카운트 값 가져오기
	public String getworkoutLogLikeCount(String workoutLogCode);
	
	//일지 좋아요 등록 처리
	public int workoutLogLikeInsert(WorkoutLogLike workoutLogLike);
	
	//일지 좋아요 목록 조회
	public List<WorkoutLogLike> getworkoutLogLikeList();
		
	
	

		
}

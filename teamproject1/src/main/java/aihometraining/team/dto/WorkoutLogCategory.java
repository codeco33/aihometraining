package aihometraining.team.dto;

public class WorkoutLogCategory {

	private String workoutGoalPlanCategoryCode;
	private String workoutGoalPlanCategoryContent;
	
	
	public String getWorkoutGoalPlanCategoryCode() {
		return workoutGoalPlanCategoryCode;
	}
	public void setWorkoutGoalPlanCategoryCode(String workoutGoalPlanCategoryCode) {
		this.workoutGoalPlanCategoryCode = workoutGoalPlanCategoryCode;
	}
	public String getWorkoutGoalPlanCategoryContent() {
		return workoutGoalPlanCategoryContent;
	}
	public void setWorkoutGoalPlanCategoryContent(String workoutGoalPlanCategoryContent) {
		this.workoutGoalPlanCategoryContent = workoutGoalPlanCategoryContent;
	}
	
	
	@Override
	public String toString() {
		return "WorkoutLogCategory [workoutGoalPlanCategoryCode=" + workoutGoalPlanCategoryCode
				+ ", workoutGoalPlanCategoryContent=" + workoutGoalPlanCategoryContent + "]";
	}
	
	
	
	
	
}

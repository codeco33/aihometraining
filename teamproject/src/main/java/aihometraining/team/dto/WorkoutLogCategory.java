package aihometraining.team.dto;

public class WorkoutLogCategory {

	private String workoutGoalPlanCategory;
	private String workoutGoalPlanCategoryContent;
	
	
	public String getWorkoutGoalPlanCategory() {
		return workoutGoalPlanCategory;
	}
	public void setWorkoutGoalPlanCategory(String workoutGoalPlanCategory) {
		this.workoutGoalPlanCategory = workoutGoalPlanCategory;
	}
	public String getWorkoutGoalPlanCategoryContent() {
		return workoutGoalPlanCategoryContent;
	}
	public void setWorkoutGoalPlanCategoryContent(String workoutGoalPlanCategoryContent) {
		this.workoutGoalPlanCategoryContent = workoutGoalPlanCategoryContent;
	}
	
	@Override
	public String toString() {
		return "WorkoutLogCategory [workoutGoalPlanCategory=" + workoutGoalPlanCategory
				+ ", workoutGoalPlanCategoryContent=" + workoutGoalPlanCategoryContent + "]";
	}
	
	
	
	
}

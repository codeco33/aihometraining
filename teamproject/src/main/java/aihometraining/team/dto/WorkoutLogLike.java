package aihometraining.team.dto;

public class WorkoutLogLike {
	
	/*
	 * workoutLogLikeNum 
	 * workoutLogLikeEmail 
	 * workoutLogCode 
	 * workoutLogLikeRegDate
	 */
	
	private String workoutLogLikeNum;
	private String workoutLogLikeEmail;
	private String workoutLogCode;
	private String workoutLogLikeRegDate;
	
	private Member member;
	private WorkoutLog workoutLog;
	
	
	
	public String getWorkoutLogLikeNum() {
		return workoutLogLikeNum;
	}
	public void setWorkoutLogLikeNum(String workoutLogLikeNum) {
		this.workoutLogLikeNum = workoutLogLikeNum;
	}
	public String getWorkoutLogLikeEmail() {
		return workoutLogLikeEmail;
	}
	public void setWorkoutLogLikeEmail(String workoutLogLikeEmail) {
		this.workoutLogLikeEmail = workoutLogLikeEmail;
	}
	public String getWorkoutLogCode() {
		return workoutLogCode;
	}
	public void setWorkoutLogCode(String workoutLogCode) {
		this.workoutLogCode = workoutLogCode;
	}
	public String getWorkoutLogLikeRegDate() {
		return workoutLogLikeRegDate;
	}
	public void setWorkoutLogLikeRegDate(String workoutLogLikeRegDate) {
		this.workoutLogLikeRegDate = workoutLogLikeRegDate;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkoutLogLike [workoutLogLikeNum=");
		builder.append(workoutLogLikeNum);
		builder.append(", workoutLogLikeEmail=");
		builder.append(workoutLogLikeEmail);
		builder.append(", workoutLogCode=");
		builder.append(workoutLogCode);
		builder.append(", workoutLogLikeRegDate=");
		builder.append(workoutLogLikeRegDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	

}

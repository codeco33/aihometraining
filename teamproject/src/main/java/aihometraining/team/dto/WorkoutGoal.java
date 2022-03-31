package aihometraining.team.dto;

public class WorkoutGoal {
	
	private String workoutGoalCode;
	private String memberEmail;
	private String workoutGoalContent;
	private String workoutGoalStartDate;
	private String workoutGoalEndDate;
	private String workoutGoalUpdateDate;
	private String memberUpdateEmail;
	
	public String getWorkoutGoalCode() {
		return workoutGoalCode;
	}
	public void setWorkoutGoalCode(String workoutGoalCode) {
		this.workoutGoalCode = workoutGoalCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getWorkoutGoalContent() {
		return workoutGoalContent;
	}
	public void setWorkoutGoalContent(String workoutGoalContent) {
		this.workoutGoalContent = workoutGoalContent;
	}
	public String getWorkoutGoalStartDate() {
		return workoutGoalStartDate;
	}
	public void setWorkoutGoalStartDate(String workoutGoalStartDate) {
		this.workoutGoalStartDate = workoutGoalStartDate;
	}
	public String getWorkoutGoalEndDate() {
		return workoutGoalEndDate;
	}
	public void setWorkoutGoalEndDate(String workoutGoalEndDate) {
		this.workoutGoalEndDate = workoutGoalEndDate;
	}
	public String getWorkoutGoalUpdateDate() {
		return workoutGoalUpdateDate;
	}
	public void setWorkoutGoalUpdateDate(String workoutGoalUpdateDate) {
		this.workoutGoalUpdateDate = workoutGoalUpdateDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkoutLogGoal [workoutGoalCode=");
		builder.append(workoutGoalCode);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", workoutGoalContent=");
		builder.append(workoutGoalContent);
		builder.append(", workoutGoalStartDate=");
		builder.append(workoutGoalStartDate);
		builder.append(", workoutGoalEndDate=");
		builder.append(workoutGoalEndDate);
		builder.append(", workoutGoalUpdateDate=");
		builder.append(workoutGoalUpdateDate);
		builder.append(", memberUpdateEmail=");
		builder.append(memberUpdateEmail);
		builder.append("]");
		return builder.toString();
	}

	
	
}

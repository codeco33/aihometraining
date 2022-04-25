package aihometraining.team.dto;

public class WorkoutGoal {
	
	private String workoutGoalCode;
	private String memberEmail;
	private String workoutGoalContent;
	private String workoutGoalStartDate;
	private String workoutGoalEndDate;
	private String workoutGoalUpdateDate;
	private String memberUpdateEmail;
	private String eClassApprovedCode;
	private String eClassTakeCode;
	
	private Member member;
	private EClassApproved eClassApproved;
	private EClassTake eClassTake;
	
	
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
	public String geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(String eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
	}
	public String geteClassTakeCode() {
		return eClassTakeCode;
	}
	public void seteClassTakeCode(String eClassTakeCode) {
		this.eClassTakeCode = eClassTakeCode;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public EClassApproved geteClassApproved() {
		return eClassApproved;
	}
	public void seteClassApproved(EClassApproved eClassApproved) {
		this.eClassApproved = eClassApproved;
	}
	public EClassTake geteClassTake() {
		return eClassTake;
	}
	public void seteClassTake(EClassTake eClassTake) {
		this.eClassTake = eClassTake;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkoutGoal [workoutGoalCode=");
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
		builder.append(", eClassApprovedCode=");
		builder.append(eClassApprovedCode);
		builder.append(", eClassTakeCode=");
		builder.append(eClassTakeCode);
		builder.append(", member=");
		builder.append(member);
		builder.append(", eClassApproved=");
		builder.append(eClassApproved);
		builder.append(", eClassTake=");
		builder.append(eClassTake);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

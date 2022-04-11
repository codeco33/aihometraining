package aihometraining.team.dto;

public class WorkoutLog {
	
	/*
	 * workoutLogcode, 
	 * memberEmail, 
	 * eClassCategorySmallCode,
	 * eClassCategorySmallName, 
	 * workoutLogTitle, 
	 * workoutLogContent,
	 * workoutGoalPlanCode, 
	 * eClassTaskDoCode, 
	 * challengeEnterCode,
	 * workoutLogAddFileCode, 
	 * workoutLogPrivacyBoundsCode, 
	 * workoutLogUpdateEmail,
	 * workoutLogUpdateFinalDate, 
	 * workoutLogDeleteEmail
	 */

	private String workoutLogcode;
	private String memberEmail;
	private String workoutLogLikeCount;
	private String eClassCategorySmallCode;
	private String eClassCategorySmallName;
	private String workoutLogTitle;
	private String workoutLogContent;
	private String workoutGoalPlanCode;
	private String eClassTaskDoCode;
	private String challengeEnterCode;
	private String workoutLogAddFileCode;
	private String workoutLogPrivacyBoundsCode;
	private String workoutLogUpdateEmail;
	private String workoutLogUpdateFinalDate;
	private String workoutLogDeleteEmail;
	
	
	public String getWorkoutLogcode() {
		return workoutLogcode;
	}
	public void setWorkoutLogcode(String workoutLogcode) {
		this.workoutLogcode = workoutLogcode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getWorkoutLogLikeCount() {
		return workoutLogLikeCount;
	}
	public void setWorkoutLogLikeCount(String workoutLogLikeCount) {
		this.workoutLogLikeCount = workoutLogLikeCount;
	}
	public String geteClassCategorySmallCode() {
		return eClassCategorySmallCode;
	}
	public void seteClassCategorySmallCode(String eClassCategorySmallCode) {
		this.eClassCategorySmallCode = eClassCategorySmallCode;
	}
	public String geteClassCategorySmallName() {
		return eClassCategorySmallName;
	}
	public void seteClassCategorySmallName(String eClassCategorySmallName) {
		this.eClassCategorySmallName = eClassCategorySmallName;
	}
	public String getWorkoutLogTitle() {
		return workoutLogTitle;
	}
	public void setWorkoutLogTitle(String workoutLogTitle) {
		this.workoutLogTitle = workoutLogTitle;
	}
	public String getWorkoutLogContent() {
		return workoutLogContent;
	}
	public void setWorkoutLogContent(String workoutLogContent) {
		this.workoutLogContent = workoutLogContent;
	}
	public String getWorkoutGoalPlanCode() {
		return workoutGoalPlanCode;
	}
	public void setWorkoutGoalPlanCode(String workoutGoalPlanCode) {
		this.workoutGoalPlanCode = workoutGoalPlanCode;
	}
	public String geteClassTaskDoCode() {
		return eClassTaskDoCode;
	}
	public void seteClassTaskDoCode(String eClassTaskDoCode) {
		this.eClassTaskDoCode = eClassTaskDoCode;
	}
	public String getChallengeEnterCode() {
		return challengeEnterCode;
	}
	public void setChallengeEnterCode(String challengeEnterCode) {
		this.challengeEnterCode = challengeEnterCode;
	}
	public String getWorkoutLogAddFileCode() {
		return workoutLogAddFileCode;
	}
	public void setWorkoutLogAddFileCode(String workoutLogAddFileCode) {
		this.workoutLogAddFileCode = workoutLogAddFileCode;
	}
	public String getWorkoutLogPrivacyBoundsCode() {
		return workoutLogPrivacyBoundsCode;
	}
	public void setWorkoutLogPrivacyBoundsCode(String workoutLogPrivacyBoundsCode) {
		this.workoutLogPrivacyBoundsCode = workoutLogPrivacyBoundsCode;
	}
	public String getWorkoutLogUpdateEmail() {
		return workoutLogUpdateEmail;
	}
	public void setWorkoutLogUpdateEmail(String workoutLogUpdateEmail) {
		this.workoutLogUpdateEmail = workoutLogUpdateEmail;
	}
	public String getWorkoutLogUpdateFinalDate() {
		return workoutLogUpdateFinalDate;
	}
	public void setWorkoutLogUpdateFinalDate(String workoutLogUpdateFinalDate) {
		this.workoutLogUpdateFinalDate = workoutLogUpdateFinalDate;
	}
	public String getWorkoutLogDeleteEmail() {
		return workoutLogDeleteEmail;
	}
	public void setWorkoutLogDeleteEmail(String workoutLogDeleteEmail) {
		this.workoutLogDeleteEmail = workoutLogDeleteEmail;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkoutLog [workoutLogcode=");
		builder.append(workoutLogcode);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", workoutLogLikeCount=");
		builder.append(workoutLogLikeCount);
		builder.append(", eClassCategorySmallCode=");
		builder.append(eClassCategorySmallCode);
		builder.append(", eClassCategorySmallName=");
		builder.append(eClassCategorySmallName);
		builder.append(", workoutLogTitle=");
		builder.append(workoutLogTitle);
		builder.append(", workoutLogContent=");
		builder.append(workoutLogContent);
		builder.append(", workoutGoalPlanCode=");
		builder.append(workoutGoalPlanCode);
		builder.append(", eClassTaskDoCode=");
		builder.append(eClassTaskDoCode);
		builder.append(", challengeEnterCode=");
		builder.append(challengeEnterCode);
		builder.append(", workoutLogAddFileCode=");
		builder.append(workoutLogAddFileCode);
		builder.append(", workoutLogPrivacyBoundsCode=");
		builder.append(workoutLogPrivacyBoundsCode);
		builder.append(", workoutLogUpdateEmail=");
		builder.append(workoutLogUpdateEmail);
		builder.append(", workoutLogUpdateFinalDate=");
		builder.append(workoutLogUpdateFinalDate);
		builder.append(", workoutLogDeleteEmail=");
		builder.append(workoutLogDeleteEmail);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

package aihometraining.team.dto;

import java.util.List;

public class WorkoutLog {
	
	/*
	 * workoutLogCode, 
	 * memberEmail,
	 * workoutLogLikeCount, 
	 * eClassCategorySmallCode,
	 * eClassCategorySmallName, 
	 * workoutLogTitle, 
	 * workoutLogContent,
	 * workoutGoalPlanCode, 
	 * eClassTaskDoCode, 
	 * challengeEnterCode,
	 * fileIdx, 
	 * workoutLogPrivacyBoundsCode, 
	 * workoutLogUpdateEmail,
	 * workoutLogUpdateFinalDate, 
	 * workoutLogDeleteEmail
	 */

	private String workoutLogCode;
	private String memberEmail;
	private String workoutLogLikeCount;
	private String eClassCategorySmallCode;
	private String eClassCategorySmallName;
	private String workoutLogTitle;
	private String workoutLogContent;
	private String workoutGoalPlanCode;
	private String eClassTaskDoCode;
	private String challengeEnterCode;
	private String workoutLogPrivacyBoundsCode;
	private String workoutLogUpdateEmail;
	private String workoutLogUpdateFinalDate;
	private String workoutLogDeleteEmail;
	
	
	private Member member;
	private List<FileDto> fileList;
	private WorkoutLogPrivacybounds workoutLogPrivacybounds;
	private EClassCategorySmall eClassCategorySmall;
	private EClassCategoryMedium eClassCategoryMedium;
	private EClassCategoryLarge eClassCategoryLarge;
	private EClassApproved eClassApproved;
	private EClassTake eClassTake;
	
	
	
	public String getWorkoutLogCode() {
		return workoutLogCode;
	}
	public void setWorkoutLogCode(String workoutLogCode) {
		this.workoutLogCode = workoutLogCode;
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
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public List<FileDto> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}
	public WorkoutLogPrivacybounds getWorkoutLogPrivacybounds() {
		return workoutLogPrivacybounds;
	}
	public void setWorkoutLogPrivacybounds(WorkoutLogPrivacybounds workoutLogPrivacybounds) {
		this.workoutLogPrivacybounds = workoutLogPrivacybounds;
	}
	public EClassCategorySmall geteClassCategorySmall() {
		return eClassCategorySmall;
	}
	public void seteClassCategorySmall(EClassCategorySmall eClassCategorySmall) {
		this.eClassCategorySmall = eClassCategorySmall;
	}
	public EClassCategoryMedium geteClassCategoryMedium() {
		return eClassCategoryMedium;
	}
	public void seteClassCategoryMedium(EClassCategoryMedium eClassCategoryMedium) {
		this.eClassCategoryMedium = eClassCategoryMedium;
	}
	public EClassCategoryLarge geteClassCategoryLarge() {
		return eClassCategoryLarge;
	}
	public void seteClassCategoryLarge(EClassCategoryLarge eClassCategoryLarge) {
		this.eClassCategoryLarge = eClassCategoryLarge;
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
		builder.append("WorkoutLog [workoutLogCode=");
		builder.append(workoutLogCode);
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
		builder.append(", workoutLogPrivacyBoundsCode=");
		builder.append(workoutLogPrivacyBoundsCode);
		builder.append(", workoutLogUpdateEmail=");
		builder.append(workoutLogUpdateEmail);
		builder.append(", workoutLogUpdateFinalDate=");
		builder.append(workoutLogUpdateFinalDate);
		builder.append(", workoutLogDeleteEmail=");
		builder.append(workoutLogDeleteEmail);
		builder.append(", member=");
		builder.append(member);
		builder.append(", fileList=");
		builder.append(fileList);
		builder.append(", workoutLogPrivacybounds=");
		builder.append(workoutLogPrivacybounds);
		builder.append(", eClassCategorySmall=");
		builder.append(eClassCategorySmall);
		builder.append(", eClassCategoryMedium=");
		builder.append(eClassCategoryMedium);
		builder.append(", eClassCategoryLarge=");
		builder.append(eClassCategoryLarge);
		builder.append(", eClassApproved=");
		builder.append(eClassApproved);
		builder.append(", eClassTake=");
		builder.append(eClassTake);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}

package aihometraining.team.dto;

import java.util.List;

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
	
	
	private List<FileDto> fileList;


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


	public List<FileDto> getFileList() {
		return fileList;
	}


	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}


	@Override
	public String toString() {
		return "WorkoutLog [workoutLogCode=" + workoutLogCode + ", memberEmail=" + memberEmail
				+ ", workoutLogLikeCount=" + workoutLogLikeCount + ", eClassCategorySmallCode="
				+ eClassCategorySmallCode + ", eClassCategorySmallName=" + eClassCategorySmallName
				+ ", workoutLogTitle=" + workoutLogTitle + ", workoutLogContent=" + workoutLogContent
				+ ", workoutGoalPlanCode=" + workoutGoalPlanCode + ", eClassTaskDoCode=" + eClassTaskDoCode
				+ ", challengeEnterCode=" + challengeEnterCode + ", workoutLogPrivacyBoundsCode="
				+ workoutLogPrivacyBoundsCode + ", workoutLogUpdateEmail=" + workoutLogUpdateEmail
				+ ", workoutLogUpdateFinalDate=" + workoutLogUpdateFinalDate + ", workoutLogDeleteEmail="
				+ workoutLogDeleteEmail + ", fileList=" + fileList + "]";
	}

		
	
	


	
}

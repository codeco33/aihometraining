package aihometraining.team.dto;

import java.sql.Date;

public class EClassSectionCurriculum {
	private String eClassSectionCurriculum;
	private String eClassApprovedCode;
	private String memberEmail;
	private String eClassSectionTitleCode;
	private String eClassSectionCurriculumTitle;
	private String eClassSectionCurriculumAddFile;
	private String eClassSectionCurriculumRunningTime;
	private Date eClassSectionCurriculumRegDate;
	private Date eClassSectionCurriculumUpdateDate;
	private String memberUpdateEmail;
	private String eClassSectionCurriculumState;
	
	public String geteClassSectionCurriculum() {
		return eClassSectionCurriculum;
	}
	public void seteClassSectionCurriculum(String eClassSectionCurriculum) {
		this.eClassSectionCurriculum = eClassSectionCurriculum;
	}
	public String geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(String eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassSectionTitleCode() {
		return eClassSectionTitleCode;
	}
	public void seteClassSectionTitleCode(String eClassSectionTitleCode) {
		this.eClassSectionTitleCode = eClassSectionTitleCode;
	}
	public String geteClassSectionCurriculumTitle() {
		return eClassSectionCurriculumTitle;
	}
	public void seteClassSectionCurriculumTitle(String eClassSectionCurriculumTitle) {
		this.eClassSectionCurriculumTitle = eClassSectionCurriculumTitle;
	}
	public String geteClassSectionCurriculumAddFile() {
		return eClassSectionCurriculumAddFile;
	}
	public void seteClassSectionCurriculumAddFile(String eClassSectionCurriculumAddFile) {
		this.eClassSectionCurriculumAddFile = eClassSectionCurriculumAddFile;
	}
	public String geteClassSectionCurriculumRunningTime() {
		return eClassSectionCurriculumRunningTime;
	}
	public void seteClassSectionCurriculumRunningTime(String eClassSectionCurriculumRunningTime) {
		this.eClassSectionCurriculumRunningTime = eClassSectionCurriculumRunningTime;
	}
	public Date geteClassSectionCurriculumRegDate() {
		return eClassSectionCurriculumRegDate;
	}
	public void seteClassSectionCurriculumRegDate(Date eClassSectionCurriculumRegDate) {
		this.eClassSectionCurriculumRegDate = eClassSectionCurriculumRegDate;
	}
	public Date geteClassSectionCurriculumUpdateDate() {
		return eClassSectionCurriculumUpdateDate;
	}
	public void seteClassSectionCurriculumUpdateDate(Date eClassSectionCurriculumUpdateDate) {
		this.eClassSectionCurriculumUpdateDate = eClassSectionCurriculumUpdateDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String geteClassSectionCurriculumState() {
		return eClassSectionCurriculumState;
	}
	public void seteClassSectionCurriculumState(String eClassSectionCurriculumState) {
		this.eClassSectionCurriculumState = eClassSectionCurriculumState;
	}
	@Override
	public String toString() {
		return "EClassSectionCurriculum [eClassSectionCurriculum=" + eClassSectionCurriculum + ", eClassApprovedCode="
				+ eClassApprovedCode + ", memberEmail=" + memberEmail + ", eClassSectionTitleCode="
				+ eClassSectionTitleCode + ", eClassSectionCurriculumTitle=" + eClassSectionCurriculumTitle
				+ ", eClassSectionCurriculumAddFile=" + eClassSectionCurriculumAddFile
				+ ", eClassSectionCurriculumRunningTime=" + eClassSectionCurriculumRunningTime
				+ ", eClassSectionCurriculumRegDate=" + eClassSectionCurriculumRegDate
				+ ", eClassSectionCurriculumUpdateDate=" + eClassSectionCurriculumUpdateDate + ", memberUpdateEmail="
				+ memberUpdateEmail + ", eClassSectionCurriculumState=" + eClassSectionCurriculumState + "]";
	}
	
}

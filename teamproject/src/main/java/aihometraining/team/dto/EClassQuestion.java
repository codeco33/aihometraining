package aihometraining.team.dto;

import java.sql.Date;

public class EClassQuestion {
	private String eClassQuestionCode;
	private String eClassApprovedCode;
	private String memberEmail;
	private String eClassQuestionTitle;
	private String eClassQuestionContent;
	private Date eClassQuestionRegDate;
	private String memberUpdateEmail;
	private Date eClassQuestionUpdateDate;
	
	public String geteClassQuestionCode() {
		return eClassQuestionCode;
	}
	public void seteClassQuestionCode(String eClassQuestionCode) {
		this.eClassQuestionCode = eClassQuestionCode;
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
	public String geteClassQuestionTitle() {
		return eClassQuestionTitle;
	}
	public void seteClassQuestionTitle(String eClassQuestionTitle) {
		this.eClassQuestionTitle = eClassQuestionTitle;
	}
	public String geteClassQuestionContent() {
		return eClassQuestionContent;
	}
	public void seteClassQuestionContent(String eClassQuestionContent) {
		this.eClassQuestionContent = eClassQuestionContent;
	}
	public Date geteClassQuestionRegDate() {
		return eClassQuestionRegDate;
	}
	public void seteClassQuestionRegDate(Date eClassQuestionRegDate) {
		this.eClassQuestionRegDate = eClassQuestionRegDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public Date geteClassQuestionUpdateDate() {
		return eClassQuestionUpdateDate;
	}
	public void seteClassQuestionUpdateDate(Date eClassQuestionUpdateDate) {
		this.eClassQuestionUpdateDate = eClassQuestionUpdateDate;
	}
	
	@Override
	public String toString() {
		return "EClassQuestion [eClassQuestionCode=" + eClassQuestionCode + ", eClassApprovedCode=" + eClassApprovedCode
				+ ", memberEmail=" + memberEmail + ", eClassQuestionTitle=" + eClassQuestionTitle
				+ ", eClassQuestionContent=" + eClassQuestionContent + ", eClassQuestionRegDate="
				+ eClassQuestionRegDate + ", memberUpdateEmail=" + memberUpdateEmail + ", eClassQuestionUpdateDate="
				+ eClassQuestionUpdateDate + "]";
	}
	
}

package aihometraining.team.dto;

import java.sql.Date;

public class EClassApproved {
	private String eClassApprovedCode;
	private String eClassTakeCode;
	private String memberEmail;
	private String eClassApprovedName;
	private Date eClassApprovedSetDate;
	private Date eClassApprovedStratDate;
	private Date eClassApprovedEndDate;
	private int eClassApprovedStudent;
	private int eClassApprovedMaxStudent;
	private String eClassIntroduceCode;
	private Date eClassApprovedDate;
	private int eClassApprovedFinish;
	
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
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassApprovedName() {
		return eClassApprovedName;
	}
	public void seteClassApprovedName(String eClassApprovedName) {
		this.eClassApprovedName = eClassApprovedName;
	}
	public Date geteClassApprovedSetDate() {
		return eClassApprovedSetDate;
	}
	public void seteClassApprovedSetDate(Date eClassApprovedSetDate) {
		this.eClassApprovedSetDate = eClassApprovedSetDate;
	}
	public Date geteClassApprovedStratDate() {
		return eClassApprovedStratDate;
	}
	public void seteClassApprovedStratDate(Date eClassApprovedStratDate) {
		this.eClassApprovedStratDate = eClassApprovedStratDate;
	}
	public Date geteClassApprovedEndDate() {
		return eClassApprovedEndDate;
	}
	public void seteClassApprovedEndDate(Date eClassApprovedEndDate) {
		this.eClassApprovedEndDate = eClassApprovedEndDate;
	}
	public int geteClassApprovedStudent() {
		return eClassApprovedStudent;
	}
	public void seteClassApprovedStudent(int eClassApprovedStudent) {
		this.eClassApprovedStudent = eClassApprovedStudent;
	}
	public int geteClassApprovedMaxStudent() {
		return eClassApprovedMaxStudent;
	}
	public void seteClassApprovedMaxStudent(int eClassApprovedMaxStudent) {
		this.eClassApprovedMaxStudent = eClassApprovedMaxStudent;
	}
	public String geteClassIntroduceCode() {
		return eClassIntroduceCode;
	}
	public void seteClassIntroduceCode(String eClassIntroduceCode) {
		this.eClassIntroduceCode = eClassIntroduceCode;
	}
	public Date geteClassApprovedDate() {
		return eClassApprovedDate;
	}
	public void seteClassApprovedDate(Date eClassApprovedDate) {
		this.eClassApprovedDate = eClassApprovedDate;
	}
	public int geteClassApprovedFinish() {
		return eClassApprovedFinish;
	}
	public void seteClassApprovedFinish(int eClassApprovedFinish) {
		this.eClassApprovedFinish = eClassApprovedFinish;
	}
	@Override
	public String toString() {
		return "EClassApproved [eClassApprovedCode=" + eClassApprovedCode + ", eClassTakeCode=" + eClassTakeCode
				+ ", memberEmail=" + memberEmail + ", eClassApprovedName=" + eClassApprovedName
				+ ", eClassApprovedSetDate=" + eClassApprovedSetDate + ", eClassApprovedStratDate="
				+ eClassApprovedStratDate + ", eClassApprovedEndDate=" + eClassApprovedEndDate
				+ ", eClassApprovedStudent=" + eClassApprovedStudent + ", eClassApprovedMaxStudent="
				+ eClassApprovedMaxStudent + ", eClassIntroduceCode=" + eClassIntroduceCode + ", eClassApprovedDate="
				+ eClassApprovedDate + ", eClassApprovedFinish=" + eClassApprovedFinish + "]";
	}
	
}

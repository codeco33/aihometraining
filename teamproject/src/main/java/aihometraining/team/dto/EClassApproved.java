package aihometraining.team.dto;

import java.sql.Date;

public class EClassApproved {
	private String eClassApprovedCode;
	private String eClassOpenApplyCode;
	private String memberEmail;
	private String eClassApprovedName;
	private String eClassApprovedSetDate;
	private Date eClassApprovedStratDate;
	private Date eClassApprovedEndDate;
	private int eClassApprovedStudent;
	private int eClassApprovedMaxStudent;
	private String eClassIntroduceCode;
	private Date eClassApprovedDate;
	private int eClassApprovedFinish;
	
	//wishList 구현으로 추가함 -진수경
	private EClassOpenApplyForm eClassOpenApplyForm;
	private Member member;
	
	public String geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(String eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
	}
	public String geteClassOpenApplyCode() {
		return eClassOpenApplyCode;
	}
	public void seteClassOpenApplyCode(String eClassOpenApplyCode) {
		this.eClassOpenApplyCode = eClassOpenApplyCode;
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
	public String geteClassApprovedSetDate() {
		return eClassApprovedSetDate;
	}
	public void seteClassApprovedSetDate(String eClassApprovedSetDate) {
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
	public EClassOpenApplyForm geteClassOpenApplyForm() {
		return eClassOpenApplyForm;
	}
	public void seteClassOpenApplyForm(EClassOpenApplyForm eClassOpenApplyForm) {
		this.eClassOpenApplyForm = eClassOpenApplyForm;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EClassApproved [eClassApprovedCode=");
		builder.append(eClassApprovedCode);
		builder.append(", eClassOpenApplyCode=");
		builder.append(eClassOpenApplyCode);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", eClassApprovedName=");
		builder.append(eClassApprovedName);
		builder.append(", eClassApprovedSetDate=");
		builder.append(eClassApprovedSetDate);
		builder.append(", eClassApprovedStratDate=");
		builder.append(eClassApprovedStratDate);
		builder.append(", eClassApprovedEndDate=");
		builder.append(eClassApprovedEndDate);
		builder.append(", eClassApprovedStudent=");
		builder.append(eClassApprovedStudent);
		builder.append(", eClassApprovedMaxStudent=");
		builder.append(eClassApprovedMaxStudent);
		builder.append(", eClassIntroduceCode=");
		builder.append(eClassIntroduceCode);
		builder.append(", eClassApprovedDate=");
		builder.append(eClassApprovedDate);
		builder.append(", eClassApprovedFinish=");
		builder.append(eClassApprovedFinish);
		builder.append(", eClassOpenApplyForm=");
		builder.append(eClassOpenApplyForm);
		builder.append(", member=");
		builder.append(member);
		builder.append("]");
		return builder.toString();
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

	
	
}

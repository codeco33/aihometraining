package aihometraining.team.dto;

public class DietBank {
	
	private String dietBankCode;
	private String eClassApprovedCode;
	private String memberEmail;
	private String dietBankInsertDate;
	private String memberUpdateEmail;
	private String dietBankUpdateDate;
	
	
	public String getDietBankCode() {
		return dietBankCode;
	}
	public void setDietBankCode(String dietBankCode) {
		this.dietBankCode = dietBankCode;
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
	public String getDietBankInsertDate() {
		return dietBankInsertDate;
	}
	public void setDietBankInsertDate(String dietBankInsertDate) {
		this.dietBankInsertDate = dietBankInsertDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String getDietBankUpdateDate() {
		return dietBankUpdateDate;
	}
	public void setDietBankUpdateDate(String dietBankUpdateDate) {
		this.dietBankUpdateDate = dietBankUpdateDate;
	}
	
	@Override
	public String toString() {
		return "DietBank [dietBankCode=" + dietBankCode + ", eClassApprovedCode=" + eClassApprovedCode
				+ ", memberEmail=" + memberEmail + ", dietBankInsertDate=" + dietBankInsertDate + ", memberUpdateEmail="
				+ memberUpdateEmail + ", dietBankUpdateDate=" + dietBankUpdateDate + "]";
	}
	
}

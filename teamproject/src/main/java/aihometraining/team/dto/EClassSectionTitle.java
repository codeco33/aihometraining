package aihometraining.team.dto;

import java.sql.Date;

public class EClassSectionTitle {
	private String eClassSectionTitleCode;
	private String memberEmail;
	private String eClassSectionTitleName;
	private Date eClassSectionTitleDate;
	private Date eClassSectionTitleUpdateDate;
	private String memberUpdateEmail;
	
	public String geteClassSectionTitleCode() {
		return eClassSectionTitleCode;
	}
	public void seteClassSectionTitleCode(String eClassSectionTitleCode) {
		this.eClassSectionTitleCode = eClassSectionTitleCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassSectionTitleName() {
		return eClassSectionTitleName;
	}
	public void seteClassSectionTitleName(String eClassSectionTitleName) {
		this.eClassSectionTitleName = eClassSectionTitleName;
	}
	public Date geteClassSectionTitleDate() {
		return eClassSectionTitleDate;
	}
	public void seteClassSectionTitleDate(Date eClassSectionTitleDate) {
		this.eClassSectionTitleDate = eClassSectionTitleDate;
	}
	public Date geteClassSectionTitleUpdateDate() {
		return eClassSectionTitleUpdateDate;
	}
	public void seteClassSectionTitleUpdateDate(Date eClassSectionTitleUpdateDate) {
		this.eClassSectionTitleUpdateDate = eClassSectionTitleUpdateDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	@Override
	public String toString() {
		return "EClassSectionTitle [eClassSectionTitleCode=" + eClassSectionTitleCode + ", memberEmail=" + memberEmail
				+ ", eClassSectionTitleName=" + eClassSectionTitleName + ", eClassSectionTitleDate="
				+ eClassSectionTitleDate + ", eClassSectionTitleUpdateDate=" + eClassSectionTitleUpdateDate
				+ ", memberUpdateEmail=" + memberUpdateEmail + "]";
	}
	
}

package aihometraining.team.dto;

import java.sql.Date;

public class EClassIntroduce {
	private String eClassIntroduceCode;
	private String memberEmail;
	private String eClassIntroduceContent;
	private String memberUpdateEmail;
	private Date eClassIntroducetDate;
	private String eClassIntroduceImg;
	private String eClassCategorySmallCode;
	
	public String geteClassIntroduceCode() {
		return eClassIntroduceCode;
	}
	public void seteClassIntroduceCode(String eClassIntroduceCode) {
		this.eClassIntroduceCode = eClassIntroduceCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassIntroduceContent() {
		return eClassIntroduceContent;
	}
	public void seteClassIntroduceContent(String eClassIntroduceContent) {
		this.eClassIntroduceContent = eClassIntroduceContent;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public Date geteClassIntroducetDate() {
		return eClassIntroducetDate;
	}
	public void seteClassIntroducetDate(Date eClassIntroducetDate) {
		this.eClassIntroducetDate = eClassIntroducetDate;
	}
	public String geteClassIntroduceImg() {
		return eClassIntroduceImg;
	}
	public void seteClassIntroduceImg(String eClassIntroduceImg) {
		this.eClassIntroduceImg = eClassIntroduceImg;
	}
	public String geteClassCategorySmallCode() {
		return eClassCategorySmallCode;
	}
	public void seteClassCategorySmallCode(String eClassCategorySmallCode) {
		this.eClassCategorySmallCode = eClassCategorySmallCode;
	}
	@Override
	public String toString() {
		return "EClassIntroduce [eClassIntroduceCode=" + eClassIntroduceCode + ", memberEmail=" + memberEmail
				+ ", eClassIntroduceContent=" + eClassIntroduceContent + ", memberUpdateEmail=" + memberUpdateEmail
				+ ", eClassIntroducetDate=" + eClassIntroducetDate + ", eClassIntroduceImg=" + eClassIntroduceImg
				+ ", eClassCategorySmallCode=" + eClassCategorySmallCode + "]";
	}
	
}

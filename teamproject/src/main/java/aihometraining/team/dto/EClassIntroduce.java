package aihometraining.team.dto;

import java.sql.Date;

public class EClassIntroduce {
	private String eClassIntroduceCode;
	private String memberEmail;
	private String eClassCategorySmallCode;
	private String eClassIntroduceContent;
	private String memberUpdateEmail;
	private Date eClassIntroducetDate;
	private String eClassIntroduceImg;
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
	public String geteClassCategorySmallCode() {
		return eClassCategorySmallCode;
	}
	public void seteClassCategorySmallCode(String eClassCategorySmallCode) {
		this.eClassCategorySmallCode = eClassCategorySmallCode;
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
	@Override
	public String toString() {
		return "EClassIntroduce [eClassIntroduceCode=" + eClassIntroduceCode + ", memberEmail=" + memberEmail
				+ ", eClassCategorySmallCode=" + eClassCategorySmallCode + ", eClassIntroduceContent="
				+ eClassIntroduceContent + ", memberUpdateEmail=" + memberUpdateEmail + ", eClassIntroducetDate="
				+ eClassIntroducetDate + ", eClassIntroduceImg=" + eClassIntroduceImg + "]";
	}
	
}

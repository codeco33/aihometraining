package aihometraining.team.challengeConfig.dto;

public class challengeCategory {
	/*
	 *  challengeCategoryCode, 
		memberEmail, 
		challengeCategoryName, 
		challengeCategoryRegDate, 
		eClassCategorySmall, 
		memberUpdateEmail,
		memberUpdateDate
	 */
	private String challengeCategoryCode;
	private String memberEmail;
	private String challengeCategoryName;
	private String challengeCategoryRegDate;
	private String eClassCategorySmall;
	private String memberUpdateEmail;
	private String memberUpdateDate;
	public String getChallengeCategoryCode() {
		return challengeCategoryCode;
	}
	public void setChallengeCategoryCode(String challengeCategoryCode) {
		this.challengeCategoryCode = challengeCategoryCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getChallengeCategoryName() {
		return challengeCategoryName;
	}
	public void setChallengeCategoryName(String challengeCategoryName) {
		this.challengeCategoryName = challengeCategoryName;
	}
	public String getChallengeCategoryRegDate() {
		return challengeCategoryRegDate;
	}
	public void setChallengeCategoryRegDate(String challengeCategoryRegDate) {
		this.challengeCategoryRegDate = challengeCategoryRegDate;
	}
	public String geteClassCategorySmall() {
		return eClassCategorySmall;
	}
	public void seteClassCategorySmall(String eClassCategorySmall) {
		this.eClassCategorySmall = eClassCategorySmall;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String getMemberUpdateDate() {
		return memberUpdateDate;
	}
	public void setMemberUpdateDate(String memberUpdateDate) {
		this.memberUpdateDate = memberUpdateDate;
	}
	@Override
	public String toString() {
		return "challengeCategory [challengeCategoryCode=" + challengeCategoryCode + ", memberEmail=" + memberEmail
				+ ", challengeCategoryName=" + challengeCategoryName + ", challengeCategoryRegDate="
				+ challengeCategoryRegDate + ", eClassCategorySmall=" + eClassCategorySmall + ", memberUpdateEmail="
				+ memberUpdateEmail + ", memberUpdateDate=" + memberUpdateDate + "]";
	}
	
}

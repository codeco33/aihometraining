package aihometraining.team.dto;

public class ChallengeCategory {
	/*
	 *  challengeCategoryCode, 
		memberEmail, 
		challengeCategoryName, 
		challengeCategoryRegDate, 
		eClassCategorySmallCode, 
		memberUpdateEmail,
		memberUpdateDate
	 */
	private String challengeCategoryCode;
	private String memberEmail;
	private String challengeCategoryName;
	private String challengeCategoryRegDate;
	private String eClassCategorySmallCode;
	private String memberUpdateEmail;
	private String memberUpdateDate;
	
	private Member member;

	private EClassCategorySmall eClassCategorySmall;

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

	public String geteClassCategorySmallCode() {
		return eClassCategorySmallCode;
	}

	public void seteClassCategorySmallCode(String eClassCategorySmallCode) {
		this.eClassCategorySmallCode = eClassCategorySmallCode;
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

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public EClassCategorySmall geteClassCategorySmall() {
		return eClassCategorySmall;
	}

	public void seteClassCategorySmall(EClassCategorySmall eClassCategorySmall) {
		this.eClassCategorySmall = eClassCategorySmall;
	}

	@Override
	public String toString() {
		return "ChallengeCategory [challengeCategoryCode=" + challengeCategoryCode + ", memberEmail=" + memberEmail
				+ ", challengeCategoryName=" + challengeCategoryName + ", challengeCategoryRegDate="
				+ challengeCategoryRegDate + ", eClassCategorySmallCode=" + eClassCategorySmallCode
				+ ", memberUpdateEmail=" + memberUpdateEmail + ", memberUpdateDate=" + memberUpdateDate + ", member="
				+ member + ", eClassCategorySmall=" + eClassCategorySmall + "]";
	}
	
	
	
	
	
	
}

package aihometraining.team.dto;

public class ChallengeEnter {
	/*
	 * 
	 * 	  challengeEnterCode
		, challengeCategoryCode
		, challengeGatherCode
		, memberEmail
		, challengeEnterContent
		, challengeEnterDeposit
		, challengeEnterDate
		, challengeServiceStartDate
		, challengeServiceEndDate
	 * 
	 */
	
	private String challengeEnterCode;
	private String challengeCategoryCode;
	private String challengeGatherCode;
	private String memberEmail;
	private String challengeEnterContent;
	private String challengeEnterDeposit;
	private String challengeEnterDate;
	private String challengeServiceStartDate;
	private String challengeServiceEndDate;
	
	private ChallengeCategory challengeCategory;
	private ChallengeGather challengeGather;
	private Member member;
	public String getChallengeEnterCode() {
		return challengeEnterCode;
	}
	public void setChallengeEnterCode(String challengeEnterCode) {
		this.challengeEnterCode = challengeEnterCode;
	}
	public String getChallengeCategoryCode() {
		return challengeCategoryCode;
	}
	public void setChallengeCategoryCode(String challengeCategoryCode) {
		this.challengeCategoryCode = challengeCategoryCode;
	}
	public String getChallengeGatherCode() {
		return challengeGatherCode;
	}
	public void setChallengeGatherCode(String challengeGatherCode) {
		this.challengeGatherCode = challengeGatherCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getChallengeEnterContent() {
		return challengeEnterContent;
	}
	public void setChallengeEnterContent(String challengeEnterContent) {
		this.challengeEnterContent = challengeEnterContent;
	}
	public String getChallengeEnterDeposit() {
		return challengeEnterDeposit;
	}
	public void setChallengeEnterDeposit(String challengeEnterDeposit) {
		this.challengeEnterDeposit = challengeEnterDeposit;
	}
	public String getChallengeEnterDate() {
		return challengeEnterDate;
	}
	public void setChallengeEnterDate(String challengeEnterDate) {
		this.challengeEnterDate = challengeEnterDate;
	}
	public String getChallengeServiceStartDate() {
		return challengeServiceStartDate;
	}
	public void setChallengeServiceStartDate(String challengeServiceStartDate) {
		this.challengeServiceStartDate = challengeServiceStartDate;
	}
	public String getChallengeServiceEndDate() {
		return challengeServiceEndDate;
	}
	public void setChallengeServiceEndDate(String challengeServiceEndDate) {
		this.challengeServiceEndDate = challengeServiceEndDate;
	}
	public ChallengeCategory getChallengeCategory() {
		return challengeCategory;
	}
	public void setChallengeCategory(ChallengeCategory challengeCategory) {
		this.challengeCategory = challengeCategory;
	}
	public ChallengeGather getChallengeGather() {
		return challengeGather;
	}
	public void setChallengeGather(ChallengeGather challengeGather) {
		this.challengeGather = challengeGather;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		return "ChallengeEnter [challengeEnterCode=" + challengeEnterCode + ", challengeCategoryCode="
				+ challengeCategoryCode + ", challengeGatherCode=" + challengeGatherCode + ", memberEmail="
				+ memberEmail + ", challengeEnterContent=" + challengeEnterContent + ", challengeEnterDeposit="
				+ challengeEnterDeposit + ", challengeEnterDate=" + challengeEnterDate + ", challengeServiceStartDate="
				+ challengeServiceStartDate + ", challengeServiceEndDate=" + challengeServiceEndDate
				+ ", challengeCategory=" + challengeCategory + ", challengeGather=" + challengeGather + ", member="
				+ member + "]";
	}
	
	
}

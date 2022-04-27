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
	private String paymentGroupCode;
	
	public String getPaymentGroupCode() {
		return paymentGroupCode;
	}
	public void setPaymentGroupCode(String paymentGroupCode) {
		this.paymentGroupCode = paymentGroupCode;
	}

	private ChallengeCategory challengeCategory;
	private ChallengeGather challengeGather;
	private Member member;
	private ChallengeGatherPlan challengeGatherPlan;
	public ChallengeGatherPlan getChallengeGatherPlan() {
		return challengeGatherPlan;
	}
	public void setChallengeGatherPlan(ChallengeGatherPlan challengeGatherPlan) {
		this.challengeGatherPlan = challengeGatherPlan;
	}
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
		StringBuilder builder = new StringBuilder();
		builder.append("ChallengeEnter [challengeEnterCode=");
		builder.append(challengeEnterCode);
		builder.append(", challengeCategoryCode=");
		builder.append(challengeCategoryCode);
		builder.append(", challengeGatherCode=");
		builder.append(challengeGatherCode);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", challengeEnterContent=");
		builder.append(challengeEnterContent);
		builder.append(", challengeEnterDeposit=");
		builder.append(challengeEnterDeposit);
		builder.append(", challengeEnterDate=");
		builder.append(challengeEnterDate);
		builder.append(", challengeServiceStartDate=");
		builder.append(challengeServiceStartDate);
		builder.append(", challengeServiceEndDate=");
		builder.append(challengeServiceEndDate);
		builder.append(", paymentGroupCode=");
		builder.append(paymentGroupCode);
		builder.append(", challengeCategory=");
		builder.append(challengeCategory);
		builder.append(", challengeGather=");
		builder.append(challengeGather);
		builder.append(", member=");
		builder.append(member);
		builder.append(", challengeGatherPlan=");
		builder.append(challengeGatherPlan);
		builder.append("]");
		return builder.toString();
	}
	
	
}

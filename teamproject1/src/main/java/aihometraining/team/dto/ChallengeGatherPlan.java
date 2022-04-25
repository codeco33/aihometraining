package aihometraining.team.dto;

public class ChallengeGatherPlan {
	/*
	 * challengeGatherPlanCode
	, memberEmail
	, challengeGatherCode
	, challengeCategoryCode
	, challengeSettingCode
	, challengeGatherPlanProveNumber
	, challengeGatherPlanProgress
	, challengeGatherPlanAchieveRate
	, challengeGatherPlanProveState
	, challengeGatherChallengeStartDate
	, challengeGatherChallengeLastDate
	, challengeGatherPlanRound
	 */
	
	private String challengeGatherPlanCode;
	private String memberEmail;
	private String challengeGatherCode;
	private String challengeCategoryCode;
	private String challengeSettingCode;
	private String challengeGatherPlanProveNumber;
	private String challengeGatherPlanProgress;
	private String challengeGatherPlanAchieveRate;
	private String challengeGatherPlanProveState;
	private String challengeGatherChallengeStartDate;
	private String challengeGatherChallengeLastDate;
	private String challengeGatherPlanRound;
	
	private Member member;
	private ChallengeGather challengeGather;
	private ChallengeCategory challengeCategory;
	private ChallengeSetting challengeSetting;
	
	public String getChallengeGatherPlanCode() {
		return challengeGatherPlanCode;
	}
	public void setChallengeGatherPlanCode(String challengeGatherPlanCode) {
		this.challengeGatherPlanCode = challengeGatherPlanCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getChallengeGatherCode() {
		return challengeGatherCode;
	}
	public void setChallengeGatherCode(String challengeGatherCode) {
		this.challengeGatherCode = challengeGatherCode;
	}
	public String getChallengeCategoryCode() {
		return challengeCategoryCode;
	}
	public void setChallengeCategoryCode(String challengeCategoryCode) {
		this.challengeCategoryCode = challengeCategoryCode;
	}
	public String getChallengeSettingCode() {
		return challengeSettingCode;
	}
	public void setChallengeSettingCode(String challengeSettingCode) {
		this.challengeSettingCode = challengeSettingCode;
	}
	public String getChallengeGatherPlanProveNumber() {
		return challengeGatherPlanProveNumber;
	}
	public void setChallengeGatherPlanProveNumber(String challengeGatherPlanProveNumber) {
		this.challengeGatherPlanProveNumber = challengeGatherPlanProveNumber;
	}
	public String getChallengeGatherPlanProgress() {
		return challengeGatherPlanProgress;
	}
	public void setChallengeGatherPlanProgress(String challengeGatherPlanProgress) {
		this.challengeGatherPlanProgress = challengeGatherPlanProgress;
	}
	public String getChallengeGatherPlanAchieveRate() {
		return challengeGatherPlanAchieveRate;
	}
	public void setChallengeGatherPlanAchieveRate(String challengeGatherPlanAchieveRate) {
		this.challengeGatherPlanAchieveRate = challengeGatherPlanAchieveRate;
	}
	public String getChallengeGatherPlanProveState() {
		return challengeGatherPlanProveState;
	}
	public void setChallengeGatherPlanProveState(String challengeGatherPlanProveState) {
		this.challengeGatherPlanProveState = challengeGatherPlanProveState;
	}
	public String getChallengeGatherChallengeStartDate() {
		return challengeGatherChallengeStartDate;
	}
	public void setChallengeGatherChallengeStartDate(String challengeGatherChallengeStartDate) {
		this.challengeGatherChallengeStartDate = challengeGatherChallengeStartDate;
	}
	public String getChallengeGatherChallengeLastDate() {
		return challengeGatherChallengeLastDate;
	}
	public void setChallengeGatherChallengeLastDate(String challengeGatherChallengeLastDate) {
		this.challengeGatherChallengeLastDate = challengeGatherChallengeLastDate;
	}
	public String getChallengeGatherPlanRound() {
		return challengeGatherPlanRound;
	}
	public void setChallengeGatherPlanRound(String challengeGatherPlanRound) {
		this.challengeGatherPlanRound = challengeGatherPlanRound;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public ChallengeGather getChallengeGather() {
		return challengeGather;
	}
	public void setChallengeGather(ChallengeGather challengeGather) {
		this.challengeGather = challengeGather;
	}
	public ChallengeCategory getChallengeCategory() {
		return challengeCategory;
	}
	public void setChallengeCategory(ChallengeCategory challengeCategory) {
		this.challengeCategory = challengeCategory;
	}
	public ChallengeSetting getChallengeSetting() {
		return challengeSetting;
	}
	public void setChallengeSetting(ChallengeSetting challengeSetting) {
		this.challengeSetting = challengeSetting;
	}
	
	@Override
	public String toString() {
		return "ChallengeGatherPlan [challengeGatherPlanCode=" + challengeGatherPlanCode + ", memberEmail="
				+ memberEmail + ", challengeGatherCode=" + challengeGatherCode + ", challengeCategoryCode="
				+ challengeCategoryCode + ", challengeSettingCode=" + challengeSettingCode
				+ ", challengeGatherPlanProveNumber=" + challengeGatherPlanProveNumber
				+ ", challengeGatherPlanProgress=" + challengeGatherPlanProgress + ", challengeGatherPlanAchieveRate="
				+ challengeGatherPlanAchieveRate + ", challengeGatherPlanProveState=" + challengeGatherPlanProveState
				+ ", challengeGatherChallengeStartDate=" + challengeGatherChallengeStartDate
				+ ", challengeGatherChallengeLastDate=" + challengeGatherChallengeLastDate
				+ ", challengeGatherPlanRound=" + challengeGatherPlanRound + ", member=" + member + ", challengeGather="
				+ challengeGather + ", challengeCategory=" + challengeCategory + ", challengeSetting="
				+ challengeSetting + "]";
	}
	
	
}

package aihometraining.team.dto;

public class ChallengeGather {
	private String challengeGatherCode;
	private String challengeCategoryCode;
	private String challengeGatherName;
	private String challengeGatherIntro;
	private String challengeGatherMaxPeople;
	private String challengeGatherProveMethod;
	private String challengeGatherProveContent;
	private String challengeGatherProveFrequency;
	private String challengeGatherAchieveRate;
	private String challengeStartDate;
	private String challengeGatherRegDate;
	private String challengeGatherStartDate;
	private String challengeGatherEndDate;
	
	private Member member;
	
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
	public String getChallengeGatherName() {
		return challengeGatherName;
	}
	public void setChallengeGatherName(String challengeGatherName) {
		this.challengeGatherName = challengeGatherName;
	}
	public String getChallengeGatherIntro() {
		return challengeGatherIntro;
	}
	public void setChallengeGatherIntro(String challengeGatherIntro) {
		this.challengeGatherIntro = challengeGatherIntro;
	}
	public String getChallengeGatherMaxPeople() {
		return challengeGatherMaxPeople;
	}
	public void setChallengeGatherMaxPeople(String challengeGatherMaxPeople) {
		this.challengeGatherMaxPeople = challengeGatherMaxPeople;
	}
	public String getChallengeGatherProveMethod() {
		return challengeGatherProveMethod;
	}
	public void setChallengeGatherProveMethod(String challengeGatherProveMethod) {
		this.challengeGatherProveMethod = challengeGatherProveMethod;
	}
	public String getChallengeGatherProveContent() {
		return challengeGatherProveContent;
	}
	public void setChallengeGatherProveContent(String challengeGatherProveContent) {
		this.challengeGatherProveContent = challengeGatherProveContent;
	}
	public String getChallengeGatherProveFrequency() {
		return challengeGatherProveFrequency;
	}
	public void setChallengeGatherProveFrequency(String challengeGatherProveFrequency) {
		this.challengeGatherProveFrequency = challengeGatherProveFrequency;
	}
	public String getChallengeGatherAchieveRate() {
		return challengeGatherAchieveRate;
	}
	public void setChallengeGatherAchieveRate(String challengeGatherAchieveRate) {
		this.challengeGatherAchieveRate = challengeGatherAchieveRate;
	}
	public String getChallengeStartDate() {
		return challengeStartDate;
	}
	public void setChallengeStartDate(String challengeStartDate) {
		this.challengeStartDate = challengeStartDate;
	}
	public String getChallengeGatherRegDate() {
		return challengeGatherRegDate;
	}
	public void setChallengeGatherRegDate(String challengeGatherRegDate) {
		this.challengeGatherRegDate = challengeGatherRegDate;
	}
	public String getChallengeGatherStartDate() {
		return challengeGatherStartDate;
	}
	public void setChallengeGatherStartDate(String challengeGatherStartDate) {
		this.challengeGatherStartDate = challengeGatherStartDate;
	}
	public String getChallengeGatherEndDate() {
		return challengeGatherEndDate;
	}
	public void setChallengeGatherEndDate(String challengeGatherEndDate) {
		this.challengeGatherEndDate = challengeGatherEndDate;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "ChallengeGather [challengeGatherCode=" + challengeGatherCode + ", challengeCategoryCode="
				+ challengeCategoryCode + ", challengeGatherName=" + challengeGatherName + ", challengeGatherIntro="
				+ challengeGatherIntro + ", challengeGatherMaxPeople=" + challengeGatherMaxPeople
				+ ", challengeGatherProveMethod=" + challengeGatherProveMethod + ", challengeGatherProveContent="
				+ challengeGatherProveContent + ", challengeGatherProveFrequency=" + challengeGatherProveFrequency
				+ ", challengeGatherAchieveRate=" + challengeGatherAchieveRate + ", challengeStartDate="
				+ challengeStartDate + ", challengeGatherRegDate=" + challengeGatherRegDate
				+ ", challengeGatherStartDate=" + challengeGatherStartDate + ", challengeGatherEndDate="
				+ challengeGatherEndDate + ", member=" + member + "]";
	}
	
	
}

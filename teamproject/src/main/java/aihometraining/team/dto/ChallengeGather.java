package aihometraining.team.dto;

import java.util.List;

public class ChallengeGather {
	private String challengeGatherCode;
	private String memberEmail;
	private String challengeCategoryCode;
	private String challengeGatherName;
	private String challengeGatherIntro;
	private String challengeGatherMaxPeople;
	private String challengeGatherProveMethod;
	private String challengeGatherProveContent;
	private String challengeGatherProveFrequency;
	private String challengeGatherAchieveRate;
	private String challengeStartDate;
	private String challengeEndDate;
	private String challengeGatherRegDate;
	private String memberEnterEmail;
	private String challengeGatherStartDate;
	private String challengeGatherEndDate;
	private int challengeEnterDeposit;
	
	private Member member;
	private ChallengeCategory challengeCategory;
	private ChallengeGatherPlan challengeGatherPlan;
	private List<ChallengeEnter> challengeEnterList;
	private List<ChallengeGatherPlanDo> challengeGatherPlanDoList;
	
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
	public String getChallengeEndDate() {
		return challengeEndDate;
	}
	public void setChallengeEndDate(String challengeEndDate) {
		this.challengeEndDate = challengeEndDate;
	}
	public String getChallengeGatherRegDate() {
		return challengeGatherRegDate;
	}
	public void setChallengeGatherRegDate(String challengeGatherRegDate) {
		this.challengeGatherRegDate = challengeGatherRegDate;
	}
	public String getMemberEnterEmail() {
		return memberEnterEmail;
	}
	public void setMemberEnterEmail(String memberEnterEmail) {
		this.memberEnterEmail = memberEnterEmail;
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
	public ChallengeCategory getChallengeCategory() {
		return challengeCategory;
	}
	public void setChallengeCategory(ChallengeCategory challengeCategory) {
		this.challengeCategory = challengeCategory;
	}
	public ChallengeGatherPlan getChallengeGatherPlan() {
		return challengeGatherPlan;
	}
	public void setChallengeGatherPlan(ChallengeGatherPlan challengeGatherPlan) {
		this.challengeGatherPlan = challengeGatherPlan;
	}
	public List<ChallengeEnter> getChallengeEnterList() {
		return challengeEnterList;
	}
	public void setChallengeEnterList(List<ChallengeEnter> challengeEnterList) {
		this.challengeEnterList = challengeEnterList;
	}
	public List<ChallengeGatherPlanDo> getChallengeGatherPlanDoList() {
		return challengeGatherPlanDoList;
	}
	public void setChallengeGatherPlanDoList(List<ChallengeGatherPlanDo> challengeGatherPlanDoList) {
		this.challengeGatherPlanDoList = challengeGatherPlanDoList;
	}
	public int getChallengeEnterDeposit() {
		return challengeEnterDeposit;
	}
	public void setChallengeEnterDeposit(int challengeEnterDeposit) {
		this.challengeEnterDeposit = challengeEnterDeposit;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChallengeGather [challengeGatherCode=");
		builder.append(challengeGatherCode);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", challengeCategoryCode=");
		builder.append(challengeCategoryCode);
		builder.append(", challengeGatherName=");
		builder.append(challengeGatherName);
		builder.append(", challengeGatherIntro=");
		builder.append(challengeGatherIntro);
		builder.append(", challengeGatherMaxPeople=");
		builder.append(challengeGatherMaxPeople);
		builder.append(", challengeGatherProveMethod=");
		builder.append(challengeGatherProveMethod);
		builder.append(", challengeGatherProveContent=");
		builder.append(challengeGatherProveContent);
		builder.append(", challengeGatherProveFrequency=");
		builder.append(challengeGatherProveFrequency);
		builder.append(", challengeGatherAchieveRate=");
		builder.append(challengeGatherAchieveRate);
		builder.append(", challengeStartDate=");
		builder.append(challengeStartDate);
		builder.append(", challengeEndDate=");
		builder.append(challengeEndDate);
		builder.append(", challengeGatherRegDate=");
		builder.append(challengeGatherRegDate);
		builder.append(", memberEnterEmail=");
		builder.append(memberEnterEmail);
		builder.append(", challengeGatherStartDate=");
		builder.append(challengeGatherStartDate);
		builder.append(", challengeGatherEndDate=");
		builder.append(challengeGatherEndDate);
		builder.append(", challengeEnterDeposit=");
		builder.append(challengeEnterDeposit);
		builder.append(", member=");
		builder.append(member);
		builder.append(", challengeCategory=");
		builder.append(challengeCategory);
		builder.append(", challengeGatherPlan=");
		builder.append(challengeGatherPlan);
		builder.append(", challengeEnterList=");
		builder.append(challengeEnterList);
		builder.append(", challengeGatherPlanDoList=");
		builder.append(challengeGatherPlanDoList);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

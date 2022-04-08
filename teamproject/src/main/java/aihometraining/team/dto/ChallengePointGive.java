package aihometraining.team.dto;

public class ChallengePointGive {
	/*
	 *  challengePointGiveCode
		challengeCategoryCode 
		challengeGatherCode 
		challengeEnterCode
		challengeGatherAchieveRate 
		challengeEnterEmail 
		pointGiveStandardCode
		challengePointGiveDate 
		challengePointGivePoint
	 * 
	 */
	
	private String challengePointGiveCode;
	private String challengeCategoryCode;
	private String challengeGatherCode;
	private String challengeEnterCode;
	private String challengeGatherAchieveRate;
	private String challengeEnterEmail;
	private String pointGiveStandardCode;
	private String challengePointGiveDate;
	private String challengePointGivePoint;
	
	private ChallengeCategory challengeCategory;
	private ChallengeGather challengeGather;
	private ChallengeEnter challengeEnter;
	private Member member;
	private PointGiveStandard pointGiveStandard;
	
	public PointGiveStandard getPointGiveStandard() {
		return pointGiveStandard;
	}
	public void setPointGiveStandard(PointGiveStandard pointGiveStandard) {
		this.pointGiveStandard = pointGiveStandard;
	}
	public String getChallengePointGiveCode() {
		return challengePointGiveCode;
	}
	public void setChallengePointGiveCode(String challengePointGiveCode) {
		this.challengePointGiveCode = challengePointGiveCode;
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
	public String getChallengeEnterCode() {
		return challengeEnterCode;
	}
	public void setChallengeEnterCode(String challengeEnterCode) {
		this.challengeEnterCode = challengeEnterCode;
	}
	public String getChallengeGatherAchieveRate() {
		return challengeGatherAchieveRate;
	}
	public void setChallengeGatherAchieveRate(String challengeGatherAchieveRate) {
		this.challengeGatherAchieveRate = challengeGatherAchieveRate;
	}
	public String getChallengeEnterEmail() {
		return challengeEnterEmail;
	}
	public void setChallengeEnterEmail(String challengeEnterEmail) {
		this.challengeEnterEmail = challengeEnterEmail;
	}
	public String getPointGiveStandardCode() {
		return pointGiveStandardCode;
	}
	public void setPointGiveStandardCode(String pointGiveStandardCode) {
		this.pointGiveStandardCode = pointGiveStandardCode;
	}
	public String getChallengePointGiveDate() {
		return challengePointGiveDate;
	}
	public void setChallengePointGiveDate(String challengePointGiveDate) {
		this.challengePointGiveDate = challengePointGiveDate;
	}
	public String getChallengePointGivePoint() {
		return challengePointGivePoint;
	}
	public void setChallengePointGivePoint(String challengePointGivePoint) {
		this.challengePointGivePoint = challengePointGivePoint;
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
	public ChallengeEnter getChallengeEnter() {
		return challengeEnter;
	}
	public void setChallengeEnter(ChallengeEnter challengeEnter) {
		this.challengeEnter = challengeEnter;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		return "ChallengePointGive [challengePointGiveCode=" + challengePointGiveCode + ", challengeCategoryCode="
				+ challengeCategoryCode + ", challengeGatherCode=" + challengeGatherCode + ", challengeEnterCode="
				+ challengeEnterCode + ", challengeGatherAchieveRate=" + challengeGatherAchieveRate
				+ ", challengeEnterEmail=" + challengeEnterEmail + ", pointGiveStandardCode=" + pointGiveStandardCode
				+ ", challengePointGiveDate=" + challengePointGiveDate + ", challengePointGivePoint="
				+ challengePointGivePoint + ", challengeCategory=" + challengeCategory + ", challengeGather="
				+ challengeGather + ", challengeEnter=" + challengeEnter + ", member=" + member + ", pointGiveStandard="
				+ pointGiveStandard + "]";
	}
	
	
}

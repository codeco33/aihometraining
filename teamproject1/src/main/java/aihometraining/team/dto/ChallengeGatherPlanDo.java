package aihometraining.team.dto;

import java.util.List;

public class ChallengeGatherPlanDo {
	/*challengeGatherPlanDoCode, 
	 * challengeGatherPlanCode,
	 *  memberEmail, 
	 *  challengeCategoryCode, 
	 *  challengeSettingCode, 
	 *  challengeGatherCode, 
	 *  memberEnterEmail, 
	 *  challengeGatherPlanDoContent, 
	 *  fileIdx, 
	 *  challengeGatherPlanDoRegDate, 
	 *  challengeGatherPlanDoState, 
	 *  challengeGatherPlanDoAchieveRateAfterProve, 
	 *  challengeGatherPlanDoAchieveRate, 
	 *  challengeGatherPlanDoProveCheckDate*/
	
	private String challengeGatherPlanDoCode;
	private String challengeGatherPlanCode;
	private String memberEmail;
	private String challengeCategoryCode;
	private String challengeSettingCode;
	private String challengeGatherCode;
	private String memberEnterEmail;
	private String challengeGatherPlanDoContent;
	private String fileIdx;
	private String challengeGatherPlanDoRegDate;
	private String challengeGatherPlanDoState;
	private String challengeGatherPlanDoAchieveRateAfterProve;
	private String challengeGatherPlanDoAchieveRate;
	private String challengeGatherPlanDoProveCheckDate;
	
	private ChallengeGatherPlan challengeGatherPlan;
	private Member member;
	private ChallengeCategory ChallengeCategory;
	private ChallengeSetting ChallengeSetting;
	private ChallengeGather ChallengeGather;
	private List<FileDto> fileList;
	
	public List<FileDto> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}
	public String getChallengeGatherPlanDoCode() {
		return challengeGatherPlanDoCode;
	}
	public void setChallengeGatherPlanDoCode(String challengeGatherPlanDoCode) {
		this.challengeGatherPlanDoCode = challengeGatherPlanDoCode;
	}
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
	public String getChallengeGatherCode() {
		return challengeGatherCode;
	}
	public void setChallengeGatherCode(String challengeGatherCode) {
		this.challengeGatherCode = challengeGatherCode;
	}
	public String getMemberEnterEmail() {
		return memberEnterEmail;
	}
	public void setMemberEnterEmail(String memberEnterEmail) {
		this.memberEnterEmail = memberEnterEmail;
	}
	public String getChallengeGatherPlanDoContent() {
		return challengeGatherPlanDoContent;
	}
	public void setChallengeGatherPlanDoContent(String challengeGatherPlanDoContent) {
		this.challengeGatherPlanDoContent = challengeGatherPlanDoContent;
	}
	public String getFileIdx() {
		return fileIdx;
	}
	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}
	public String getChallengeGatherPlanDoRegDate() {
		return challengeGatherPlanDoRegDate;
	}
	public void setChallengeGatherPlanDoRegDate(String challengeGatherPlanDoRegDate) {
		this.challengeGatherPlanDoRegDate = challengeGatherPlanDoRegDate;
	}
	public String getChallengeGatherPlanDoState() {
		return challengeGatherPlanDoState;
	}
	public void setChallengeGatherPlanDoState(String challengeGatherPlanDoState) {
		this.challengeGatherPlanDoState = challengeGatherPlanDoState;
	}
	public String getChallengeGatherPlanDoAchieveRateAfterProve() {
		return challengeGatherPlanDoAchieveRateAfterProve;
	}
	public void setChallengeGatherPlanDoAchieveRateAfterProve(String challengeGatherPlanDoAchieveRateAfterProve) {
		this.challengeGatherPlanDoAchieveRateAfterProve = challengeGatherPlanDoAchieveRateAfterProve;
	}
	public String getChallengeGatherPlanDoAchieveRate() {
		return challengeGatherPlanDoAchieveRate;
	}
	public void setChallengeGatherPlanDoAchieveRate(String challengeGatherPlanDoAchieveRate) {
		this.challengeGatherPlanDoAchieveRate = challengeGatherPlanDoAchieveRate;
	}
	public String getChallengeGatherPlanDoProveCheckDate() {
		return challengeGatherPlanDoProveCheckDate;
	}
	public void setChallengeGatherPlanDoProveCheckDate(String challengeGatherPlanDoProveCheckDate) {
		this.challengeGatherPlanDoProveCheckDate = challengeGatherPlanDoProveCheckDate;
	}
	public ChallengeGatherPlan getChallengeGatherPlan() {
		return challengeGatherPlan;
	}
	public void setChallengeGatherPlan(ChallengeGatherPlan challengeGatherPlan) {
		this.challengeGatherPlan = challengeGatherPlan;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public ChallengeCategory getChallengeCategory() {
		return ChallengeCategory;
	}
	public void setChallengeCategory(ChallengeCategory challengeCategory) {
		ChallengeCategory = challengeCategory;
	}
	public ChallengeSetting getChallengeSetting() {
		return ChallengeSetting;
	}
	public void setChallengeSetting(ChallengeSetting challengeSetting) {
		ChallengeSetting = challengeSetting;
	}
	public ChallengeGather getChallengeGather() {
		return ChallengeGather;
	}
	public void setChallengeGather(ChallengeGather challengeGather) {
		ChallengeGather = challengeGather;
	}
	
	@Override
	public String toString() {
		return "ChallengeGatherPlanDo [challengeGatherPlanDoCode=" + challengeGatherPlanDoCode
				+ ", challengeGatherPlanCode=" + challengeGatherPlanCode + ", memberEmail=" + memberEmail
				+ ", challengeCategoryCode=" + challengeCategoryCode + ", challengeSettingCode=" + challengeSettingCode
				+ ", challengeGatherCode=" + challengeGatherCode + ", memberEnterEmail=" + memberEnterEmail
				+ ", challengeGatherPlanDoContent=" + challengeGatherPlanDoContent + ", fileIdx=" + fileIdx
				+ ", challengeGatherPlanDoRegDate=" + challengeGatherPlanDoRegDate + ", challengeGatherPlanDoState="
				+ challengeGatherPlanDoState + ", challengeGatherPlanDoAchieveRateAfterProve="
				+ challengeGatherPlanDoAchieveRateAfterProve + ", challengeGatherPlanDoAchieveRate="
				+ challengeGatherPlanDoAchieveRate + ", challengeGatherPlanDoProveCheckDate="
				+ challengeGatherPlanDoProveCheckDate + ", challengeGatherPlan=" + challengeGatherPlan + ", member="
				+ member + ", ChallengeCategory=" + ChallengeCategory + ", ChallengeSetting=" + ChallengeSetting
				+ ", ChallengeGather=" + ChallengeGather + ", fileList=" + fileList + "]";
	}
	
	
}

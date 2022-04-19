package aihometraining.team.dto;

import java.sql.Date;

public class EClassApproved {
	private String eClassApprovedCode;
	private String memberEmail;
	private String eClassCategorySmallCode;
	private String eClassIntroduceCode;
	private String eClassSectionTitleCode;
	private String eClassSectionCurriculumCode;
	private String eClassQuestionCode;
	private String eClassAnswerCode;
	private String eClassApprovedPrice;
	private String eClassApprovedName;
	private int eClassApprovedSetDate;
	private Date eClassApprovedStratDate;
	private Date eClassApprovedEndDate;
	private int eClassApprovedStudent;
	private int eClassApprovedMaxStudent;
	private Date eClassApprovedDate;
	private int eClassApprovedState;
	
	private EClassCategorySmall eClassCategorySmall;
	private EClassIntroduce eClassIntroduce;
	private EClassSectionTitle eClassSectionTitle;
	private EClassSectionCurriculum eClassSectionCurriculum;
	private EClassQuestion eClassQuestion;
	private EClassAnswer eClassAnswer;
	public String geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(String eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
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
	public String geteClassIntroduceCode() {
		return eClassIntroduceCode;
	}
	public void seteClassIntroduceCode(String eClassIntroduceCode) {
		this.eClassIntroduceCode = eClassIntroduceCode;
	}
	public String geteClassSectionTitleCode() {
		return eClassSectionTitleCode;
	}
	public void seteClassSectionTitleCode(String eClassSectionTitleCode) {
		this.eClassSectionTitleCode = eClassSectionTitleCode;
	}
	public String geteClassSectionCurriculumCode() {
		return eClassSectionCurriculumCode;
	}
	public void seteClassSectionCurriculumCode(String eClassSectionCurriculumCode) {
		this.eClassSectionCurriculumCode = eClassSectionCurriculumCode;
	}
	public String geteClassQuestionCode() {
		return eClassQuestionCode;
	}
	public void seteClassQuestionCode(String eClassQuestionCode) {
		this.eClassQuestionCode = eClassQuestionCode;
	}
	public String geteClassAnswerCode() {
		return eClassAnswerCode;
	}
	public void seteClassAnswerCode(String eClassAnswerCode) {
		this.eClassAnswerCode = eClassAnswerCode;
	}
	public String geteClassApprovedPrice() {
		return eClassApprovedPrice;
	}
	public void seteClassApprovedPrice(String eClassApprovedPrice) {
		this.eClassApprovedPrice = eClassApprovedPrice;
	}
	public String geteClassApprovedName() {
		return eClassApprovedName;
	}
	public void seteClassApprovedName(String eClassApprovedName) {
		this.eClassApprovedName = eClassApprovedName;
	}
	public int geteClassApprovedSetDate() {
		return eClassApprovedSetDate;
	}
	public void seteClassApprovedSetDate(int eClassApprovedSetDate) {
		this.eClassApprovedSetDate = eClassApprovedSetDate;
	}
	public Date geteClassApprovedStratDate() {
		return eClassApprovedStratDate;
	}
	public void seteClassApprovedStratDate(Date eClassApprovedStratDate) {
		this.eClassApprovedStratDate = eClassApprovedStratDate;
	}
	public Date geteClassApprovedEndDate() {
		return eClassApprovedEndDate;
	}
	public void seteClassApprovedEndDate(Date eClassApprovedEndDate) {
		this.eClassApprovedEndDate = eClassApprovedEndDate;
	}
	public int geteClassApprovedStudent() {
		return eClassApprovedStudent;
	}
	public void seteClassApprovedStudent(int eClassApprovedStudent) {
		this.eClassApprovedStudent = eClassApprovedStudent;
	}
	public int geteClassApprovedMaxStudent() {
		return eClassApprovedMaxStudent;
	}
	public void seteClassApprovedMaxStudent(int eClassApprovedMaxStudent) {
		this.eClassApprovedMaxStudent = eClassApprovedMaxStudent;
	}
	public Date geteClassApprovedDate() {
		return eClassApprovedDate;
	}
	public void seteClassApprovedDate(Date eClassApprovedDate) {
		this.eClassApprovedDate = eClassApprovedDate;
	}
	public int geteClassApprovedState() {
		return eClassApprovedState;
	}
	public void seteClassApprovedState(int eClassApprovedState) {
		this.eClassApprovedState = eClassApprovedState;
	}
	public EClassCategorySmall geteClassCategorySmall() {
		return eClassCategorySmall;
	}
	public void seteClassCategorySmall(EClassCategorySmall eClassCategorySmall) {
		this.eClassCategorySmall = eClassCategorySmall;
	}
	public EClassIntroduce geteClassIntroduce() {
		return eClassIntroduce;
	}
	public void seteClassIntroduce(EClassIntroduce eClassIntroduce) {
		this.eClassIntroduce = eClassIntroduce;
	}
	public EClassSectionTitle geteClassSectionTitle() {
		return eClassSectionTitle;
	}
	public void seteClassSectionTitle(EClassSectionTitle eClassSectionTitle) {
		this.eClassSectionTitle = eClassSectionTitle;
	}
	public EClassSectionCurriculum geteClassSectionCurriculum() {
		return eClassSectionCurriculum;
	}
	public void seteClassSectionCurriculum(EClassSectionCurriculum eClassSectionCurriculum) {
		this.eClassSectionCurriculum = eClassSectionCurriculum;
	}
	public EClassQuestion geteClassQuestion() {
		return eClassQuestion;
	}
	public void seteClassQuestion(EClassQuestion eClassQuestion) {
		this.eClassQuestion = eClassQuestion;
	}
	public EClassAnswer geteClassAnswer() {
		return eClassAnswer;
	}
	public void seteClassAnswer(EClassAnswer eClassAnswer) {
		this.eClassAnswer = eClassAnswer;
	}
	
	@Override
	public String toString() {
		return "EClassApproved [eClassApprovedCode=" + eClassApprovedCode + ", memberEmail=" + memberEmail
				+ ", eClassCategorySmallCode=" + eClassCategorySmallCode + ", eClassIntroduceCode="
				+ eClassIntroduceCode + ", eClassSectionTitleCode=" + eClassSectionTitleCode
				+ ", eClassSectionCurriculumCode=" + eClassSectionCurriculumCode + ", eClassQuestionCode="
				+ eClassQuestionCode + ", eClassAnswerCode=" + eClassAnswerCode + ", eClassApprovedPrice="
				+ eClassApprovedPrice + ", eClassApprovedName=" + eClassApprovedName + ", eClassApprovedSetDate="
				+ eClassApprovedSetDate + ", eClassApprovedStratDate=" + eClassApprovedStratDate
				+ ", eClassApprovedEndDate=" + eClassApprovedEndDate + ", eClassApprovedStudent="
				+ eClassApprovedStudent + ", eClassApprovedMaxStudent=" + eClassApprovedMaxStudent
				+ ", eClassApprovedDate=" + eClassApprovedDate + ", eClassApprovedState=" + eClassApprovedState
				+ ", eClassCategorySmall=" + eClassCategorySmall + ", eClassIntroduce=" + eClassIntroduce
				+ ", eClassSectionTitle=" + eClassSectionTitle + ", eClassSectionCurriculum=" + eClassSectionCurriculum
				+ ", eClassQuestion=" + eClassQuestion + ", eClassAnswer=" + eClassAnswer + "]";
	}
	
}

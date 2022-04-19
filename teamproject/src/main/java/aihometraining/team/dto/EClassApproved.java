package aihometraining.team.dto;


public class EClassApproved {
	
	private String eClassApprovedCode;
	private Member member;
	private String memberEmail;
	private String eClassSectionTitleCode;
	private String eClassSectionCurriculumCode;
	private String eClassQuestionCode;
	private String eClassAnswerCode;
	private String eClassApprovedPrice;
	private String eClassApprovedName;
	private int eClassApprovedSetDate;
	private int eClassApprovedMaxStudent;
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
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
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
	public int geteClassApprovedMaxStudent() {
		return eClassApprovedMaxStudent;
	}
	public void seteClassApprovedMaxStudent(int eClassApprovedMaxStudent) {
		this.eClassApprovedMaxStudent = eClassApprovedMaxStudent;
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
		StringBuilder builder = new StringBuilder();
		builder.append("EClassApproved [eClassApprovedCode=");
		builder.append(eClassApprovedCode);
		builder.append(", member=");
		builder.append(member);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", eClassSectionTitleCode=");
		builder.append(eClassSectionTitleCode);
		builder.append(", eClassSectionCurriculumCode=");
		builder.append(eClassSectionCurriculumCode);
		builder.append(", eClassQuestionCode=");
		builder.append(eClassQuestionCode);
		builder.append(", eClassAnswerCode=");
		builder.append(eClassAnswerCode);
		builder.append(", eClassApprovedPrice=");
		builder.append(eClassApprovedPrice);
		builder.append(", eClassApprovedName=");
		builder.append(eClassApprovedName);
		builder.append(", eClassApprovedSetDate=");
		builder.append(eClassApprovedSetDate);
		builder.append(", eClassApprovedMaxStudent=");
		builder.append(eClassApprovedMaxStudent);
		builder.append(", eClassIntroduce=");
		builder.append(eClassIntroduce);
		builder.append(", eClassSectionTitle=");
		builder.append(eClassSectionTitle);
		builder.append(", eClassSectionCurriculum=");
		builder.append(eClassSectionCurriculum);
		builder.append(", eClassQuestion=");
		builder.append(eClassQuestion);
		builder.append(", eClassAnswer=");
		builder.append(eClassAnswer);
		builder.append("]");
		return builder.toString();
	}

}
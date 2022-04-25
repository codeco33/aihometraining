package aihometraining.team.dto;

import java.sql.Date;

public class EClassReview {

	private String eClassReviewCode;
	private String eClassApprovedCode;
	private String memberEmail;
	private String eClassReviewContent;
	private int eClassReviewScore;
	private Date eClassReviewRegDate;
	private Date eClassReviewUpdateDate;
	private String memberUpdateEmail;
	private String replyMemberEmail;
	private Date eClassReviewAnswerRegDate;
	private Date eClassReviewAnswerUpdateDate;
	private String replyMemberUpdateEmail;
	
	private EClassApproved eclassapproved;
	private Member member;
	public String geteClassReviewCode() {
		return eClassReviewCode;
	}
	public void seteClassReviewCode(String eClassReviewCode) {
		this.eClassReviewCode = eClassReviewCode;
	}
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
	public String geteClassReviewContent() {
		return eClassReviewContent;
	}
	public void seteClassReviewContent(String eClassReviewContent) {
		this.eClassReviewContent = eClassReviewContent;
	}
	public int geteClassReviewScore() {
		return eClassReviewScore;
	}
	public void seteClassReviewScore(int eClassReviewScore) {
		this.eClassReviewScore = eClassReviewScore;
	}
	public Date geteClassReviewRegDate() {
		return eClassReviewRegDate;
	}
	public void seteClassReviewRegDate(Date eClassReviewRegDate) {
		this.eClassReviewRegDate = eClassReviewRegDate;
	}
	public Date geteClassReviewUpdateDate() {
		return eClassReviewUpdateDate;
	}
	public void seteClassReviewUpdateDate(Date eClassReviewUpdateDate) {
		this.eClassReviewUpdateDate = eClassReviewUpdateDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String getReplyMemberEmail() {
		return replyMemberEmail;
	}
	public void setReplyMemberEmail(String replyMemberEmail) {
		this.replyMemberEmail = replyMemberEmail;
	}
	public Date geteClassReviewAnswerRegDate() {
		return eClassReviewAnswerRegDate;
	}
	public void seteClassReviewAnswerRegDate(Date eClassReviewAnswerRegDate) {
		this.eClassReviewAnswerRegDate = eClassReviewAnswerRegDate;
	}
	public Date geteClassReviewAnswerUpdateDate() {
		return eClassReviewAnswerUpdateDate;
	}
	public void seteClassReviewAnswerUpdateDate(Date eClassReviewAnswerUpdateDate) {
		this.eClassReviewAnswerUpdateDate = eClassReviewAnswerUpdateDate;
	}
	public String getReplyMemberUpdateEmail() {
		return replyMemberUpdateEmail;
	}
	public void setReplyMemberUpdateEmail(String replyMemberUpdateEmail) {
		this.replyMemberUpdateEmail = replyMemberUpdateEmail;
	}
	public EClassApproved getEclassapproved() {
		return eclassapproved;
	}
	public void setEclassapproved(EClassApproved eclassapproved) {
		this.eclassapproved = eclassapproved;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "EClassReview [eClassReviewCode=" + eClassReviewCode + ", eClassApprovedCode=" + eClassApprovedCode
				+ ", memberEmail=" + memberEmail + ", eClassReviewContent=" + eClassReviewContent
				+ ", eClassReviewScore=" + eClassReviewScore + ", eClassReviewRegDate=" + eClassReviewRegDate
				+ ", eClassReviewUpdateDate=" + eClassReviewUpdateDate + ", memberUpdateEmail=" + memberUpdateEmail
				+ ", replyMemberEmail=" + replyMemberEmail + ", eClassReviewAnswerRegDate=" + eClassReviewAnswerRegDate
				+ ", eClassReviewAnswerUpdateDate=" + eClassReviewAnswerUpdateDate + ", replyMemberUpdateEmail="
				+ replyMemberUpdateEmail + ", eclassapproved=" + eclassapproved + ", member=" + member + "]";
	}
	
}

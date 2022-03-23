package aihometraining.team.dto;

public class Member {
	
	private String memberEmail;
	private String memberPw;
	private String memberLevelCode;
	private String memberNewsAgree;
	private String memberRegDate;
	private String memberName;
	private String memberPhone;
	private String memberNickname;
	private String memberBirthday;
	private String memberGender;
	private String memberRecommendEmail;
	private int memberFinalPoint;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberLevelCode() {
		return memberLevelCode;
	}
	public void setMemberLevelCode(String memberLevelCode) {
		this.memberLevelCode = memberLevelCode;
	}
	public String getMemberNewsAgree() {
		return memberNewsAgree;
	}
	public void setMemberNewsAgree(String memberNewsAgree) {
		this.memberNewsAgree = memberNewsAgree;
	}
	public String getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getMemberBirthday() {
		return memberBirthday;
	}
	public void setMemberBirthday(String memberBirthday) {
		this.memberBirthday = memberBirthday;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberRecommendEmail() {
		return memberRecommendEmail;
	}
	public void setMemberRecommendEmail(String memberRecommendEmail) {
		this.memberRecommendEmail = memberRecommendEmail;
	}
	public int getMemberFinalPoint() {
		return memberFinalPoint;
	}
	public void setMemberFinalPoint(int memberFinalPoint) {
		this.memberFinalPoint = memberFinalPoint;
	}
	@Override
	public String toString() {
		return "Member [memberEmail=" + memberEmail + ", memberPw=" + memberPw + ", memberLevelCode=" + memberLevelCode
				+ ", memberNewsAgree=" + memberNewsAgree + ", memberRegDate=" + memberRegDate + ", memberName="
				+ memberName + ", memberPhone=" + memberPhone + ", memberNickname=" + memberNickname
				+ ", memberBirthday=" + memberBirthday + ", memberGender=" + memberGender + ", memberRecommendEmail="
				+ memberRecommendEmail + ", memberFinalPoint=" + memberFinalPoint + "]";
	}
	
}

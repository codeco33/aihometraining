package aihometraining.team.dto;

public class EClassTake {
	private String eClassTakeCode;
	private Member member;
	private String memberPhone;
	private EClassApproved eClassApproved;
	private String eClassTakeRegDate;
	private String eClassTakeState;
	private String paymentGroupCode;
	public String geteClassTakeCode() {
		return eClassTakeCode;
	}
	public void seteClassTakeCode(String eClassTakeCode) {
		this.eClassTakeCode = eClassTakeCode;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public EClassApproved geteClassApproved() {
		return eClassApproved;
	}
	public void seteClassApproved(EClassApproved eClassApproved) {
		this.eClassApproved = eClassApproved;
	}
	public String geteClassTakeRegDate() {
		return eClassTakeRegDate;
	}
	public void seteClassTakeRegDate(String eClassTakeRegDate) {
		this.eClassTakeRegDate = eClassTakeRegDate;
	}
	public String geteClassTakeState() {
		return eClassTakeState;
	}
	public void seteClassTakeState(String eClassTakeState) {
		this.eClassTakeState = eClassTakeState;
	}
	public String getPaymentGroupCode() {
		return paymentGroupCode;
	}
	public void setPaymentGroupCode(String paymentGroupCode) {
		this.paymentGroupCode = paymentGroupCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EClassTake [eClassTakeCode=");
		builder.append(eClassTakeCode);
		builder.append(", member=");
		builder.append(member);
		builder.append(", memberPhone=");
		builder.append(memberPhone);
		builder.append(", eClassApproved=");
		builder.append(eClassApproved);
		builder.append(", eClassTakeRegDate=");
		builder.append(eClassTakeRegDate);
		builder.append(", eClassTakeState=");
		builder.append(eClassTakeState);
		builder.append(", paymentGroupCode=");
		builder.append(paymentGroupCode);
		builder.append("]");
		return builder.toString();
	}
	
	
}

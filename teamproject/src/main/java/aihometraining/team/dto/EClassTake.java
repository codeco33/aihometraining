package aihometraining.team.dto;

public class EClassTake {
	private String eClassTakeCode;
	private String memberEmail;
	private String memberPhone;
	private String eClassApprovedCode;
	private String eClassTakeRegDate;
	private String eClassTakeState;
	private String paymentGroupCode;
	public String geteClassTakeCode() {
		return eClassTakeCode;
	}
	public void seteClassTakeCode(String eClassTakeCode) {
		this.eClassTakeCode = eClassTakeCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(String eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
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
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", memberPhone=");
		builder.append(memberPhone);
		builder.append(", eClassApprovedCode=");
		builder.append(eClassApprovedCode);
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

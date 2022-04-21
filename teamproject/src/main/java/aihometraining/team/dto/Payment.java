package aihometraining.team.dto;

public class Payment {
	private String paymentCode;
	private String paymentGroupCode;
	private Member member;
	private String memberEmail;
	private PaymentMethod paymentMethod;
	private String paymentMethodName;
	private String paymentMethodCode;
	private int paymentTotalOrderPrice;
	private int paymentUsePoint;
	private int paymentTotalPayPrice;
	private String paymentState;
	private String paymentRegDate;
	
	
	
	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}
	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getPaymentGroupCode() {
		return paymentGroupCode;
	}
	public void setPaymentGroupCode(String paymentGroupCode) {
		this.paymentGroupCode = paymentGroupCode;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	public int getPaymentTotalOrderPrice() {
		return paymentTotalOrderPrice;
	}
	public void setPaymentTotalOrderPrice(int paymentTotalOrderPrice) {
		this.paymentTotalOrderPrice = paymentTotalOrderPrice;
	}
	public int getPaymentUsePoint() {
		return paymentUsePoint;
	}
	public void setPaymentUsePoint(int paymentUsePoint) {
		this.paymentUsePoint = paymentUsePoint;
	}
	public int getPaymentTotalPayPrice() {
		return paymentTotalPayPrice;
	}
	public void setPaymentTotalPayPrice(int paymentTotalPayPrice) {
		this.paymentTotalPayPrice = paymentTotalPayPrice;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	public String getPaymentRegDate() {
		return paymentRegDate;
	}
	public void setPaymentRegDate(String paymentRegDate) {
		this.paymentRegDate = paymentRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [paymentCode=");
		builder.append(paymentCode);
		builder.append(", paymentGroupCode=");
		builder.append(paymentGroupCode);
		builder.append(", member=");
		builder.append(member);
		builder.append(", paymentMethod=");
		builder.append(paymentMethod);
		builder.append(", paymentMethodName=");
		builder.append(paymentMethodName);
		builder.append(", paymentTotalOrderPrice=");
		builder.append(paymentTotalOrderPrice);
		builder.append(", paymentUsePoint=");
		builder.append(paymentUsePoint);
		builder.append(", paymentTotalPayPrice=");
		builder.append(paymentTotalPayPrice);
		builder.append(", paymentState=");
		builder.append(paymentState);
		builder.append(", paymentRegDate=");
		builder.append(paymentRegDate);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", paymentMethodCode=");
		builder.append(paymentMethodCode);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

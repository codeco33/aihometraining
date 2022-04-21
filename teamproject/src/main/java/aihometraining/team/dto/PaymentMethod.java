package aihometraining.team.dto;

public class PaymentMethod {
	private String paymentMethodCode;
	private String paymentMethodName;
	private Member member;
	private String paymentMethodRegDate;
	private String paymentMethodUpdateEmail;
	private String paymentMethodUpdate;
	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}
	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getPaymentMethodRegDate() {
		return paymentMethodRegDate;
	}
	public void setPaymentMethodRegDate(String paymentMethodRegDate) {
		this.paymentMethodRegDate = paymentMethodRegDate;
	}
	public String getPaymentMethodUpdateEmail() {
		return paymentMethodUpdateEmail;
	}
	public void setPaymentMethodUpdateEmail(String paymentMethodUpdateEmail) {
		this.paymentMethodUpdateEmail = paymentMethodUpdateEmail;
	}
	public String getPaymentMethodUpdate() {
		return paymentMethodUpdate;
	}
	public void setPaymentMethodUpdate(String paymentMethodUpdate) {
		this.paymentMethodUpdate = paymentMethodUpdate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentMethode [paymentMethodCode=");
		builder.append(paymentMethodCode);
		builder.append(", paymentMethodName=");
		builder.append(paymentMethodName);
		builder.append(", member=");
		builder.append(member);
		builder.append(", paymentMethodRegDate=");
		builder.append(paymentMethodRegDate);
		builder.append(", paymentMethodUpdateEmail=");
		builder.append(paymentMethodUpdateEmail);
		builder.append(", paymentMethodUpdate=");
		builder.append(paymentMethodUpdate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

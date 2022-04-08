package aihometraining.team.dto;

public class WishList {
	private String wishListCode;
	private Member member;
	//private EClassApproved eClassApprovedCode;
	private String wishListRegDate;
	
	public String getWishListCode() {
		return wishListCode;
	}
	public void setWishListCode(String wishListCode) {
		this.wishListCode = wishListCode;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public EClassApproved geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(EClassApproved eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
	}
	public String getWishListRegDate() {
		return wishListRegDate;
	}
	public void setWishListRegDate(String wishListRegDate) {
		this.wishListRegDate = wishListRegDate;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WishList [wishListCode=");
		builder.append(wishListCode);
		builder.append(", member=");
		builder.append(member);
		builder.append(", eClassApprovedCode=");
		builder.append(eClassApprovedCode);
		builder.append(", wishListRegDate=");
		builder.append(wishListRegDate);
		builder.append("]");
		return builder.toString();
	}
	
}

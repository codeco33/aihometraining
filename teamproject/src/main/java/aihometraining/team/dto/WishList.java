package aihometraining.team.dto;

public class WishList {
	private String wishListCode;
	private Member member;	//memberId
	private EClassApproved eClassApproved;
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
	public EClassApproved geteClassApproved() {
		return eClassApproved;
	}
	public void seteClassApprovedCode(EClassApproved eClassApproved) {
		this.eClassApproved = eClassApproved;
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
		builder.append(eClassApproved);
		builder.append(", wishListRegDate=");
		builder.append(wishListRegDate);
		builder.append("]");
		return builder.toString();
	}
	
}

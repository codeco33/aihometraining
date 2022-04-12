package aihometraining.team.dto;

public class WishList {
	private String wishListCode;
	private Member member;	//memberEmail
	private EClassApproved eClassApproved;	//eClassApprovedCode
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
	public void seteClassApproved(EClassApproved eClassApproved) {
		this.eClassApproved = eClassApproved;
	}
	public String getWishListRegDate() {
		return wishListRegDate;
	}
	public void setWishListRegDate(String wishListRegDate) {
		this.wishListRegDate = wishListRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WishList [wishListCode=");
		builder.append(wishListCode);
		builder.append(", member=");
		builder.append(member);
		builder.append(", eClassApproved=");
		builder.append(eClassApproved);
		builder.append(", wishListRegDate=");
		builder.append(wishListRegDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}

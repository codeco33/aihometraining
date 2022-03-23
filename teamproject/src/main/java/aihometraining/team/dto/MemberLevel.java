package aihometraining.team.dto;

public class MemberLevel {
	private String memberLevelCode;
	private String memberLevelName;
	private String memberLevelRegDate;
	
	public String getMemberLevelCode() {
		return memberLevelCode;
	}
	public void setMemberLevelCode(String memberLevelCode) {
		this.memberLevelCode = memberLevelCode;
	}
	public String getMemberLevelName() {
		return memberLevelName;
	}
	public void setMemberLevelName(String memberLevelName) {
		this.memberLevelName = memberLevelName;
	}
	public String getMemberLevelRegDate() {
		return memberLevelRegDate;
	}
	public void setMemberLevelRegDate(String memberLevelRegDate) {
		this.memberLevelRegDate = memberLevelRegDate;
	}
	
	@Override
	public String toString() {
		return "MemberLevel [memberLevelCode=" + memberLevelCode + ", memberLevelName=" + memberLevelName
				+ ", memberLevelRegDate=" + memberLevelRegDate + "]";
	}
	
	
	
}

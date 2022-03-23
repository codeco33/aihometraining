package aihometraining.team.dto;

public class LoginHistory {
	private String loginCode;
	private String loginMemberEmail;
	private String loginDate;
	private int loginFailNum;
	private String loginRecentTryDate;
	private String loginMACAddress;
	private String loginOS;
	private String loginLogoutDate;
	private String loginBrowser;
	private String loginIPAddress;
	
	private Member member;

	public String getLoginCode() {
		return loginCode;
	}

	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}

	public String getLoginMemberEmail() {
		return loginMemberEmail;
	}

	public void setLoginMemberEmail(String loginMemberEmail) {
		this.loginMemberEmail = loginMemberEmail;
	}

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}

	public int getLoginFailNum() {
		return loginFailNum;
	}

	public void setLoginFailNum(int loginFailNum) {
		this.loginFailNum = loginFailNum;
	}

	public String getLoginRecentTryDate() {
		return loginRecentTryDate;
	}

	public void setLoginRecentTryDate(String loginRecentTryDate) {
		this.loginRecentTryDate = loginRecentTryDate;
	}

	public String getLoginMACAddress() {
		return loginMACAddress;
	}

	public void setLoginMACAddress(String loginMACAddress) {
		this.loginMACAddress = loginMACAddress;
	}

	public String getLoginOS() {
		return loginOS;
	}

	public void setLoginOS(String loginOS) {
		this.loginOS = loginOS;
	}

	public String getLoginLogoutDate() {
		return loginLogoutDate;
	}

	public void setLoginLogoutDate(String loginLogoutDate) {
		this.loginLogoutDate = loginLogoutDate;
	}

	public String getLoginBrowser() {
		return loginBrowser;
	}

	public void setLoginBrowser(String loginBrowser) {
		this.loginBrowser = loginBrowser;
	}

	public String getLoginIPAddress() {
		return loginIPAddress;
	}

	public void setLoginIPAddress(String loginIPAddress) {
		this.loginIPAddress = loginIPAddress;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "LoginHistory [loginCode=" + loginCode + ", loginMemberEmail=" + loginMemberEmail + ", loginDate="
				+ loginDate + ", loginFailNum=" + loginFailNum + ", loginRecentTryDate=" + loginRecentTryDate
				+ ", loginMACAddress=" + loginMACAddress + ", loginOS=" + loginOS + ", loginLogoutDate="
				+ loginLogoutDate + ", loginBrowser=" + loginBrowser + ", loginIPAddress=" + loginIPAddress
				+ ", member=" + member + "]";
	}

	
	
}

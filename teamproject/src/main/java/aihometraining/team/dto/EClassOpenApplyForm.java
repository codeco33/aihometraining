package aihometraining.team.dto;

import java.sql.Date;

public class EClassOpenApplyForm {
	private String 	eClassOpenAppleyCode;
	private String 	eClassOpenApplyMemberEmail;
	private String 	eClassOpenApplyName;
	private String 	eClassOpenApplyCategorySamll;
	private int 	eClassOpenApplyPrice;
	private String	eClassIntroduceCode;
	private Date	eClassOpenApplyDate;
	private int 	eClassOpenApplyApproveState;
	
	//wishList 구현으로 추가함 -진수경
	private EClassCategorySmall eClassCategorySmall;
	private EClassIntroduce eClassIntroduce;
	public EClassCategorySmall geteClassCategorySmall() {
		return eClassCategorySmall;
	}
	public void seteClassCategorySmall(EClassCategorySmall eClassCategorySmall) {
		this.eClassCategorySmall = eClassCategorySmall;
	}
	public EClassIntroduce geteClassIntroduce() {
		return eClassIntroduce;
	}
	public void seteClassIntroduce(EClassIntroduce eClassIntroduce) {
		this.eClassIntroduce = eClassIntroduce;
	}
	
	public String geteClassOpenAppleyCode() {
		return eClassOpenAppleyCode;
	}
	public void seteClassOpenAppleyCode(String eClassOpenAppleyCode) {
		this.eClassOpenAppleyCode = eClassOpenAppleyCode;
	}
	public String geteClassOpenApplyMemberEmail() {
		return eClassOpenApplyMemberEmail;
	}
	public void seteClassOpenApplyMemberEmail(String eClassOpenApplyMemberEmail) {
		this.eClassOpenApplyMemberEmail = eClassOpenApplyMemberEmail;
	}
	public String geteClassOpenApplyName() {
		return eClassOpenApplyName;
	}
	public void seteClassOpenApplyName(String eClassOpenApplyName) {
		this.eClassOpenApplyName = eClassOpenApplyName;
	}
	public String geteClassOpenApplyCategorySamll() {
		return eClassOpenApplyCategorySamll;
	}
	public void seteClassOpenApplyCategorySamll(String eClassOpenApplyCategorySamll) {
		this.eClassOpenApplyCategorySamll = eClassOpenApplyCategorySamll;
	}
	public int geteClassOpenApplyPrice() {
		return eClassOpenApplyPrice;
	}
	public void seteClassOpenApplyPrice(int eClassOpenApplyPrice) {
		this.eClassOpenApplyPrice = eClassOpenApplyPrice;
	}
	public String geteClassIntroduceCode() {
		return eClassIntroduceCode;
	}
	public void seteClassIntroduceCode(String eClassIntroduceCode) {
		this.eClassIntroduceCode = eClassIntroduceCode;
	}
	public Date geteClassOpenApplyDate() {
		return eClassOpenApplyDate;
	}
	public void seteClassOpenApplyDate(Date eClassOpenApplyDate) {
		this.eClassOpenApplyDate = eClassOpenApplyDate;
	}
	public int geteClassOpenApplyApproveState() {
		return eClassOpenApplyApproveState;
	}
	public void seteClassOpenApplyApproveState(int eClassOpenApplyApproveState) {
		this.eClassOpenApplyApproveState = eClassOpenApplyApproveState;
	}
	@Override
	public String toString() {
		return "EClassOpenApplyForm [eClassOpenAppleyCode=" + eClassOpenAppleyCode + ", eClassOpenApplyMemberEmail="
				+ eClassOpenApplyMemberEmail + ", eClassOpenApplyName=" + eClassOpenApplyName
				+ ", eClassOpenApplyCategorySamll=" + eClassOpenApplyCategorySamll + ", eClassOpenApplyPrice="
				+ eClassOpenApplyPrice + ", eClassIntroduceCode=" + eClassIntroduceCode + ", eClassOpenApplyDate="
				+ eClassOpenApplyDate + ", eClassOpenApplyApproveState=" + eClassOpenApplyApproveState 
				+ ", eClassCategorySmall=" + eClassCategorySmall + ", eClassIntroduce=" + eClassIntroduce +"]";
	}
}

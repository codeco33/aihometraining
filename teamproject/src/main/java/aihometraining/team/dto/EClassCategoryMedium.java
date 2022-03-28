package aihometraining.team.dto;

import java.util.List;

public class EClassCategoryMedium {
	/*
	 * eClassCategoryMediumCode
	 * , eClassCategoryMediumName
	 * , eClassCategoryLargeCode
	 * , eClassCategoryLargeName
	 * , memberEmail
	 * , eClassCategoryMediumRegDate
	 * , memberUpdateEmail
	 * , eClassCategoryMediumUpdateDate
	 * */
	private String eClassCategoryMediumCode;
	private String eClassCategoryMediumName;
	private String eClassCategoryLargeCode;
	private String eClassCategoryLargeName;
	private String memberEmail;
	private String eClassCategoryMediumRegDate;
	private String memberUpdateEmail;
	private String eClassCategoryMediumUpdateDate;
	
	private List<EClassCategorySmall> eClassCategorySmallList;
	
		
	public List<EClassCategorySmall> geteClassCategorySmallList() {
		return eClassCategorySmallList;
	}
	public void seteClassCategorySmallList(List<EClassCategorySmall> eClassCategorySmallList) {
		this.eClassCategorySmallList = eClassCategorySmallList;
	}
	
	
	public String geteClassCategoryMediumCode() {
		return eClassCategoryMediumCode;
	}
	public void seteClassCategoryMediumCode(String eClassCategoryMediumCode) {
		this.eClassCategoryMediumCode = eClassCategoryMediumCode;
	}
	public String geteClassCategoryMediumName() {
		return eClassCategoryMediumName;
	}
	public void seteClassCategoryMediumName(String eClassCategoryMediumName) {
		this.eClassCategoryMediumName = eClassCategoryMediumName;
	}
	public String geteClassCategoryLargeCode() {
		return eClassCategoryLargeCode;
	}
	public void seteClassCategoryLargeCode(String eClassCategoryLargeCode) {
		this.eClassCategoryLargeCode = eClassCategoryLargeCode;
	}
	public String geteClassCategoryLargeName() {
		return eClassCategoryLargeName;
	}
	public void seteClassCategoryLargeName(String eClassCategoryLargeName) {
		this.eClassCategoryLargeName = eClassCategoryLargeName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassCategoryMediumRegDate() {
		return eClassCategoryMediumRegDate;
	}
	public void seteClassCategoryMediumRegDate(String eClassCategoryMediumRegDate) {
		this.eClassCategoryMediumRegDate = eClassCategoryMediumRegDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String geteClassCategoryMediumUpdateDate() {
		return eClassCategoryMediumUpdateDate;
	}
	public void seteClassCategoryMediumUpdateDate(String eClassCategoryMediumUpdateDate) {
		this.eClassCategoryMediumUpdateDate = eClassCategoryMediumUpdateDate;
	}
	
	@Override
	public String toString() {
		return "EClassCategoryMedium [eClassCategoryMediumCode=" + eClassCategoryMediumCode
				+ ", eClassCategoryMediumName=" + eClassCategoryMediumName + ", eClassCategoryLargeCode="
				+ eClassCategoryLargeCode + ", eClassCategoryLargeName=" + eClassCategoryLargeName + ", memberEmail="
				+ memberEmail + ", eClassCategoryMediumRegDate=" + eClassCategoryMediumRegDate + ", memberUpdateEmail="
				+ memberUpdateEmail + ", eClassCategoryMediumUpdateDate=" + eClassCategoryMediumUpdateDate
				+ ", eClassCategorySmallList=" + eClassCategorySmallList + "]";
	}
	
	
}

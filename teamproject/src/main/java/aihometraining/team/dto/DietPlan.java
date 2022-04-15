package aihometraining.team.dto;

public class DietPlan {
	
	
	private String dietPlanCode;
	private String eClassApprovedCode;
	private String dietOneMealConnectionCode;
	private String nutrientsAPICode;
	private String memberEmail;
	private String dietPlanDay;
	private String dietPlanTime;
	private int dietPlanDoValue;
	private String dietPlanRegDate;
	private String memberUpdateEmail;
	private String dietPlanUpdateDate;
	
	
	
	public String getDietPlanCode() {
		return dietPlanCode;
	}
	public void setDietPlanCode(String dietPlanCode) {
		this.dietPlanCode = dietPlanCode;
	}
	public String geteClassApprovedCode() {
		return eClassApprovedCode;
	}
	public void seteClassApprovedCode(String eClassApprovedCode) {
		this.eClassApprovedCode = eClassApprovedCode;
	}
	public String getDietOneMealConnectionCode() {
		return dietOneMealConnectionCode;
	}
	public void setDietOneMealConnectionCode(String dietOneMealConnectionCode) {
		this.dietOneMealConnectionCode = dietOneMealConnectionCode;
	}
	public String getNutrientsAPICode() {
		return nutrientsAPICode;
	}
	public void setNutrientsAPICode(String nutrientsAPICode) {
		this.nutrientsAPICode = nutrientsAPICode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getDietPlanDay() {
		return dietPlanDay;
	}
	public void setDietPlanDay(String dietPlanDay) {
		this.dietPlanDay = dietPlanDay;
	}
	public String getDietPlanTime() {
		return dietPlanTime;
	}
	public void setDietPlanTime(String dietPlanTime) {
		this.dietPlanTime = dietPlanTime;
	}

	public String getDietPlanRegDate() {
		return dietPlanRegDate;
	}
	public void setDietPlanRegDate(String dietPlanRegDate) {
		this.dietPlanRegDate = dietPlanRegDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String getDietPlanUpdateDate() {
		return dietPlanUpdateDate;
	}
	public void setDietPlanUpdateDate(String dietPlanUpdateDate) {
		this.dietPlanUpdateDate = dietPlanUpdateDate;
	}
	
	
	public int getDietPlanDoValue() {
		return dietPlanDoValue;
	}
	public void setDietPlanDoValue(int dietPlanDoValue) {
		this.dietPlanDoValue = dietPlanDoValue;
	}
	@Override
	public String toString() {
		return "DietPlan [dietPlanCode=" + dietPlanCode + ", eClassApprovedCode=" + eClassApprovedCode
				+ ", dietOneMealConnectionCode=" + dietOneMealConnectionCode + ", nutrientsAPICode=" + nutrientsAPICode
				+ ", memberEmail=" + memberEmail + ", dietPlanDay=" + dietPlanDay + ", dietPlanTime=" + dietPlanTime
				+ ", dietPlanDoValue=" + dietPlanDoValue + ", dietPlanRegDate=" + dietPlanRegDate
				+ ", memberUpdateEmail=" + memberUpdateEmail + ", dietPlanUpdateDate=" + dietPlanUpdateDate + "]";
	}

	
	

}

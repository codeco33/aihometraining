package aihometraining.team.dto;

public class ReportStandard {
	
	
	private String reportStandardCode;
	private String reportStandardName;
	private String memberEmail;
	private String reportStandardRegDate;
	private String memberUpdateEmail;
	private String reportStandardUpdateDate;
	
	public String getReportStandardCode() {
		return reportStandardCode;
	}
	public void setReportStandardCode(String reportStandardCode) {
		this.reportStandardCode = reportStandardCode;
	}
	public String getReportStandardName() {
		return reportStandardName;
	}
	public void setReportStandardName(String reportStandardName) {
		this.reportStandardName = reportStandardName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getReportStandardRegDate() {
		return reportStandardRegDate;
	}
	public void setReportStandardRegDate(String reportStandardRegDate) {
		this.reportStandardRegDate = reportStandardRegDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String getReportStandardUpdateDate() {
		return reportStandardUpdateDate;
	}
	public void setReportStandardUpdateDate(String reportStandardUpdateDate) {
		this.reportStandardUpdateDate = reportStandardUpdateDate;
	}
	
	@Override
	public String toString() {
		return "ReportStandard [reportStandardCode=" + reportStandardCode + ", reportStandardName=" + reportStandardName
				+ ", memberEmail=" + memberEmail + ", reportStandardRegDate=" + reportStandardRegDate
				+ ", memberUpdateEmail=" + memberUpdateEmail + ", reportStandardUpdateDate=" + reportStandardUpdateDate
				+ "]";
	}
	
	
	
}

package aihometraining.team.dto;

public class Report {

	private String reportCode;
	private String reportMemberEmail;
	private String reportMemberName;
	private String reportTargetType;
	private String reportTarget;
	private String reportStandardCode;
	private String reportReason;
	private String reportIP;
	private String reportRegDate;
	private String reportProcessState;
	private String reportProcessRegMemberEmail;
	private String reportProcessDate;
	private String reportProcessUpdateMemberEmail;
	private String reportProcessUpdateDate;
	
	public String getReportCode() {
		return reportCode;
	}
	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}
	public String getReportMemberEmail() {
		return reportMemberEmail;
	}
	public void setReportMemberEmail(String reportMemberEmail) {
		this.reportMemberEmail = reportMemberEmail;
	}
	public String getReportMemberName() {
		return reportMemberName;
	}
	public void setReportMemberName(String reportMemberName) {
		this.reportMemberName = reportMemberName;
	}
	public String getReportTargetType() {
		return reportTargetType;
	}
	public void setReportTargetType(String reportTargetType) {
		this.reportTargetType = reportTargetType;
	}
	public String getReportTarget() {
		return reportTarget;
	}
	public void setReportTarget(String reportTarget) {
		this.reportTarget = reportTarget;
	}
	public String getReportStandardCode() {
		return reportStandardCode;
	}
	public void setReportStandardCode(String reportStandardCode) {
		this.reportStandardCode = reportStandardCode;
	}
	public String getReportReason() {
		return reportReason;
	}
	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}
	public String getReportIP() {
		return reportIP;
	}
	public void setReportIP(String reportIP) {
		this.reportIP = reportIP;
	}
	public String getReportRegDate() {
		return reportRegDate;
	}
	public void setReportRegDate(String reportRegDate) {
		this.reportRegDate = reportRegDate;
	}
	public String getReportProcessState() {
		return reportProcessState;
	}
	public void setReportProcessState(String reportProcessState) {
		this.reportProcessState = reportProcessState;
	}
	public String getReportProcessRegMemberEmail() {
		return reportProcessRegMemberEmail;
	}
	public void setReportProcessRegMemberEmail(String reportProcessRegMemberEmail) {
		this.reportProcessRegMemberEmail = reportProcessRegMemberEmail;
	}
	public String getReportProcessDate() {
		return reportProcessDate;
	}
	public void setReportProcessDate(String reportProcessDate) {
		this.reportProcessDate = reportProcessDate;
	}
	public String getReportProcessUpdateMemberEmail() {
		return reportProcessUpdateMemberEmail;
	}
	public void setReportProcessUpdateMemberEmail(String reportProcessUpdateMemberEmail) {
		this.reportProcessUpdateMemberEmail = reportProcessUpdateMemberEmail;
	}
	public String getReportProcessUpdateDate() {
		return reportProcessUpdateDate;
	}
	public void setReportProcessUpdateDate(String reportProcessUpdateDate) {
		this.reportProcessUpdateDate = reportProcessUpdateDate;
	}
	
	@Override
	public String toString() {
		return "Report [reportCode=" + reportCode + ", reportMemberEmail=" + reportMemberEmail + ", reportMemberName="
				+ reportMemberName + ", reportTargetType=" + reportTargetType + ", reportTarget=" + reportTarget
				+ ", reportStandardCode=" + reportStandardCode + ", reportReason=" + reportReason + ", reportIP="
				+ reportIP + ", reportRegDate=" + reportRegDate + ", reportProcessState=" + reportProcessState
				+ ", reportProcessRegMemberEmail=" + reportProcessRegMemberEmail + ", reportProcessDate="
				+ reportProcessDate + ", reportProcessUpdateMemberEmail=" + reportProcessUpdateMemberEmail
				+ ", reportProcessUpdateDate=" + reportProcessUpdateDate + "]";
	}
	
}

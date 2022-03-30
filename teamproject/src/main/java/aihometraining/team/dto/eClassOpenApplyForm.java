package aihometraining.team.dto;

import java.sql.Date;

public class eClassOpenApplyForm {
	private String openApplyName;
	private int openApplyPrice;
	private Date openApplyDate;
	private boolean openApplyState;
	private String openApplyEmail;
	private Date openApplyApproveDate;
	private int openRejectCode;
	private int openMaxStudent;
	private Date openGatherStartDate;
	
	public String getOpenApplyName() {
		return openApplyName;
	}
	public void setOpenApplyName(String openApplyName) {
		this.openApplyName = openApplyName;
	}
	public int getOpenApplyPrice() {
		return openApplyPrice;
	}
	public void setOpenApplyPrice(int openApplyPrice) {
		this.openApplyPrice = openApplyPrice;
	}
	public Date getOpenApplyDate() {
		return openApplyDate;
	}
	public void setOpenApplyDate(Date openApplyDate) {
		this.openApplyDate = openApplyDate;
	}
	public boolean isOpenApplyState() {
		return openApplyState;
	}
	public void setOpenApplyState(boolean openApplyState) {
		this.openApplyState = openApplyState;
	}
	public String getOpenApplyEmail() {
		return openApplyEmail;
	}
	public void setOpenApplyEmail(String openApplyEmail) {
		this.openApplyEmail = openApplyEmail;
	}
	public Date getOpenApplyApproveDate() {
		return openApplyApproveDate;
	}
	public void setOpenApplyApproveDate(Date openApplyApproveDate) {
		this.openApplyApproveDate = openApplyApproveDate;
	}
	public int getOpenRejectCode() {
		return openRejectCode;
	}
	public void setOpenRejectCode(int openRejectCode) {
		this.openRejectCode = openRejectCode;
	}
	public int getOpenMaxStudent() {
		return openMaxStudent;
	}
	public void setOpenMaxStudent(int openMaxStudent) {
		this.openMaxStudent = openMaxStudent;
	}
	public Date getOpenGatherStartDate() {
		return openGatherStartDate;
	}
	public void setOpenGatherStartDate(Date openGatherStartDate) {
		this.openGatherStartDate = openGatherStartDate;
	}
	
	@Override
	public String toString() {
		return "eClassOpenApplyForm [openApplyName=" + openApplyName + ", openApplyPrice=" + openApplyPrice
				+ ", openApplyDate=" + openApplyDate + ", openApplyState=" + openApplyState + ", openApplyEmail="
				+ openApplyEmail + ", openApplyApproveDate=" + openApplyApproveDate + ", openRejectCode="
				+ openRejectCode + ", openMaxStudent=" + openMaxStudent + ", openGatherStartDate=" + openGatherStartDate
				+ "]";
	}
}

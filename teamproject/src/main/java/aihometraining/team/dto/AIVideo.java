package aihometraining.team.dto;

import java.util.List;

public class AIVideo {
	
	private String fileIdx;
	private String memberEmail;
	private String AIVideoRegDate;
	private String memberUpdateEmail;
	private String AIVideoUpdateDate;
	private String AIVideoTitle;
	
	private List<FileDto> fileList;
	
	
	

	public String getFileIdx() {
		return fileIdx;
	}

	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getAIVideoRegDate() {
		return AIVideoRegDate;
	}

	public void setAIVideoRegDate(String aIVideoRegDate) {
		AIVideoRegDate = aIVideoRegDate;
	}

	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}

	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}

	public String getAIVideoUpdateDate() {
		return AIVideoUpdateDate;
	}

	public void setAIVideoUpdateDate(String aIVideoUpdateDate) {
		AIVideoUpdateDate = aIVideoUpdateDate;
	}

	public String getAIVideoTitle() {
		return AIVideoTitle;
	}

	public void setAIVideoTitle(String aIVideoTitle) {
		AIVideoTitle = aIVideoTitle;
	}

	public List<FileDto> getFileList() {
		return fileList;
	}

	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AIVideo [fileIdx=");
		builder.append(fileIdx);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", AIVideoRegDate=");
		builder.append(AIVideoRegDate);
		builder.append(", memberUpdateEmail=");
		builder.append(memberUpdateEmail);
		builder.append(", AIVideoUpdateDate=");
		builder.append(AIVideoUpdateDate);
		builder.append(", AIVideoTitle=");
		builder.append(AIVideoTitle);
		builder.append(", fileList=");
		builder.append(fileList);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	

}

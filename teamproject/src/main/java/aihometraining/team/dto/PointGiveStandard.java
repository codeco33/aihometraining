package aihometraining.team.dto;

public class PointGiveStandard {
	/*
	 * pointGiveStandardCode
	 * pointGiveStandardNote
	 * pointGiveStandardPrice
	 * */
	private String pointGiveStandardCode;
	private String pointGiveStandardNote;
	private String pointGiveStandardPrice;
	
	public String getPointGiveStandardCode() {
		return pointGiveStandardCode;
	}
	public void setPointGiveStandardCode(String pointGiveStandardCode) {
		this.pointGiveStandardCode = pointGiveStandardCode;
	}
	public String getPointGiveStandardNote() {
		return pointGiveStandardNote;
	}
	public void setPointGiveStandardNote(String pointGiveStandardNote) {
		this.pointGiveStandardNote = pointGiveStandardNote;
	}
	public String getPointGiveStandardPrice() {
		return pointGiveStandardPrice;
	}
	public void setPointGiveStandardPrice(String pointGiveStandardPrice) {
		this.pointGiveStandardPrice = pointGiveStandardPrice;
	}
	
	@Override
	public String toString() {
		return "PointGiveStandard [pointGiveStandardCode=" + pointGiveStandardCode + ", pointGiveStandardNote="
				+ pointGiveStandardNote + ", pointGiveStandardPrice=" + pointGiveStandardPrice + "]";
	}
	
}

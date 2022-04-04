package aihometraining.team.dto;

public class ChallengeSetting {
	private String challengeSettingCode;
	private String challengeSettingUpdateDo;
	
	public String getChallengeSettingCode() {
		return challengeSettingCode;
	}
	public void setChallengeSettingCode(String challengeSettingCode) {
		this.challengeSettingCode = challengeSettingCode;
	}
	public String getChallengeSettingUpdateDo() {
		return challengeSettingUpdateDo;
	}
	public void setChallengeSettingUpdateDo(String challengeSettingUpdateDo) {
		this.challengeSettingUpdateDo = challengeSettingUpdateDo;
	}
	
	@Override
	public String toString() {
		return "ChallengeSetting [challengeSettingCode=" + challengeSettingCode + ", challengeSettingUpdateDo="
				+ challengeSettingUpdateDo + "]";
	}
	
	
}

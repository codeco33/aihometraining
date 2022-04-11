package aihometraining.team.dto;

	public class WorkoutGoalPlan {
		
		/*
		 *   workoutGoalPlanCode 
		 * , memberEmail 
		 * , workoutGoalCode 
		 * , workoutGoalPlanStartDate 
		 * , workoutGoalPlanFinalDate 
		 * , workoutGoalPlanContent
		 * , workoutGoalPlanUpdateEmail 
		 * , workoutGoalPlanFinalUpdateTime 
		 * , fileIdx 
		 * , AIWorkoutPerformanceCount 
		 * , AIWorkoutPerformanceGoal 
		 * , workoutGoalPlanAchieveState 
		 * , workoutGoalPlanCategoryCode
		 * 
		 */
		
		private String workoutGoalPlanCode;
		private String memberEmail;
		private String workoutGoalCode;
		private String workoutGoalPlanStartDate;
		private String workoutGoalPlanFinalDate;
		private String workoutGoalPlanContent;
		private String workoutGoalPlanUpdateEmail;
		private String workoutGoalPlanFinalUpdateTime;
		private String fileIdx;
		private String AIWorkoutPerformanceCount;
		private String AIWorkoutPerformanceGoal;
		private String workoutGoalPlanAchieveState;
		private String workoutGoalPlanCategoryCode;
		
		
		private FileDto fileDto;
		
		
		public FileDto getFileDto() {
			return fileDto;
		}
		public void setFileDto(FileDto fileDto) {
			this.fileDto = fileDto;
		}
		public String getWorkoutGoalPlanCode() {
			return workoutGoalPlanCode;
		}
		public void setWorkoutGoalPlanCode(String workoutGoalPlanCode) {
			this.workoutGoalPlanCode = workoutGoalPlanCode;
		}
		public String getMemberEmail() {
			return memberEmail;
		}
		public void setMemberEmail(String memberEmail) {
			this.memberEmail = memberEmail;
		}
		public String getWorkoutGoalCode() {
			return workoutGoalCode;
		}
		public void setWorkoutGoalCode(String workoutGoalCode) {
			this.workoutGoalCode = workoutGoalCode;
		}
		public String getWorkoutGoalPlanStartDate() {
			return workoutGoalPlanStartDate;
		}
		public void setWorkoutGoalPlanStartDate(String workoutGoalPlanStartDate) {
			this.workoutGoalPlanStartDate = workoutGoalPlanStartDate;
		}
		public String getWorkoutGoalPlanFinalDate() {
			return workoutGoalPlanFinalDate;
		}
		public void setWorkoutGoalPlanFinalDate(String workoutGoalPlanFinalDate) {
			this.workoutGoalPlanFinalDate = workoutGoalPlanFinalDate;
		}
		public String getWorkoutGoalPlanContent() {
			return workoutGoalPlanContent;
		}
		public void setWorkoutGoalPlanContent(String workoutGoalPlanContent) {
			this.workoutGoalPlanContent = workoutGoalPlanContent;
		}
		public String getWorkoutGoalPlanUpdateEmail() {
			return workoutGoalPlanUpdateEmail;
		}
		public void setWorkoutGoalPlanUpdateEmail(String workoutGoalPlanUpdateEmail) {
			this.workoutGoalPlanUpdateEmail = workoutGoalPlanUpdateEmail;
		}
		public String getWorkoutGoalPlanFinalUpdateTime() {
			return workoutGoalPlanFinalUpdateTime;
		}
		public void setWorkoutGoalPlanFinalUpdateTime(String workoutGoalPlanFinalUpdateTime) {
			this.workoutGoalPlanFinalUpdateTime = workoutGoalPlanFinalUpdateTime;
		}
		public String getFileIdx() {
			return fileIdx;
		}
		public void setFileIdx(String fileIdx) {
			this.fileIdx = fileIdx;
		}
		public String getAIWorkoutPerformanceCount() {
			return AIWorkoutPerformanceCount;
		}
		public void setAIWorkoutPerformanceCount(String aIWorkoutPerformanceCount) {
			AIWorkoutPerformanceCount = aIWorkoutPerformanceCount;
		}
		public String getAIWorkoutPerformanceGoal() {
			return AIWorkoutPerformanceGoal;
		}
		public void setAIWorkoutPerformanceGoal(String aIWorkoutPerformanceGoal) {
			AIWorkoutPerformanceGoal = aIWorkoutPerformanceGoal;
		}
		public String getWorkoutGoalPlanAchieveState() {
			return workoutGoalPlanAchieveState;
		}
		public void setWorkoutGoalPlanAchieveState(String workoutGoalPlanAchieveState) {
			this.workoutGoalPlanAchieveState = workoutGoalPlanAchieveState;
		}
		public String getWorkoutGoalPlanCategoryCode() {
			return workoutGoalPlanCategoryCode;
		}
		public void setWorkoutGoalPlanCategoryCode(String workoutGoalPlanCategoryCode) {
			this.workoutGoalPlanCategoryCode = workoutGoalPlanCategoryCode;
		}
		
		
		@Override
		public String toString() {
			return "WorkoutGoalPlan [workoutGoalPlanCode=" + workoutGoalPlanCode + ", memberEmail=" + memberEmail
					+ ", workoutGoalCode=" + workoutGoalCode + ", workoutGoalPlanStartDate=" + workoutGoalPlanStartDate
					+ ", workoutGoalPlanFinalDate=" + workoutGoalPlanFinalDate + ", workoutGoalPlanContent="
					+ workoutGoalPlanContent + ", workoutGoalPlanUpdateEmail=" + workoutGoalPlanUpdateEmail
					+ ", workoutGoalPlanFinalUpdateTime=" + workoutGoalPlanFinalUpdateTime + ", fileIdx=" + fileIdx
					+ ", AIWorkoutPerformanceCount=" + AIWorkoutPerformanceCount + ", AIWorkoutPerformanceGoal="
					+ AIWorkoutPerformanceGoal + ", workoutGoalPlanAchieveState=" + workoutGoalPlanAchieveState
					+ ", workoutGoalPlanCategoryCode=" + workoutGoalPlanCategoryCode + ", fileDto=" + fileDto + "]";
		}
		
		
		
		

		
		
	}
	


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
		 * , AIworkoutVideoCode 
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
		private String AIworkoutVideoCode;
		private String AIWorkoutPerformanceCount;
		private String AIWorkoutPerformanceGoal;
		private String workoutGoalPlanAchieveState;
		private String workoutGoalPlanCategoryCode;
		
		
		
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
		public String getAIworkoutVideoCode() {
			return AIworkoutVideoCode;
		}
		public void setAIworkoutVideoCode(String aIworkoutVideoCode) {
			AIworkoutVideoCode = aIworkoutVideoCode;
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
			StringBuilder builder = new StringBuilder();
			builder.append("workoutgoalplan [workoutGoalPlanCode=");
			builder.append(workoutGoalPlanCode);
			builder.append(", memberEmail=");
			builder.append(memberEmail);
			builder.append(", workoutGoalCode=");
			builder.append(workoutGoalCode);
			builder.append(", workoutGoalPlanStartDate=");
			builder.append(workoutGoalPlanStartDate);
			builder.append(", workoutGoalPlanFinalDate=");
			builder.append(workoutGoalPlanFinalDate);
			builder.append(", workoutGoalPlanContent=");
			builder.append(workoutGoalPlanContent);
			builder.append(", workoutGoalPlanUpdateEmail=");
			builder.append(workoutGoalPlanUpdateEmail);
			builder.append(", workoutGoalPlanFinalUpdateTime=");
			builder.append(workoutGoalPlanFinalUpdateTime);
			builder.append(", AIworkoutVideoCode=");
			builder.append(AIworkoutVideoCode);
			builder.append(", AIWorkoutPerformanceCount=");
			builder.append(AIWorkoutPerformanceCount);
			builder.append(", AIWorkoutPerformanceGoal=");
			builder.append(AIWorkoutPerformanceGoal);
			builder.append(", workoutGoalPlanAchieveState=");
			builder.append(workoutGoalPlanAchieveState);
			builder.append(", workoutGoalPlanCategoryCode=");
			builder.append(workoutGoalPlanCategoryCode);
			builder.append("]");
			return builder.toString();
		}
		
		

		
		
	}
	


package aihometraining.team.diet.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.diet.mapper.DietMapper;
import aihometraining.team.dto.DietBank;
import aihometraining.team.dto.DietOnemealConnection;
import aihometraining.team.dto.DietPlan;


@Service
@Transactional
public class DietService {
	
	
	private static final Logger log = LoggerFactory.getLogger(DietService.class);

	
	
	//DI 의존성 주입
	private DietMapper dietMapper;
	
	public DietService(DietMapper dietMapper) {
		this.dietMapper = dietMapper;
	}
	
	//신규 식단 은행 생성
	public int insertDietBankList2(String connectEClass, String insertEmail,String newCode) {
		int result = dietMapper.insertDietBankList2(connectEClass, insertEmail, newCode);
		return result;
	}
	
	//
	public List<DietBank> getDietBankListAdmin(){
		
		List<DietBank> dietBankList = dietMapper.getDietBankListAdmin();
		
		return dietBankList;
	}
	
	public int deleteDietBankList(String dietBankCode) {
		
		dietMapper.deleteDietOneMealConnectionAll(dietBankCode);
		dietMapper.deleteDietBankList(dietBankCode);
		
		
		return 0; 
	}
	
	public String selectDietBankListNewCode(String tableName, String columName){
	
		
		
		String result = dietMapper.selectDietBankListNewCode(tableName, columName);
		
		
		if(result == null) {
			result =  columName+"1";
		}
		
		
		

		
		return result;
	}
	
	public int insertDietOnemealConnection(DietOnemealConnection dietOnemealConnection) {
		
		int insertResult = dietMapper.insertDietOneMealConnection(dietOnemealConnection);
		
		
		return insertResult;
	}
	
	public List<List<HashMap<String, Object>>> selectBankDay(){
		
		
		//통합 list
		List<List<HashMap<String, Object>>> selectBankDay = new ArrayList<>();
			
		//list 0번 mealtime 3개
		List<HashMap<String, Object>> MealTimeList = new ArrayList();
			
		String[] timeName = {"아침식사","점심식사","저녁식사"};
			for(int i=0; i<timeName.length; i++) {
				HashMap<String, Object> mealMap = new HashMap<>();	
				mealMap.put("timeName", timeName[i]);
				
				MealTimeList.add(mealMap);
			}
			
			
		//list 1번 day 7개
		List<HashMap<String, Object>> MealDayList = new ArrayList();
		
		String[] DayName = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		for(int i=0; i<DayName.length; i++) {
			HashMap<String, Object> mealMap = new HashMap<>();	
			mealMap.put("DayName", DayName[i]);
			
			MealDayList.add(mealMap);
		}
		
		
		selectBankDay.add(MealTimeList);
		selectBankDay.add(MealDayList);	
			
		
		return selectBankDay;
	}	
	
	
	public int deleteDietOneMealConnection(String dietOneMealConnectionCode) {
		
		int result = dietMapper.deleteDietOneMealConnection(dietOneMealConnectionCode);
		
		return result;  
	}
	
	
	public int updateDietBank(DietOnemealConnection dietOnemealConnection) {
		
		//id001@email.com 관리자 페이지 업데이트로 일단 정해놓기, session값 받게 되면 변경
		
		dietOnemealConnection.setMemberEmail("id001@email.com");
		
		
		int result = dietMapper.updateDietBank(dietOnemealConnection);
		
		return result;
	}
		
	
	//User DietPlan 추가버튼 눌렀을 때 insert
	public int insertUserDietPlan(DietPlan dietplan) {
		
		int result = dietMapper.insertUserDietPlan(dietplan);
		
		return result;
	}
	
	//UserDietPlan 페이지 select
	public List<HashMap<String, Object>> selectUserDietPlan(DietPlan dietplan){
		
		List<HashMap<String, Object>> DietPlanList = dietMapper.selectUserDietPlan(dietplan);
		
		return DietPlanList;
	}
	
	//UserDietPlan 에서 삭제
	public int deleteUserDietPlan(DietPlan dietplan) {
		int deleteReuslt = dietMapper.deleteUserDietPlan(dietplan);
		return deleteReuslt;
	}
	
	//UserDietPlanUpdate
	public int updateUserDietPlan(DietPlan dietplan) {
		int updateResult = dietMapper.updateUserDietPlan(dietplan);
		return updateResult;
	}
	
	//total 영양소 계산기
	public HashMap<String, Object> UserdietPlanList(List<HashMap<String, Object>> UserdietPlanList){

		
		//총 계획 영양소들
		Integer nutrientsAPIKcal = 0;
		Integer nutrientsAPICarbo = 0;
		Integer nutrientsAPIPro = 0;
		Integer nutrientsAPIFat = 0;
		Integer nutrientsAPINatr = 0;
		
		for(int i=0; i<UserdietPlanList.size(); i++) {
			
			HashMap<String, Object> mealList = UserdietPlanList.get(i);
			
			nutrientsAPIKcal += (Integer)mealList.get("nutrientsAPIKcal");
			nutrientsAPICarbo += (Integer)mealList.get("nutrientsAPICarbo");
			nutrientsAPIPro += (Integer)mealList.get("nutrientsAPIPro");
			nutrientsAPIFat += (Integer)mealList.get("nutrientsAPIFat");
			nutrientsAPINatr += (Integer)mealList.get("nutrientsAPINatr");
		}
		
		HashMap<String, Object> planedNutrient = new HashMap<>();
		
		planedNutrient.put("nutrientsAPIKcal", nutrientsAPIKcal);
		planedNutrient.put("nutrientsAPICarbo", nutrientsAPICarbo);
		planedNutrient.put("nutrientsAPIPro", nutrientsAPIPro);
		planedNutrient.put("nutrientsAPIFat", nutrientsAPIFat);
		planedNutrient.put("nutrientsAPINatr", nutrientsAPINatr);
		
		//총 실행 영양소들
		nutrientsAPIKcal = 0;
		nutrientsAPICarbo = 0;
		nutrientsAPIPro = 0;
		nutrientsAPIFat = 0;
		nutrientsAPINatr = 0;
		
		for(int i=0; i<UserdietPlanList.size(); i++) {
			
			HashMap<String, Object> mealList = UserdietPlanList.get(i);
			
			if (mealList.get("dietPlanDoValue").equals(1)) {
				
				nutrientsAPIKcal += (Integer)mealList.get("nutrientsAPIKcal");
				nutrientsAPICarbo += (Integer)mealList.get("nutrientsAPICarbo");
				nutrientsAPIPro += (Integer)mealList.get("nutrientsAPIPro");
				nutrientsAPIFat += (Integer)mealList.get("nutrientsAPIFat");
				nutrientsAPINatr += (Integer)mealList.get("nutrientsAPINatr");
				
			}
		}
		
		planedNutrient.put("nutrientsAPIKcalDone", nutrientsAPIKcal);
		planedNutrient.put("nutrientsAPICarboDone", nutrientsAPICarbo);
		planedNutrient.put("nutrientsAPIProDone", nutrientsAPIPro);
		planedNutrient.put("nutrientsAPIFatDone", nutrientsAPIFat);
		planedNutrient.put("nutrientsAPINatrDone", nutrientsAPINatr);
		
		
		
		
		return planedNutrient;
	}

	
	//받아온 식단은행 내 식단에 넣기
	public int insertDietOneMealConnectionAll(DietBank dietBank) {
		
		//select 음식 조회
		String dietBankCode = dietBank.getDietBankCode();
		String pickerToday = dietBank.getDietBankUpdateDate();
		DietOnemealConnection dietOnemealConnection = new DietOnemealConnection();
		dietOnemealConnection.setDietBankCode(dietBankCode);
		
		List<HashMap<String, Object>> selectOneMealConn = dietMapper.selectDietOneMealConnectionByBankCode(dietOnemealConnection);
		
		
		
		for(int i=0; i<selectOneMealConn.size(); i++) {
			
		 String CheckGroup = (java.lang.String) selectOneMealConn.get(i).get("dietOneMealConnectionGroupNum");
		 
			String TimeValue = CheckGroup.substring(CheckGroup.lastIndexOf(" ")+1);
			String DayValue = CheckGroup.substring(0,CheckGroup.lastIndexOf(" "));
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			LocalDate now = LocalDate.parse(pickerToday, formatter);
			
			String dietPlanCode = selectDietBankListNewCode("dietplan", "dietPlanCode");
			String nutrientsAPICode = (java.lang.String) selectOneMealConn.get(i).get("nutrientsAPICode");
			String memberEmail = dietBank.getMemberEmail();
			String dietPlanDay = null;
			String dietPlanTime = TimeValue;
			
			
			
			DietPlan dietplan = new DietPlan();
			
			dietplan.setDietPlanCode(dietPlanCode);
			dietplan.setNutrientsAPICode(nutrientsAPICode);
			dietplan.setMemberEmail(memberEmail);
			dietplan.setDietPlanTime(dietPlanTime);
			
			if(DayValue.equals("월요일")) {
			}else if(DayValue.equals("화요일")) {
				now = now.plusDays(1);
			}else if(DayValue.equals("수요일")) {
				now = now.plusDays(2);
			}else if(DayValue.equals("목요일")) {
				now = now.plusDays(3);
			}else if(DayValue.equals("금요일")) {
				now = now.plusDays(4);
			}else if(DayValue.equals("토요일")) {
				now = now.plusDays(5);
			}else if(DayValue.equals("일요일")) {
				now = now.plusDays(6);
			}
			
			
			dietPlanDay = now.format(formatter);
			
			dietplan.setDietPlanDay(dietPlanDay);
			
			
			if(nutrientsAPICode != null) {
				log.info("최종 들어간값들!!:{}",dietplan);
				log.info("날짜!!:{}",DayValue);
				
				dietMapper.insertUserDietPlan(dietplan);
			}
		}
		
		return 0;
	}
	
}

package aihometraining.team.diet.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.diet.mapper.DietMapper;
import aihometraining.team.dto.DietBank;
import aihometraining.team.dto.DietOnemealConnection;
import aihometraining.team.dto.DietPlan;


@Service
@Transactional
public class DietService {
	
	private static final int List = 0;
	private static final int HashMap = 0;
	private static final int String = 0;
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
	
	
}

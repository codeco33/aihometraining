package aihometraining.team.diet.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.diet.mapper.DietMapper;
import aihometraining.team.dto.DietBank;


@Service
@Transactional
public class DietService {
	
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
		
		dietMapper.deleteDietBankList(dietBankCode);
		
		return 0; 
	}
	
}

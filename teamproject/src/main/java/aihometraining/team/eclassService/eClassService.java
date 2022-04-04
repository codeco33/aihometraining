package aihometraining.team.eclassService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassOpenApplyForm;
import aihometraining.team.mapper.CommonMapper;
import aihometraining.team.mapper.EClassMapper;

@Service
@Transactional
public class eClassService {
	//DI 의존성 주입 생성자 메소드
	private CommonMapper commonMapper;
	private EClassMapper eClassMapper;
	
	public eClassService(EClassMapper eClassMapper, CommonMapper commonMapper) {
		this.eClassMapper = eClassMapper;
		this.commonMapper = commonMapper;
	}
	
	//클래스 신청 폼 등록처리
	public int EClassOpenApplyFormInsert(EClassOpenApplyForm eClassOpenApplyForm) {
		
		String code = (commonMapper.getNewCode("eClassOpenAppleyCode", "openAppleyCode"));
		
		eClassOpenApplyForm.seteClassOpenAppleyCode(code);
		eClassOpenApplyForm.seteClassOpenApplyMemberEmail("id002@email.com");
		
		int result = eClassMapper.EClassOpenApplyFormInsert(eClassOpenApplyForm);
		
		return result;
	}
}

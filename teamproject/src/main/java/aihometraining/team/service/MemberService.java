package aihometraining.team.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.EClassOpenApplyForm;
import aihometraining.team.dto.LoginHistory;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.MemberLevel;
import aihometraining.team.dto.WishList;
import aihometraining.team.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {
	
	//DI 의존성 주입 생성자 메서드 주입 방식
	private MemberMapper memberMapper; 
	
	@Autowired
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	/**
	 * 로그인 이력조회
	 * @return Map<String, Object>
	 */
	public Map<String, Object> getLoginHistory(){
		
		List<LoginHistory> loginList = memberMapper.getLoginHistory1();
		List<Map<String, Object>> loginMapList = memberMapper.getLoginHistory2();

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("loginList", loginList);
		resultMap.put("loginMapList", loginMapList);
		
		return resultMap;
	}
	
	public int modifyMember(Member member) {
		return memberMapper.modifyMember(member);
	}
	
	public Member getMemberInfoByEmail(String memberEmail) {
		return memberMapper.getMemberInfoByEmail(memberEmail);
	}
	
	public List<Member> getMemberList(String searchKey, String searchValue){
		
		List<Member> memberList = memberMapper.getMemberList(searchKey, searchValue);
		
		return memberList;
	}
	//회원가입
	public int addMember(Member member) {
		
		member.setMemberLevelCode("levelCode003");
		
		int result = memberMapper.addMember(member);
		
		return result; 
	}

	public List<MemberLevel> getMemberLevelList() {
		
		List<MemberLevel> memberLevelList = memberMapper.getMemberLevelList();
		
		return memberLevelList;
	}
	//회원탈퇴
	public void removeMember(Member member) {
		//회원아이디
		String memberEmail = member.getMemberEmail();
		
		//공통사항 삭제 프로세스
		memberMapper.removeLoginHistory(memberEmail);
		
		memberMapper.removeMember(memberEmail);
		
	}
	
}

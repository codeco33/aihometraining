package aihometraining.team.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.LoginHistory;
import aihometraining.team.dto.Member;
import aihometraining.team.dto.MemberLevel;

@Mapper
public interface MemberMapper {
	// 로그인 이력조회1
	public List<LoginHistory> getLoginHistory1();

	// 로그인 이력조회2
	public List<Map<String, Object>> getLoginHistory2();
	
	// 회원의 로그인 이력을 삭제
	public int removeLoginHistory(String memberEmail);
	
	// 회원 삭제
	public int removeMember(String memberEmail);
	
	// 회원 수정
	public int modifyMember(Member member);
	
	// 이메일별 회원정보 조회
	public Member getMemberInfoByEmail(String memberEmail);
	
	// 회원 이메일 중복 체크
	public boolean isEmailCheck(String memberEmail);
	
	// 회원 등급 목록 조회
	public List<MemberLevel> getMemberLevelList();
	
	// 회원 전체 목록 조회
	public List<Member> getMemberList(String searchKey, String searchValue);
	
	// 회원 가입
	public int addMember(Member member);
}

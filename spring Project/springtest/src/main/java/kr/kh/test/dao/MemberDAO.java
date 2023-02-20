package kr.kh.test.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.test.vo.MemberVO;

public interface MemberDAO {

	int insertMember(@Param("member")MemberVO member);
	
}

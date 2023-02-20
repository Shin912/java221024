package kr.kh.test.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.test.dao.MemberDAO;
import kr.kh.test.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@Override
	public String selectMemberName(Integer num) {
		if(num == null)
			return null;
		return selectMemberName(num);
	}

	@Override
	public boolean signup(MemberVO member) {
		if(member == null)
			return false;
		String idRegex = "^[a-zA-Z][a-zA-Z0-9!@#$]{4,12}$";
		String pwRegex = "^[a-zA-Z0-9!@#$]{8,20}$";
		if(member.getMe_id() == null || 
				!Pattern.matches(idRegex, member.getMe_id()))
			return false;
		if(member.getMe_pw() == null || 
				!Pattern.matches(pwRegex, member.getMe_pw()))
			return false;
		if(member.getMe_email() == null)
			return false;
		if(member.getMe_birthday() == null)
			return false;
		String newPw = passwordEncoder.encode(member.getMe_pw());
		member.setMe_pw(newPw);
		return memberDao.insertMember(member) != 0;

	}
}

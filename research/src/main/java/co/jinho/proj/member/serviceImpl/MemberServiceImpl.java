package co.jinho.proj.member.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jinho.proj.member.map.MemberMap;
import co.jinho.proj.member.service.MemberService;
import co.jinho.proj.member.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMap map;
	
	@Override
	public MemberVO loginCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}

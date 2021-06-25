package co.jinho.proj.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.jinho.proj.member.service.MemberService;
import co.jinho.proj.member.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService memberDao;
	
	@RequestMapping("loginConfirm.do")
	private ModelAndView loginConfirm(MemberVO vo, HttpSession session, ModelAndView mv) {
		vo = memberDao.loginCheck(vo);
		System.out.println(vo);
		if(vo.getName() != null) {
			session.setAttribute("email", vo.getEmail());
			mv.addObject("message","님 환영합니다.");
		}else {
			mv.addObject("message","꺼져 회원가입하던지");
		}
		mv.setViewName("rediret:home");
		return mv;

	}
}

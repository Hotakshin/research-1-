package co.jinho.proj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//컨트롤러가 동작하기전에
		HttpSession session = request.getSession(false);
		if(session != null) {
			String id = (String) session.getAttribute("id");
			if(id !=null) {
				return true;
			}
		}
		System.out.println("로긴안되뮤");
		response.sendRedirect(request.getContextPath()+"/login.do");
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//컨트롤러가 동작이 끝나면
		System.out.println("컨트롤 동작후 - preHandle");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//뷰페이지까지 끝난 다음에
		System.out.println("뷰 페이지 동작후 - preHandle");
	}

}

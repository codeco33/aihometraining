package aihometraining.team.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		String sessionEmail 	= (String) session.getAttribute("SEMAIL");
		
		if(sessionEmail == null) {
			response.sendRedirect("/admin/login");
			return false;
		}
		
		return true;
	}
}

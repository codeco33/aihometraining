package aihometraining.team.interceptor;

import java.util.ArrayList;
import java.util.List;

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
		String requestURI = request.getRequestURI();
		
		String sessionEmail 	= (String) session.getAttribute("SEMAIL");
		
		//인증한 일반 회원은 여기 못 들어간다.
		List<String> authUser = new ArrayList<String>();
		authUser.add("/admin/memberList");
		authUser.add("/admin/memberLevelList");
		authUser.add("/admin/loginHistory");
		authUser.add("/주소");
		authUser.add("/주소");
		authUser.add("/주소");
		authUser.add("/주소");
		
		//미인증 회원은 여기 못 들어간다.
		List<String> user = new ArrayList<String>();
		user.add("/admin/memberList");
		user.add("/mypage");
		user.add("/주소");
		user.add("/주소");
		user.add("/주소");
		user.add("/주소");
		user.add("/주소");
		
		// 로그인 안했을 시
		if(sessionEmail == null) {
			response.sendRedirect("/login");
			return false;
		}else {
			String sessionLevelCode = (String) session.getAttribute("SLEVEL");
			
			if(sessionLevelCode != null && "levelCode002".equals(sessionLevelCode)) {
				if(authUser.contains(requestURI)) {
					response.sendRedirect("/");
					return false;
				}
				
				if(requestURI.indexOf("/admin") > -1) {					
					response.sendRedirect("/");
					return false;
				}
				
			}else if(sessionLevelCode != null && "levelCode003".equals(sessionLevelCode)) {
				if(user.contains(requestURI)) {
					response.sendRedirect("/");
					return false;
				}
				
				
				if(requestURI.indexOf("/admin") > -1) {					
					response.sendRedirect("/");
					return false;
				}
				if(requestURI.indexOf("/mypage") > -1) {					
					response.sendRedirect("/");
					return false;
				}
				
			}
		}
		
		return true;
	}
}

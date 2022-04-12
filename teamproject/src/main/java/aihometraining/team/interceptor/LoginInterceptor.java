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
		
		//인증한 일반 회원은 이 주소로 못 들어가도록 설정
		List<String> authUser = new ArrayList<String>();
		authUser.add("/admin/memberList");
		authUser.add("/admin/memberLevelList");
		authUser.add("/admin/loginHistory");
		authUser.add("/주소");
		authUser.add("/주소");
		authUser.add("/주소");
		authUser.add("/주소");
		
		//미인증 회원은 이 주소로 못 들어가도록 설정
		List<String> user = new ArrayList<String>();
		user.add("/admin/memberList");
		user.add("/mypage");
		user.add("/주소");
		user.add("/주소");
		user.add("/주소");
		user.add("/주소");
		user.add("/주소");
		
		// 로그인 안하면 로그인 페이지로 이동
		if(sessionEmail == null) {
			response.sendRedirect("/login");
			return false;
		// 로그인 했을 때 로그인 한 회원 권한에 따라 주소에 못 들어가도록 설정
		}else {
			String sessionLevelCode = (String) session.getAttribute("SLEVEL");
			
			// 이메일 인증을 한 일반 회원의 경우 위에 선언한 주소로 못 들어간다.
			if(sessionLevelCode != null && "levelCode002".equals(sessionLevelCode)) {
				if(authUser.contains(requestURI)) {
					response.sendRedirect("/");
					return false;
				}
			// 이메일 인증을 한 일반 회원의 경우 /admin의 주소는 못 들어간다.
				if(requestURI.indexOf("/admin") > -1) {					
					response.sendRedirect("/");
					return false;
				}
			// 이메일 미인증 회원의 경우 위에 선언한 주소로 못 들어간다.
			}else if(sessionLevelCode != null && "levelCode003".equals(sessionLevelCode)) {
				if(user.contains(requestURI)) {
					response.sendRedirect("/");
					return false;
				}
				
				//이메일 미인증 회원의 경우 /admin의 주소는 못 들어간다.
				if(requestURI.indexOf("/admin") > -1) {					
					response.sendRedirect("/");
					return false;
				}
				//이메일 미인증 회원의 경우 /mypage의 주소는 못 들어간다.
				if(requestURI.indexOf("/mypage") > -1) {					
					response.sendRedirect("/");
					return false;
				}
				
			}
		}
		
		return true;
	}
}

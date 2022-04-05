package aihometraining.team.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import aihometraining.team.interceptor.CommonInterceptor;
import aihometraining.team.interceptor.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	private CommonInterceptor commonInterceptor;
	private LoginInterceptor loginInterceptor; 
	
	public WebConfig(CommonInterceptor commonInterceptor, LoginInterceptor loginInterceptor) {
		this.commonInterceptor = commonInterceptor;
		this.loginInterceptor = loginInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/asset/**")
				.excludePathPatterns("/assets/**")
				.excludePathPatterns("/Doc/**")
				.excludePathPatterns("/form/**")
				.excludePathPatterns("/fullcalendar.ico")
				.excludePathPatterns("/todolist/**");
		
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/asset/**")
				.excludePathPatterns("/assets/**")
				.excludePathPatterns("/Doc/**")
				.excludePathPatterns("/form/**")
				.excludePathPatterns("/fullcalendar.ico")
				.excludePathPatterns("/todolist/**")
				.excludePathPatterns("/")
				.excludePathPatterns("/member/addMember")
				.excludePathPatterns("/member/login");
		
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}

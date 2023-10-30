package com.example.demo.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.boot.devtools.restart.FailureHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer.FrameOptionsConfig;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.example.demo.service.UsersService;
import com.example.demo.vo.UsersVO;

import jakarta.annotation.security.PermitAll;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.Setter;

@Configuration
@EnableWebSecurity //모든 요청의 URL이 스프링 시큐리티의 제어를 받도록 만드는 어노테이션 => 내부적으로 SpringSecurityFilterChain이 동작해 URL필터 적용
@Setter
public class SecurityConfig {
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private UserDetailsService userDetailService;
	
	@Autowired
	private UsersService us;
	
	//비밀번호 암호화처리
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public AuthenticationManager authenticationManager (AuthenticationConfiguration authenticationConfiguration)
		throws Exception{
	return authenticationConfiguration.getAuthenticationManager();
	}
	
	//스프링 시큐리티 기능 비활성화
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return web -> web.ignoring().requestMatchers("/css/**", "/js/**","/php/**","/images/**");
	}
	
	//특정 HTTP 요청에 대한 웹 기반 보안 구성
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception{
	
		http.httpBasic().disable();
			http
				.authorizeHttpRequests()
				.requestMatchers("/","/login", "/signUp", "/user/**").permitAll()
				.anyRequest().authenticated() //인가는 필요없지만 인증은 필요, 로그인페이지로 보냄
				.and()
				.formLogin() //폼 기반 로그인 설정
				.loginPage("/login")
				.loginProcessingUrl("/login").permitAll()
				.successHandler(successHandler())
				.defaultSuccessUrl("/")
				.failureUrl("/login")
				.usernameParameter("userId")
				.passwordParameter("userPwd")
				.and()
				.logout() //로그아웃 설정
				.logoutSuccessUrl("/login")
				.invalidateHttpSession(true) //로그아웃 후 세션 전체 삭제 여부
				.logoutSuccessUrl("/")
				.and()
	//			.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
				.csrf().disable(); //csrf 비활성화 (csrf공격 방지를 위해 활성화하는게 좋음)
				return http.getOrBuild();
	}
	
	@Bean
	public AuthenticationSuccessHandler successHandler() {
		return new CustomAuthenticationSuccessHandler();
	}
	
	private class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

		@Override
		public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
				Authentication authentication) throws IOException, ServletException {
			String userId = authentication.getName();
			UsersVO u = us.findByUserId(userId).get();
			u.setUserPwd(null); //보안 상의 이유로 세션에 유저의 비밀번호를 저장하지 않음.
			System.out.println(userId+"로그인 진행중 : "+ u );
			HttpSession session = request.getSession();
			session.setAttribute("u", u);
			response.sendRedirect("/");
			
		}
		
	}
	
	
	
}

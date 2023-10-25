package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer.FrameOptionsConfig;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.service.UsersService;

import jakarta.annotation.security.PermitAll;
import lombok.Setter;

@Configuration
@EnableWebSecurity //모든 요청의 URL이 스프링 시큐리티의 제어를 받도록 만드는 어노테이션 => 내부적으로 SpringSecurityFilterChain이 동작해 URL필터 적용
@Setter
public class SecurityConfig {
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private UserDetailsService userDetailService;
	
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
	
		return http
				.authorizeHttpRequests()
				.requestMatchers("/login", "signUp", "/user").permitAll()
				.anyRequest().authenticated() //인가는 필요없지만 인증은 필요
				.and()
				.formLogin() //폼 기반 로그인 설정
				.loginPage("/login")
				.defaultSuccessUrl("/")
				.and()
				.logout() //로그아웃 설정
				.logoutSuccessUrl("/login")
				.invalidateHttpSession(true) //로그아웃 후 세션 전체 삭제 여부
				.and()
				.csrf().disable() //csrf 비활성화 (csrf공격 방지를 위해 활성화하는게 좋음)
				.build();
	}
	
	
	
}

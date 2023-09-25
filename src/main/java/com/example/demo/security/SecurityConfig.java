package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity

public class SecurityConfig {
//	
//	//스프링 시큐리티 기능 비활성화
//	@Bean
//	public WebSecurityCustomizer configure() {
//		return(web) -> web.ignoring()
//				.requestMatchers("/static/**");
//	}
//	
//	//특정 HTTP 요청에 대한 웹 기반 보안 구성
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//		
//		http.authorizeHttpRequests().
//		requestMatchers("/","/**").permitAll().anyRequest().authenticated();
//		
//		http.formLogin().loginPage("/user/login").permitAll().defaultSuccessUrl("/main/main");
//		
//		http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
//		.invalidateHttpSession(true).logoutSuccessUrl("/")
//		.and()
//		.csrf().disable()
//		.build();
//		
//		http.httpBasic();
//		
//		return http.build();
//	}
//	
//	//인증 관리자 관련 설정
//	@Bean
//	public DaoAuthenticationProvider provider() throws Exception{
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		
//	//	provider.setUserDetailsService(userService);
//		provider.setPasswordEncoder(encoder());
//		
//		return provider;
//	}
//	
//	//패스워드 인코더로 사용할 빈 등록
//	@Bean
//	public BCryptPasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}
}

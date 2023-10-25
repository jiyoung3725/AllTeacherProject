package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repasitory.UsersRepository;
import com.example.demo.service.UsersService;
import com.example.demo.vo.UsersVO;

@Controller
public class UsersController {

	@Autowired
	public UsersService users;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private AuthenticationManager am;
	
	@GetMapping("/login")
	public String loginForm() {
		return "user/login";
	}
	
	@PostMapping("/login")
	public String login() {
		
		return "redirect:/";
	}
	
	@GetMapping("/signUp")
	public String signUpForm() {
		return "user/signUp";
	}
	
	@PostMapping("/signUp")
	public String signUp(UsersVO user) {
		System.out.println("컨트롤러 동작!");
		System.out.println("아이디이이이이!"+user.getUserId());
		System.out.println("이름므므므므므므!"+user.getUserName());
		System.out.println("비번!"+user.getUserPwd());
		System.out.println("전번!"+user.getUserPhone());
		System.out.println("주소!"+user.getUserAddr());
		System.out.println("메일!"+user.getUserMail());
		System.out.println("기관번호"+user.getCompanyTel());
		System.out.println("기관명!"+user.getCompanyName());
		System.out.println("유형!"+user.getUserType());
		System.out.println("생년!"+user.getUserBirth());
		user.setUserPwd(encoder.encode(user.getUserPwd()));
		users.insert(user);
		return "redirect:/";
	}
	
}

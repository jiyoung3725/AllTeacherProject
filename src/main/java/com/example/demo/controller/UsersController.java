package com.example.demo.controller;

import java.io.Console;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.repasitory.UsersRepository;
import com.example.demo.service.UsersService;
import com.example.demo.vo.UsersVO;

import jakarta.servlet.http.HttpServletRequest;

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
	public String login(String userId) {
		users.findByUserId(userId);
		
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
	
	@RequestMapping("/user/checked")
	@ResponseBody
	public HashMap<String, String> checkedId(@RequestParam("userId") String userId ) {
		System.out.println("왜 안동작하는데 왜왜오애ㅗ애ㅗ애ㅗ애왜!!!" + userId);
		HashMap<String, String> map = new HashMap<>();
		
//		if(userId) {
//			map.put("msg", "사용할 수 없는 아이디입니다.");
//		}else {
//			map.put("msg", "사용할 수 있는 아이디입니다.");
//		}
		return map;
		
	}
	
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String list() {
		return "main/main";
	}
	
	@GetMapping("/incruit")
	public String incruit() {
		return "incruit/incruit";
	}
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/signUp")
	public String signUp() {
		return "user/signUp";
	}
	@GetMapping("/comunity")
	public String comunity() {
		return "comunity/comunity";
	}
	@GetMapping("/review")
	public String review() {
		return "review/review";
	}
	
}

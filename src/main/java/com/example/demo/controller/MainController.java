package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	

	@GetMapping("/comunity")
	public String comunity() {
		return "comunity/comunity";
	}
	@GetMapping("/review")
	public String review() {
		return "review/review";
	}
	

	
	
}

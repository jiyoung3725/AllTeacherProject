package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.B_categoryService;

import lombok.Setter;

@Controller
@Setter
public class B_categoryController {

	@Autowired
	private B_categoryService ctg;
	
	@GetMapping("/header")
	public void find() {
		
	}
}

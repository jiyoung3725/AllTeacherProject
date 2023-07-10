package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.UsersService;

import lombok.Setter;

@Controller
@Setter
public class UsersController {

	@Autowired
	private UsersService us;
}

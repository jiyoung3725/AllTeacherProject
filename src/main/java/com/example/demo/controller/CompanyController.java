package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.CompanyService;

import lombok.Setter;

@Controller
@Setter
public class CompanyController {

	@Autowired
	private CompanyService cs;
}

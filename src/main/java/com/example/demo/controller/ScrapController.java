package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.ScrapService;

import lombok.Setter;

@Controller
@Setter
public class ScrapController {

	@Autowired
	private ScrapService scrap;
}

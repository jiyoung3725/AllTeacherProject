package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.SupportService;

import lombok.Setter;

@Controller
@Setter
public class SupportController {

	@Autowired
	private SupportService spt;
}

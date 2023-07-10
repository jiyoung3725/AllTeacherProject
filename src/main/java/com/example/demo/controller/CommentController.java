package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.CommetService;

import lombok.Setter;

@Controller
@Setter
public class CommentController {

	@Autowired
	private CommetService cmt;
}

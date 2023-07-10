package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.B_categoryDAO;

import lombok.Setter;

@Service
@Setter
public class B_categoryService {

	@Autowired
	private B_categoryDAO dao;
}

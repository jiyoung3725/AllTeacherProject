package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;

import lombok.Setter;

@Service
@Setter
public class BoardService {

	@Autowired
	private BoardDAO dao;
}

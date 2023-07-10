package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ScrapDAO;

import lombok.Setter;

@Service
@Setter
public class ScrapService {

	@Autowired
	private ScrapDAO dao;
}

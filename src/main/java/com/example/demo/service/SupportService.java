package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SupportDAO;

import lombok.Setter;

@Service
@Setter
public class SupportService {

		@Autowired
		private SupportDAO dao;
}

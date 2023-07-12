package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.B_categoryDAO;
import com.example.demo.vo.B_categoryVO;

import lombok.Setter;

@Service
@Setter
public class B_categoryService {

	@Autowired
	private B_categoryDAO dao;
	
	public List<B_categoryVO> findAll(){
		return dao.findAll();
	}
	
	public B_categoryVO save(B_categoryVO c) {
		return dao.save(c);
	}
	public B_categoryVO getOne(int categoryNo) {
		return dao.getOne(categoryNo);
	}
	
	public void deleteById(int categoryNo) {
		dao.deleteById(categoryNo);
	}
}

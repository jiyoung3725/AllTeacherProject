package com.example.demo.service;

import java.util.List; 
import java.util.Optional;

import com.example.demo.vo.UsersVO;

public interface UsersService {
	
	//회원가입
	
	public void insert(UsersVO u);
	
	//회원목록 조회
	public List<UsersVO> findAll();
	
	//아이디로 회원 찾기
	public Optional<UsersVO> findByUserId(String userId);
	
	//이메일로 회원 찾기
	public Optional<UsersVO> findByUserMail(String userMail);
	
	//전화번호로 회원 찾기
	public Optional<UsersVO> findByUserPhone(String userPhone);

}

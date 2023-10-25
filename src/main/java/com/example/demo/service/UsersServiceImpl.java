package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repasitory.UsersRepository;
import com.example.demo.vo.UsersVO;

import lombok.Setter;

@Service
@Setter
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository ur;



	@Override
	public List<UsersVO> findAll() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public Optional<UsersVO> findByUserId(String userId) {
		// TODO Auto-generated method stub
		return ur.findByUserId(userId);
	}

	@Override
	public Optional<UsersVO> findByUserMail(String userMail) {
		// TODO Auto-generated method stub
		return ur.findByUserMail(userMail);
	}

	@Override
	public Optional<UsersVO> findByUserPhone(String userPhone) {
		// TODO Auto-generated method stub
		return ur.findByUserPhone(userPhone);
	}

	@Override
	public void insert(UsersVO u) {
		// TODO Auto-generated method stub
		ur.insert(u);
	}
	


}

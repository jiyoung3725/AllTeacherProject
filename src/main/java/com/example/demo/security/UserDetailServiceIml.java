package com.example.demo.security;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.repasitory.UsersRepository;
import com.example.demo.vo.UsersVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
public class UserDetailServiceIml implements UserDetailsService{
	
	@Autowired
	private UsersRepository users;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<UsersVO> userOptional = users.findByUserId(userId);
		UsersVO u = userOptional.orElseThrow();
		
		if(u==null) {
			throw new UsernameNotFoundException("사용자 없음");
		}
		
		return User.builder()
				.username(u.getUserId())
				.password(u.getUserPwd())
				.roles(u.getUserType()).build();
	}
	
	
}

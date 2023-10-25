package com.example.demo.repasitory;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.UsersVO;

import jakarta.transaction.Transactional;
@Repository
@Primary

public interface UsersRepository extends JpaRepository<UsersVO, Integer>{

	//회원가입
	@Transactional
	@Modifying
	@Query(value="insert into users(userNo, userId, userPwd, userPhone, userMail, userName, userAddr, userType, companyName, companyTel, userBirth) "
			+ "values(seq_userNo.nextVal,:#{#u.userId},:#{#u.userPwd},:#{#u.userPhone},:#{#u.userMail},:#{#u.userName}"
			+ ",:#{#u.userAddr},:#{#u.userType},:#{#u.companyName},:#{#u.companyTel},:#{#u.userBirth})", nativeQuery = true)
	public void insert(UsersVO u);	
	
	//회원 목록 조회
	public List<UsersVO> findAll();
	
	//아이디 회원 조회
	public Optional<UsersVO> findByUserId(String userId);
	
	//이메일 회원 조회
	public Optional<UsersVO> findByUserMail(String userMail);
	
	//번호로 회원 조회
	public Optional<UsersVO> findByUserPhone(String userPhone);
	
}

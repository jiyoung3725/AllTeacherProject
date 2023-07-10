package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.UserVO;
@Repository
public interface UsersDAO extends JpaRepository<UserVO, Integer> {

}

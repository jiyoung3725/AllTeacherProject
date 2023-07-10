package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.B_categoryVO;
@Repository
public interface B_categoryDAO extends JpaRepository<B_categoryVO, Integer> {
}

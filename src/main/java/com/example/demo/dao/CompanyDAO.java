package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.CompanyVO;
@Repository

public interface CompanyDAO extends JpaRepository<CompanyVO, Integer> {

}

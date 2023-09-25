package com.example.demo.repasitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.UsersVO;
@Repository
public interface UsersRepository extends JpaRepository<UsersVO, Integer>{

	//@Query("select b from bookVO order by b.bookname")
	//public List<UsersVO> selectAll();
}

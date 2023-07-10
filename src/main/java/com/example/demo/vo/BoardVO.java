package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "board")
public class BoardVO {
	@Id
	private int boardNo;
	private int categoryNo;
	private int userNo;
	private String b_title;
	private String b_content;
	private Date b_update;
}

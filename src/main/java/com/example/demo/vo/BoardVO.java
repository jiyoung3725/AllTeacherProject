package com.example.demo.vo;

import java.util.Date;

import lombok.Data;
@Data
public class BoardVO {
	private int boardNo;
	private int categoryNo;
	private int userNo;
	private String b_title;
	private String b_content;
	private Date b_update;
}

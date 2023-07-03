package com.example.demo.vo;

import java.util.Date;

import lombok.Data;
@Data
public class CommentVO {
	private int boardNo;
	private int userNo;
	private String comment;
	private Date commentUpdate;
}

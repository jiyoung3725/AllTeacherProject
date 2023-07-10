package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "comment")
public class CommentVO {
	@Id
	private int boardNo;
	private int userNo;
	private String comment;
	private Date commentUpdate;
}

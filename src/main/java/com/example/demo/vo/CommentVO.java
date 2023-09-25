package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="comment")
@Entity

public class CommentVO {
	@Id
	private int comment_no;
	private int comunity_no;
	private String comment_content;
	private Date comment_update;

}

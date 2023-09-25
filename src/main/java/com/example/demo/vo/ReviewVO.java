package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="review")
public class ReviewVO {

	@Id
	private int review_no;
	private int user_no;
	private Date review_update;
	private int review_score;
	private String task;
	private String boss;
	private String relation;
	private String salary;
	private String etc;
}

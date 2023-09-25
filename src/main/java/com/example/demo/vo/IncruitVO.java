package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="incruit")

public class IncruitVO {

	@Id
	private int incruit_no;
	private int user_no;
	private String incruit_title;
	private String incruit_content;
	private String incruit_position;
	private Date incruit_update;
	private Date incruit_deadline;
}

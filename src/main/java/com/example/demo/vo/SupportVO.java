package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "support")
public class SupportVO {
	@Id
	private int supportNo;
	private int userNo;
	private int c_no;
	private Date supportDate;
}

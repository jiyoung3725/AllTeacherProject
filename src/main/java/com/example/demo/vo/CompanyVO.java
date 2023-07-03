package com.example.demo.vo;


import java.util.Date;

import lombok.Data;

@Data
public class CompanyVO {
	private int c_no;
	private String c_name;
	private String c_addr;
	private String c_option;
	private int c_salary;
	private Date c_closingDate;
	private String c_tel;
	private String c_email;
	private int c_careear;
	private String c_edu;
	private String c_duty;
	private String c_kind;
	private Date c_update;
}

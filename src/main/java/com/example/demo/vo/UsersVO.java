package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class UsersVO {
	@Id
	private int user_no;
	private String user_id;
	private String user_pwd;
	private String user_phone;
	private String user_mail;
	private String user_name;
	private String user_address;
	private String user_type;
	private String company_name;
	private String company_tel;
}
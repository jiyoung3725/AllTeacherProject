package com.example.demo.vo;

import java.util.Date;

import lombok.Data;
@Data
public class UserVO {
	private int userNo;
	private String id;
	private String pwd;
	private String userName;
	private String birth;
	private String email;
	private String phone;
	private Date regDate;
	private int infoStorageDate;
}

package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class UserVO {
	@Id
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

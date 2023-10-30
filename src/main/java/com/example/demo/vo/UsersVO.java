package com.example.demo.vo;



import java.sql.Date;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UsersVO {
	@Id
	private int userNo;
	
	private String userId;
	
	private String userPwd;
	
	private String userPhone;
	
	private String userMail;
	
	private String userName;
	
	private String userAddr;
	
	private String userType;
	
	private String companyName;
	
	private String companyTel;
	
	private Date userBirth;
	
	
}
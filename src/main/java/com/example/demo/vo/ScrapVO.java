package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "scrap")
public class ScrapVO {
	@Id
	private int scrapNo;
	private int userNo;
	private int c_no;
	private Date scrapDate;
}

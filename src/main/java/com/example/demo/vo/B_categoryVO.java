package com.example.demo.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "b_category")
public class B_categoryVO {
	@Id
	private int categoryNo;
	private String categoryName;

}

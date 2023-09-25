package com.example.demo.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="liked")
public class LikedVO {

	@Id
	private int liked_no;
	private int incruit_no;
	private int liked_count;
}

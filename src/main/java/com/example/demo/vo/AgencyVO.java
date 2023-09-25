package com.example.demo.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="agency")
public class AgencyVO {

	@Id
	private int agency_no;
	private String agency_name;
	private String agency_address;
	private int agency_score;
}

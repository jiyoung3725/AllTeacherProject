package com.example.demo.vo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Community")
public class ComunityVO {

	@Id
	private int community_no;
	private int user_no;
	private Date community_update;
	private String community_title;
	private String community_content;
	private int community_count;
	private String community_file;
	private String category_name;
}

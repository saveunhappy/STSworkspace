package com.mypack.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class User {
	private Integer id;
	private String name;
	private String className;
	private String profession;
	private String department;
	private String fujian;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rudang;
	
	
}

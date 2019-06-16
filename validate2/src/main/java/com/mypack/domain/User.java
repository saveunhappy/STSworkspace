package com.mypack.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class User {
	private Long id;
	private String name;
	private String tel;
	private String email;
	private String identify;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	private String password;
	
	
}

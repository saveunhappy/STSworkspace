package com.mypack.domain;

import java.util.Date;

import lombok.Data;
@Data
public class User {
	private Long id;
	private String name;
	private String tel;
	private String email;
	private String identify;
	private Date birth;
	
	
}

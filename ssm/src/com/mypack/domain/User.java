package com.mypack.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data

public class User {
	private Long id;
	private String name;
	private Integer age;
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public User() {
		
	}

	
	
}

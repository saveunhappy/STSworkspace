package com.mypack.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter@Setter
@Entity
@Table(name="JPA_PERSONS")
@ToString
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String lastName;
	
	private String email;
	
	private Date birth;
}

package com.mypack._05many2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Teacher {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	@ManyToMany
	private List<Student> students;
}

package com.mypack._04many2one2many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	@ManyToOne
	private Department department;
	
}

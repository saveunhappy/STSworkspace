package com.mypack._02many2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Department {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
}

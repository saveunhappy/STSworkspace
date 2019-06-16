package com.mypack._03one2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Department {
	@Id
	@GeneratedValue
	private Long id;
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	private String name;
	@OneToMany
	private List<Employee> employees;
}

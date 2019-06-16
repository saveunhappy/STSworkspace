package com.mypack.domain;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Cacheable
@Entity
@Getter@Setter
public class Department {
	@Id
	@GeneratedValue
	private Integer id;
	private String departmentName;
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
}

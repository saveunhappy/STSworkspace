package com.mypack._04many2one2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Department {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	//一般的外键保存在many方，这里加上了mapperdBy指定了对方来管理对应的类
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
}

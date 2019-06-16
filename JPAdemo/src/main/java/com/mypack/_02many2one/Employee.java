package com.mypack._02many2one;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	//设置不要积极的去查询关联的关系，不设置的话会用join直接连表查询的,夺标查询影响性能
	@ManyToOne(fetch=FetchType.LAZY)
	//指定外键列的名称
	@JoinColumn(name="dept_id")
	private Department department;
}

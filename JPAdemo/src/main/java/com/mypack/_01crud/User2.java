package com.mypack._01crud;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//创建一个实体类
@Getter@Setter
@Entity
@Table
@ToString
public class User2 {
	@Id
	@Column(name = "id")
	//使用数据库中默认方法生成主键
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer age;
	//时间类型
	@Temporal(TemporalType.DATE)
	private Date hiredate;
}

package com.mypack._01crud;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
@Access(AccessType.PROPERTY)
public class User {
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
	//@Transient//不需要映射的属性
	//@Lob大数据类型的映射
	//private String sn;
	//对于decimal类型，precision指定总长度，scale指定小数位数
	//@Column(precision=20,scale=100)
	//private BigDecimal price;
//  @OrderBy("name DESC")排序
  //@OrderColumn(name = "seq")list插入元素会多一个seq列，里面记录了添加的顺序
}

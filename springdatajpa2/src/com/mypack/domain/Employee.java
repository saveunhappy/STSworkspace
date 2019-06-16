package com.mypack.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String lastName;
	private String email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	@JoinColumn(name="dept_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Department department;
	@Override
	public String toString() {
		return "Emoloyee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", birth=" + birth
				+ ", createTime=" + createTime + "]";
	}
}

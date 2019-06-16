package com.mypack._07extends;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Entity
//@DiscriminatorValue("1")
//@DiscriminatorColumn(name="type")
@Inheritance(strategy=InheritanceType.JOINED)
public class Product {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
}

package com.mypack._07extends;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Entity
//@DiscriminatorValue("3")
public class Book extends Product{
	private String ISBN;
}

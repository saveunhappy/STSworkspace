package com.mypack._07extends;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Entity
//@DiscriminatorValue("2")
public class Cloth extends Product{

	private String color;
}

package com.mypack._06component;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Embeddable
public class Address {
	private String province;
	
	private String city;
	
	private String street;
}

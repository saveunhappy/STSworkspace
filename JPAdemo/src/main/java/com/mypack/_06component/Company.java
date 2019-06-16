package com.mypack._06component;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Entity
public class Company {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Address address;
	@AttributeOverrides(

			{
				@AttributeOverride(name="province",column=@Column(name="reg_address")),
				@AttributeOverride(name="city",column=@Column(name="reg_city")),
				@AttributeOverride(name="street",column=@Column(name="reg_street"))
				
			}
		)
	private Address regAddress;
}

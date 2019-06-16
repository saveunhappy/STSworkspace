package com.mypack._08casecade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Entity
public class OrderBillItem {
	 @Id
	    @GeneratedValue
	    private Long id;
	    private String produceName;
}

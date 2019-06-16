package com.mypack._08casecade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Entity
public class OrderBill {
		@Id
	    @GeneratedValue
	    private Long id;
	    private String sn;
	    @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	    private List<OrderBillItem> items;
}

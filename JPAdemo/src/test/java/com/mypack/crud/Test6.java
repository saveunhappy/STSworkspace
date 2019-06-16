package com.mypack.crud;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.mypack._06component.Address;
import com.mypack._06component.Company;
import com.mypack.util.JPAUtil;



public class Test6 {
	 @Test
	    public void testSave(){
	        Company c = new Company();
	        c.setName("叩丁狼教育");

	        //营业地址
	        Address a1 = new Address();
	        a1.setProvince("广东");
	        a1.setCity("广州");
	        a1.setStreet("涌东路");

	        //注册地址
	        Address a2 = new Address();
	        a2.setProvince("四川");
	        a2.setCity("成都");
	        a2.setStreet("天府路");

	        c.setAddress(a1);
	        c.setRegAddress(a2);

	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        em.persist(c);
	        em.getTransaction().commit();
	        em.close();
	    }
}

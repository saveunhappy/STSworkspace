package com.mypack.crud;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.mypack._07extends.Book;
import com.mypack._07extends.Cloth;
import com.mypack._07extends.Product;
import com.mypack.util.JPAUtil;



public class Test7 {
	 @Before
	    public void testSave() {
	        Product p = new Product();
	        p.setName("p");


	        Book b = new Book();
	        b.setName("b");
	        b.setISBN("ISBN");

	        Cloth c = new Cloth();
	        c.setName("c");
	        c.setColor("red");

	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();

	        em.persist(p);
	        em.persist(b);
	        em.persist(c);


	        em.getTransaction().commit();
	        em.close();
	    }

	    @Test
	    public void testGet() {
	        EntityManager em = JPAUtil.getEntityManager();
	        Product book = em.find(Product.class, 2L);
	        System.out.println(book);
	        em.close();
	    }
}

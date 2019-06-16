package com.mypack.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.mypack._04many2one2many.Department;
import com.mypack._04many2one2many.Employee;
import com.mypack.util.JPAUtil;

public class Test4 {
	 @Before
	    public void testSave() {
	        Employee e1 = new Employee();
	        e1.setName("Neld");
	        Employee e2 = new Employee();
	        e2.setName("Lily");

	        Department d = new Department();
	        d.setName("研发部");

	        List<Employee> employees = new ArrayList<>();
	        employees.add(e1);
	        employees.add(e2);

	        d.setEmployees(employees);

	        e1.setDepartment(d);
	        e2.setDepartment(d);

	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        em.persist(d);
	        em.persist(e1);
	        em.persist(e2);
	        em.getTransaction().commit();
	        em.close();
	    }

	    @Test
	    public void testGet() {

	        EntityManager em = JPAUtil.getEntityManager();
	        Employee e = em.find(Employee.class, 1L);
	        Department d = e.getDepartment();
	        System.out.println(e);
	        System.out.println(d);
	        em.close();


	    }
}

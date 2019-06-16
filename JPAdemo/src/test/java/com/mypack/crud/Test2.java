package com.mypack.crud;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.mypack._02many2one.Department;
import com.mypack._02many2one.Employee;
import com.mypack.util.JPAUtil;

public class Test2 {
	@Before
	public void testsave() throws Exception {
		Employee e1 = new Employee();
		e1.setName("neld");
		Employee e2 = new Employee();
		e2.setName("will");
		Department d = new Department();
		d.setName("stef");
		e1.setDepartment(d);
		e2.setDepartment(d);
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();;
		em.persist(e1);
		em.persist(e2);
		em.persist(d);
		em.getTransaction().commit();
		em.close();
	}
	@Test
	public void testget() throws Exception {
		EntityManager em = JPAUtil.getEntityManager();
		Employee employee = em.find(Employee.class,1L);
		System.out.println(employee);
		Department department = employee.getDepartment();
		System.out.println(department);
		em.close();
		
	}
}

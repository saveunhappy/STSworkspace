package com.mypack.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.QueryHint;
import javax.sql.DataSource;

import org.hibernate.annotations.QueryHints;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.domain.Department;
import com.mypack.repository.DepartmentRepository;

public class Test1 {
	private ApplicationContext ctx= null;
	private DepartmentRepository departmentRepository;
	private EntityManagerFactory entityManagerFactory;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		departmentRepository = ctx.getBean(DepartmentRepository.class);
		entityManagerFactory = ctx.getBean(EntityManagerFactory.class);
	}
	
	@Test
	public void test() throws Exception {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testJpaSecondLevelCache() throws Exception {
		String jqpl = "FROM Department d";
		EntityManager manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(jqpl);
		List list = query.setHint(org.hibernate.ejb.QueryHints.HINT_CACHEABLE, true).getResultList();
		manager.close();
		
		 manager = entityManagerFactory.createEntityManager();
		 query = manager.createQuery(jqpl);
		 list = query.setHint(org.hibernate.ejb.QueryHints.HINT_CACHEABLE, true).getResultList();
		manager.close();
	}
	
	@Test
	public void testRepositorySecondlevelCaChe() throws Exception {
		List<Department> list = departmentRepository.getAll();
		 list = departmentRepository.getAll();
		
	}
}

package com.mypack.crud;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;

import com.mypack._01crud.User;
import com.mypack.util.JPAUtil;

public class Test1 {
	
	@Test
	public void testSave() throws Exception {
		User u = new User();
		u.setAge(17);
		u.setName("will");
		u.setHiredate(new Date());
		EntityManager em = JPAUtil.getEntityManager();
		//开启事物
		em.getTransaction().begin();
		//执行保存
		em.persist(u);
		//提交事物
		em.getTransaction().commit();
		//释放资源
		em.close();
		System.out.println(u);
	}
	@Test
	public void testdelete() throws Exception {
		
		EntityManager em = JPAUtil.getEntityManager();
		//开启事物
		em.getTransaction().begin();
		//执行保存
		User u = em.find(User.class, 1L);
		em.remove(u);
		
		//提交事物
		em.getTransaction().commit();
		//释放资源
		em.close();
	}
	@Test
	public void testupdate() throws Exception {
		User u = new User();
		u.setId(2L);
		u.setAge(100);
		u.setName("neld");
		u.setHiredate(new Date());
		EntityManager em = JPAUtil.getEntityManager();
		//开启事物
		em.getTransaction().begin();
		//执行保存
		em.merge(u);
		//提交事物
		em.getTransaction().commit();
		//释放资源
		em.close();
		System.out.println(u);
	}
	@Test
	public void testget() throws Exception {
		
		EntityManager em = JPAUtil.getEntityManager();
		//执行保存
		User u = em.find(User.class, 3L);
		//释放资源
		em.close();
		System.out.println(u);
	}
	@Test
	public void testListAll() throws Exception {
	
		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<User> createQuery = em.createQuery("select u from UserInfo u",User.class);
		List<User> resultList = createQuery.getResultList();
		for (User user : resultList) {
			
			System.out.println(user);
		}
	}
}

package com.mypack.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.filter.config.ConfigTools;
import com.mypack.domain.User;
import com.mypack.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {
	@Autowired
	private IUserService userService;
	
	@Test
	public void test() throws Exception {
		
		List<User> listAll = userService.listAll();
		for (User user : listAll) {
			System.out.println(user);
		}
	}
	@Test
	public void test1() throws Exception {
		String encrypt = ConfigTools.encrypt("root");
		System.out.println(encrypt);
	}
	@Test
	public void test2() throws Exception {
		User user = userService.getUserByUsername("410522199902134474");
		System.out.println(user);
	}
	@Test
	public void test3() throws Exception {
		User user = userService.checkLogin("666","13027595769");
		System.out.println(user);
	}
	@Test
	public void test4() throws Exception {
		String encode = MD5.encode("666");
		System.out.println(encode);
		
	}
	@Test
	public void test5() throws Exception {
		User user = userService.findPassword("1234561", "123456", "123456", "123456");
		System.out.println(user);
		
	}
	
	
	
}

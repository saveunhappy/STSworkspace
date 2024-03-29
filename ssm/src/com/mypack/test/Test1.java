package com.mypack.test;

import java.util.Arrays;
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
		new Thread(
			
			()-> {
				System.out.println("hello world");
			}
		).start();
	}
	
	@Test
	public void test3() throws Exception {
		User[] us = new User[] {new User("sss", 11),new User("ddd", 12)};
		Arrays.sort(us,

			(o1,o2)-> {
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		);
		System.out.println(Arrays.toString(us));
	}
}

package com.mypack.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mypack.domain.User;
import com.mypack.mapper.UserMapper;
import com.mypack.util.MybatisUtil;

public class Test1 {
	@Test
	public void Get() throws Exception {
		SqlSession session = MybatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.get(1L);
		System.out.println(user);
	}
	@Test
	public void save() throws Exception {
		SqlSession session = MybatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.save("ss", "dd");
		session.commit();
	}
	@Test
	public void delete() throws Exception {
		SqlSession session = MybatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.delete(1L);
		session.commit();
	}
	@Test
	public void update() throws Exception {
		User u = new User();
		u.setPassword("asd");
		u.setUsername("das");
		u.setId(2L);
		SqlSession session = MybatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.update(u);
		session.commit();
	}
	
	@Test
	public void ListAll() throws Exception {
		
		SqlSession session = MybatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> listAll = mapper.listAll();
		for (User user : listAll) {
			System.out.println(user);
		}
		session.commit();
	}
	
	
	
	
	}

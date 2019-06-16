package com.mypack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypack.domain.User;
import com.mypack.mapper.UserMapper;
import com.mypack.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;
	public void save(User u) {
		userMapper.save(u);
	}

	@Override
	public void delete(Long id) {
		userMapper.delete(id);
	}

	@Override
	public void update(User u) {
		userMapper.update(u);
	}

	@Override
	public User get(Long id) {
		return userMapper.get(id);
	}

	@Override
	public List<User> listAll() {
		return userMapper.listAll();
	}

	@Override
	public PageInfo<User> listAllStuByPage(int currentPage, int pageSize) {
	
		PageHelper.startPage(currentPage, pageSize);
		
		List<User> listAll = userMapper.listAll();
		
		PageInfo<User> pageInfo = new PageInfo<User>(listAll);
		return pageInfo;
	}

	

}

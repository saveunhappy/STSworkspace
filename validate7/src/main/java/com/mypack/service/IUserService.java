package com.mypack.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mypack.domain.User;

public interface IUserService {
	void save(User u);

	void delete(Long id);

	void update(User u);

	User get(Long id);

	List<User> listAll();

	User getUserByUsername(String username);
	
	User checkLogin(String username,String password);
	
	User findPassword(String username,String email,String identify,String telephoneNumber);

}

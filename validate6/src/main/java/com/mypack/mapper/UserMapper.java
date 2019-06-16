package com.mypack.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mypack.domain.User;

public interface UserMapper {
	void save(User u);
	
	void delete(Long id);
	
	void update(User u);
	
	User get(Long id);
	
	List<User> listAll();
	
	User getUserByUsername(String username);
	
	User checkLogin(@Param("password")String password,@Param("name")String username) ;
}

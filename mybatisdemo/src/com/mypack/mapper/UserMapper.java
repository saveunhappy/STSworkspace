package com.mypack.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mypack.domain.User;

public interface UserMapper {
	void save(@Param("username")String username,@Param("password")String password);
	void delete(Long id);
	void update(User u);
	User get(Long id);
	List<User> listAll();
}

package com.example.mybatis.service;

import java.util.List;

import com.example.mybatis.domain.Permission;

public interface IPermissionService {
	List<Permission> selectAll();
    void insert(Permission permission);
}

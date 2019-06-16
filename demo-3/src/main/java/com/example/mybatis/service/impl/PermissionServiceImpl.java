package com.example.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mybatis.domain.Permission;
import com.example.mybatis.mapper.PermissionMapper;
import com.example.mybatis.service.IPermissionService;
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {
	@Autowired
	private PermissionMapper mapper;
	@Override
	@Transactional(readOnly=true)
	public List<Permission> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public void insert(Permission permission) {
		mapper.insert(permission);
	}

}

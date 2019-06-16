package com.example.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mybatis.domain.Permission;
import com.example.mybatis.service.IPermissionService;

@Controller
@Transactional
public class PermissionController {
	
	@Autowired
	private IPermissionService service;
	@RequestMapping("/list")
	@ResponseBody
	@Transactional(readOnly=true)
	public List<Permission> list(){
		return service.selectAll();
	}
	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		service.insert(new Permission());
		return "保存成功1122";
	}
	
}

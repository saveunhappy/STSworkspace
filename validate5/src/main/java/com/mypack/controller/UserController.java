package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.mypack.domain.User;
import com.mypack.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	
	
	//查询列表
	@RequestMapping("/listall")
	public String list(Model model) {
		model.addAttribute("users",userService.listAll());
		return "/user/list";
		
	}
	
	//查询列表
	@RequestMapping("/list")
	public String listAll(Integer currentPage,Model model) {
	
		if (currentPage == null) {
			currentPage = 1;
		}
		PageInfo<User> pageInfo = userService.listAllStuByPage(currentPage, 5);
		if (pageInfo.getPageNum() == pageInfo.getFirstPage()) {
			pageInfo.setPrePage(1);
		}
		if (pageInfo.getPageNum() == pageInfo.getPages()) {
			pageInfo.setNextPage(pageInfo.getPages());
		}
		model.addAttribute("pageInfo", pageInfo);
		
		
		return "/user/list";
		
	}
	
	//进入编辑界面
	@RequestMapping("/input")
	public String input(Integer id,Model model) {
		
		if(id != null) {
			model.addAttribute("user", userService.get(id));
		}
		return "/user/input";
		
		
	}
	
	//保存或更新操作
	@RequestMapping("/saveOrUpdate")
	public String saveOrUpdate(User user) {
		if(user.getId()==null) {
			userService.save(user);
			
		}else {
			userService.update(user);
			
		}
		return "redirect:/list";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id) {
		if(id!=null) {
			userService.delete(id);
		}
		return "redirect:/list";
	}
	

	
}

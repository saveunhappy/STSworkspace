package com.mypack.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.domain.User;
import com.mypack.service.IUserService;
import com.mypack.test.MD5;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/login")
	public String login(User u,HttpSession session,Model model) {
		User user = userService.checkLogin(MD5.encode(u.getPassword()),u.getName() );
		System.out.println(user);
		if(user==null) {
			session.setAttribute("errorMsg", "账号或密码错误");
			return "redirect:/login.jsp";
		}
		session.setAttribute("USER_IN_SESSION", user);
		return "redirect:/list";
	}
	
	
	//查询列表
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("users",userService.listAll());
		return "/user/list";
		
	}
	
	//进入编辑界面
	@RequestMapping("/input")
	public String input(Long id,Model model) {
		
		if(id != null) {
			model.addAttribute("user", userService.get(id));
		}
		return "/user/input";
		
		
	}
	
	//保存或更新操作
	@RequestMapping("/saveOrUpdate")
	public String saveOrUpdate(User user) {
		if(user.getId()==null) {
			user.setPassword(MD5.encode(user.getPassword()));
			userService.save(user);
			return "forward:/login.jsp";
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
	
	@RequestMapping("/find")
	public String find(User u,Model model) {
		System.out.println("----------------");
		User user = userService.findPassword(u.getName(), u.getEmail(), u.getIdentify(), u.getTel());
		if(user==null) {
			return null;
		}
		model.addAttribute("user", user);
		
		return "redirect:/user/input";
	}
	
}

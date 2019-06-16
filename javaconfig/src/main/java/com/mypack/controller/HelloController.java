package com.mypack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("hello")
	public String hello(Model model) {
		model.addAttribute("msg","spring mvc config");
		return "hello";
	
	}
	
	@RequestMapping("input")
	@ResponseBody
	public String input(String value) {
		System.out.println(value);
		return "success";
	}
	
}

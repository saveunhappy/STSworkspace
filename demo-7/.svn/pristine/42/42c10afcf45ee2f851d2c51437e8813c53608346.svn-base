package com.example._01hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {
	@Autowired
	private ApplicationArguments applicationArguments;
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		System.out.println(applicationArguments.getNonOptionArgs());
		return "hello";
	}
}

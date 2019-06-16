package com.example._05freemaker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeMarkerController {
	@RequestMapping("/hello")
	public String helloPage(Model model) {
		int i = 1/0;
		model.addAttribute("name","jack");
		return "hello";
	}
}

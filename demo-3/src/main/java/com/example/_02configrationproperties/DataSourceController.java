package com.example._02configrationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataSourceController {
	@Autowired
	private MyDruidDataSource druid;
	
	@RequestMapping("/dataSource")
	@ResponseBody
	public String dataSource() {
		System.out.println("66666asd66");
		System.out.println(druid);
		return "dataSource";
	}
}

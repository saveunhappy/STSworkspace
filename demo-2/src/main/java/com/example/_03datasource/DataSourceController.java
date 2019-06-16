package com.example._03datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataSourceController {
	@Autowired
	private DataSource dataSource;
	@RequestMapping("/druidDataSource")
	@ResponseBody
	public String dataSourcePage() throws Exception{
		System.out.println(dataSource.getConnection());
		System.out.println(dataSource);
		return "hello dataSources";
	}
}

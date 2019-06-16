package com.example._06servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class TestListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
			System.out.println("初始化了");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("销毁了");
	}
	
}

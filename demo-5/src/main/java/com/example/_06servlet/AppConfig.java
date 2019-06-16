package com.example._06servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppConfig {
	@Bean
	public ServletRegistrationBean testServlet() {
		ServletRegistrationBean bean = new ServletRegistrationBean();
		bean.setServlet(new TestServlet());
		bean.addUrlMappings("/testServlet");
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean testFilter() {
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new TestFilter());
		bean.addUrlPatterns("/*");
		return bean;
	}
	@Bean
	public ServletListenerRegistrationBean<TestListener> testListener(){
		ServletListenerRegistrationBean<TestListener> bean = new ServletListenerRegistrationBean<>();
		bean.setListener(new TestListener());
		return bean;
	}
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(AppConfig.class, args);
	}
}	

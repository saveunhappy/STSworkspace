package com.mypack.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;


@Configuration
@ComponentScan
@EnableWebMvc//相当于引入了<mvc:annotation-driven />
public class WebAppConfig {
	@Bean
	public FreeMarkerConfigurer freemakerConfiguer() {
		FreeMarkerConfigurer cfg = new FreeMarkerConfigurer();
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateLoaderPath("/WEB-INF/views/");
		return cfg;
	}
	
	@Bean
	public FreeMarkerViewResolver freemakerViewResolver() {
		FreeMarkerViewResolver cfg = new FreeMarkerViewResolver();
		
		cfg.setExposeSessionAttributes(true);
		cfg.setSuffix(".ftl");
		cfg.setContentType("text/html;charset=UTF-8");
		return cfg;
	}
}

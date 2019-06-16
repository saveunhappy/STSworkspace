package com.mypack.controller;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//1.创建一个webapplicationcontext
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class);
		ctx.setServletContext(servletContext);
		//注册一个DispatcherServlet
		
		Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(ctx));
		dispatcher.addMapping("*.do");
		dispatcher.setLoadOnStartup(1);
		javax.servlet.FilterRegistration.Dynamic filter = servletContext.addFilter("characterEncoding", new CharacterEncodingFilter("UTF-8", true));
		filter.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "dispatcherServlet");
		
	}

}

package com.example._08interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor()).excludePathPatterns("/hello1").addPathPatterns("/*");
	}
	@Bean	
	public Myinterceptor myInterceptor() {
		return new Myinterceptor();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}

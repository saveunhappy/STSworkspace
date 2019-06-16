package com.example._02configrationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppConfig {
	@Bean
	@ConfigurationProperties("db")
	public MyDruidDataSource dataSource() {
		return new MyDruidDataSource();
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(AppConfig.class, args);
	}
}

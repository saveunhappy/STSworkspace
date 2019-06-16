package com.example._03datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConfig {
/*	@Bean
	@ConfigurationProperties("db")
	public DataSource dataSource() {
		DruidDataSource ds = new DruidDataSource();
		return ds;
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}

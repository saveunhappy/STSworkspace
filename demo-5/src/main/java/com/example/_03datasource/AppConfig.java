package com.example._03datasource;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;

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

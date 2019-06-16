package com.example._01hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
		
		//SpringApplication app = new SpringApplication(Demo2Application.class);
		//app.setBannerMode(Mode.OFF);
		//app.run(args);
		
		//new SpringApplicationBuilder(Demo2Application.class).bannerMode(Mode.OFF).run(args);
	}

}

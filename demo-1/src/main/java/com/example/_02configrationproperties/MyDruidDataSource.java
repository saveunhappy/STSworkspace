package com.example._02configrationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
/*@Component
@ConfigurationProperties(prefix="db")*/
public class MyDruidDataSource {
	private String username;
	private String password;
	private String url;
	private String driverClassName;
}

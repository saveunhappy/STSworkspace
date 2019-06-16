package cn.wolfcode.springboot._10conditional2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	@IfExist(DependencyBean.class)
	public SomeBean somebean() {
		return new SomeBean();
	}

	@Bean
	public DependencyBean db() {
		return new DependencyBean();
	}

}

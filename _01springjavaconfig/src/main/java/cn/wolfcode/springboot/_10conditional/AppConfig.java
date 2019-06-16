package cn.wolfcode.springboot._10conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	@Conditional(DependencyCondition.class) // 如果MyCondition中matchs方法针对当前的配置情况返回false，spring就不会实例化这个somebean了
	public SomeBean somebean() {
		return new SomeBean();
	}
	
	@Bean
	public DependencyBean db(){
		return new DependencyBean();
	}

}

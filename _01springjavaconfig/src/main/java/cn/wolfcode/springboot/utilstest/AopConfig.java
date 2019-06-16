package cn.wolfcode.springboot.utilstest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public IEmployeeService target() {
		return new EmployeeServiceImpl();
	}
	

}

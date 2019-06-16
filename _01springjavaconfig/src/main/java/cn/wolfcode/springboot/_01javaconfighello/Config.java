package cn.wolfcode.springboot._01javaconfighello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration标签，把一个类标记为spring的配置对象
 * @author stef
 * 
 * <bean id="" class="" name="" init-method="" destory-method="" scope="">
 * <property name="" value="" />
 * <property name="" ref="" />
 * </bean>
 *
 */
@Configuration
public class Config {

	@Bean
	public SomeBean somebean() {
		return new SomeBean();
	}

}

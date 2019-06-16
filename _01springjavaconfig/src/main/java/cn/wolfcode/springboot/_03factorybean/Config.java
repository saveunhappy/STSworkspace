package cn.wolfcode.springboot._03factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration标签，把一个类标记为spring的配置对象
 * @author stef
 * 
 *         <bean id="" class="" name="bean1" init-method="" destory-method=""
 *         scope= ""> <property name="" value="" /> <property name="" ref="" />
 *         </bean>
 *
 */
@Configuration
public class Config {

	/**
	 * 方法的名字==bean 的id
	 * 
	 * @return
	 */
	@Bean
	public SomeBean somebean() {
		SomeBean sb = new SomeBean();
		return sb;
	}

}

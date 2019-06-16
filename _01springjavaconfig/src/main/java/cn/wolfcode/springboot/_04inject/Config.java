package cn.wolfcode.springboot._04inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration标签，把一个类标记为spring的配置对象
 * @author stef
 * 
 *         property name="" value="123" property name="" value="${db.url}"
 *
 */
@Configuration
public class Config {

	@Bean
	public SomeBean somebean(OtherBean otherbean2) {
		SomeBean sb = new SomeBean();
		sb.setOtherBean(otherbean2);
		return sb;
	}

	@Bean
	public OtherBean otherbean() {
		return new OtherBean("ob1");
	}

	@Bean
	public OtherBean otherbean2() {
		return new OtherBean("ob2");
	}

}

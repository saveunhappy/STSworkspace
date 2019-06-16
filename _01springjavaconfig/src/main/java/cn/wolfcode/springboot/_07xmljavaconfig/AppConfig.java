package cn.wolfcode.springboot._07xmljavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:cn/wolfcode/springboot/_07xmljavaconfig/applicationContext.xml")
public class AppConfig {

	@Bean
	public SomeBean somebean(OtherBean otherBean) {
		SomeBean sb = new SomeBean();
		sb.setOtherBean(otherBean);
		return sb;
	}

}

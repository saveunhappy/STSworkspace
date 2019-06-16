package cn.wolfcode.springboot._09profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:cn/wolfcode/springboot/_09profile/db-dev.properties")
@Profile("dev")
public class DevConfig {

	@Bean
	public SomeBean somebean() {
		return new SomeBean();
	}
}

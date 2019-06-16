package cn.wolfcode.springboot._08valueinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @PropertySource 标签引入了需要加载的资源文件
 * @PropertySources引入多个资源文件
 * @author stef
 *
 */
@Configuration
@PropertySource("classpath:cn/wolfcode/springboot/_08valueinject/db.properties")
public class AppConfig {

	/**
	 * @Value标签相当于就是<property name="username" value="${db.username}" />
	 */
	@Value("${db.username}")
	private String username;

	@Value("${db.password}")
	private String password;

	@Value("${db.url}")
	private String url;
	
	//PropertySourcesPlaceholderConfigurer
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public Datasource datasource() {
		return new Datasource(username, password, url);
	}

}

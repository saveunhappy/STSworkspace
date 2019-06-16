package cn.wolfcode.springboot._08valueinject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

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
	 * Environment代表spring的环境，这个环境包含了两个东西： 1，加载到spring容器中的属性值 2，profile
	 */
	@Autowired
	private Environment env;

	@Bean
	public Datasource datasource() {
		return new Datasource(env.getProperty("db.username"), env.getProperty("db.password"),
				env.getProperty("db.url"));
	}

}

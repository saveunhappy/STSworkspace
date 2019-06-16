package cn.wolfcode.springboot._06import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {

	@Bean
	public Datasource dataSource() {
		return new Datasource();
	}
}

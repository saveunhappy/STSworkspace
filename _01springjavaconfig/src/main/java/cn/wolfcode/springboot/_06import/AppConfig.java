package cn.wolfcode.springboot._06import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ RedisConfig.class, DatasourceConfig.class })
public class AppConfig {

}

package cn.wolfcode.springboot._09profile;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest2 {

	/**
	 * spring.profiles.active
	 * spring.profiles.default
	 */
	@Test
	public void test() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ctx.getBean(Datasource.class));
	}

}

package cn.wolfcode.springboot._03factorybean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Java Config
 * 
 * @author stef
 * 
 */
public class SomeBeanTest {

	@Test
	public void test() {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {
			SomeBean someBean = ctx.getBean("somebean", SomeBean.class);
			System.out.println(someBean);
		}
	}
}

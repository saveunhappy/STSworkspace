package cn.wolfcode.springboot._01javaconfighello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
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
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		SomeBean someBean = ctx.getBean(SomeBean.class);
		System.out.println(someBean);
	}
}

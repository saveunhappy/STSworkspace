package cn.wolfcode.springboot._10conditional2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

	@Autowired
	private ApplicationContext ctx;

	@Test
	public void test() {
		System.out.println(ctx.getBeansOfType(SomeBean.class).size() > 0);
	}
}

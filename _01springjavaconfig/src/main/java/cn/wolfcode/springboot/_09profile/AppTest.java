package cn.wolfcode.springboot._09profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("dev")
public class AppTest {

	@Autowired
	private ApplicationContext ctx;

	@Test
	public void test() {
		System.out.println(ctx.getBean(Datasource.class));
		try {
			System.out.println(ctx.getBean(SomeBean.class));
		} catch (Exception e) {
		}
		try {
			System.out.println(ctx.getBean(OtherBean.class));
		} catch (Exception e) {
		}
	}
}

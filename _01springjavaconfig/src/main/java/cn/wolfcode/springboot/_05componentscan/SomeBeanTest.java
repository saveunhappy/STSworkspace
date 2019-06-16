package cn.wolfcode.springboot._05componentscan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring Java Config
 * 
 * @author stef
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class SomeBeanTest {

	@Autowired
	private SomeBean somebean;

	@Test
	public void test() {
		System.out.println(somebean.getOtherBean());
	}
}

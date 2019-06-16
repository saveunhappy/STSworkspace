package cn.wolfcode.springboot.utilstest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopUtilsTest {

	@Autowired
	private IEmployeeService service;

	@Autowired
	private MyComponent component;

	@Test
	public void testIsAop() {
		assertTrue(AopUtils.isAopProxy(service));
	}

	@Test
	public void testIsJdk() {
		assertTrue(AopUtils.isJdkDynamicProxy(service));
	}

	@Test
	public void testTargetClass() {
		System.out.println(component.getClass());
		System.out.println(AopUtils.getTargetClass(component));
	}
	
	@Test
	public void testMostSpecificMethod() throws Exception{
		Method m=component.getClass().getMethod("someLogic");
		System.out.println(m);
		Method om=AopUtils.getMostSpecificMethod(m, AopUtils.getTargetClass(component));
		System.out.println(om);
	}
	
	@Test
	public void testApply(){
		AspectJExpressionPointcut pc=new AspectJExpressionPointcut();
		pc.setExpression("execution(* cn.wolfcode.springboot.utilstest.MyComponent.*(..))");
		assertTrue(AopUtils.canApply(pc, MyComponent.class));
		assertFalse(AopUtils.canApply(pc, IEmployeeService.class));
	}
	
	@Test
	public void testIntroductions(){
		((IAddition)service).addtional();
	}
	
	@Test
	public void testClassLoader(){
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(this.getClass().getClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
	}

}

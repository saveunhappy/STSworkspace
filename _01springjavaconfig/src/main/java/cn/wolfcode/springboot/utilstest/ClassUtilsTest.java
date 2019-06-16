package cn.wolfcode.springboot.utilstest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class ClassUtilsTest {

	@Autowired
	private IEmployeeService service;

	@Test
	public void testClassLoader() {
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(this.getClass().getClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
	}

	@Test
	public void testClassforName() throws Exception {
		System.out.println(
				ClassUtils.forName("int", ClassUtils.getDefaultClassLoader()));
		System.out.println(ClassUtils.forName("java.lang.String[]",
				ClassUtils.getDefaultClassLoader()));
		System.out.println(ClassUtils.forName("java.lang.Thread.State",
				ClassUtils.getDefaultClassLoader()));
		System.out.println(ClassUtils.resolvePrimitiveClassName("int"));

		System.out.println(ClassUtils.getShortName(getClass()));
		System.out.println(ClassUtils.getShortName("java.lang.Thread$State"));

		System.out.println(ClassUtils.getShortName(getClass()));
		System.out.println(ClassUtils.getShortNameAsProperty(getClass()));

		System.out.println(ClassUtils.getClassFileName(getClass()));

		System.out.println(ClassUtils.getQualifiedName(String[].class));
		System.out.println(String[].class.getName());

		// java.lang.Class
		System.out.println(ClassUtils.getDescriptiveType(getClass()));
		// java.lang.String[]
		System.out.println(ClassUtils.getDescriptiveType(new String[] {}));
		// com.sun.proxy.$Proxy20 implementing
		// cn.wolfcode.springboot.utilstest.IEmployeeService,
		// cn.wolfcode.springboot.utilstest.IAddition,
		// org.springframework.aop.SpringProxy,org.springframework.aop.framework.Advised
		System.out.println(ClassUtils.getDescriptiveType(service));

		Method interfaceMethod = ClassUtils.getMethod(IEmployeeService.class,
				"someLogic");
		System.out.println(ClassUtils.getQualifiedMethodName(interfaceMethod));
		Method targetMethod = ClassUtils.getMostSpecificMethod(interfaceMethod,
				EmployeeServiceImpl.class);
		System.out.println(ClassUtils.getQualifiedMethodName(targetMethod));

		// 打印：cn/wolfcode/springboot/utilstest/someResource.xml
		System.out.println(ClassUtils.addResourcePathToPackagePath(
				IEmployeeService.class, "someResource.xml"));
	}

	@Test
	public void testProxys() throws Exception {
		Class<?> clzz = ClassUtils.createCompositeInterface(
				new Class[] { IEmployeeService.class, IAddition.class },
				ClassUtils.getDefaultClassLoader());
	}

}

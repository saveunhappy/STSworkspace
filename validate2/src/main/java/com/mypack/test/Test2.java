package com.mypack.test;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.realm.ShiroRealm;

public class Test2 {
	
	  private ApplicationContext ac = null;

    /**
     * 在所有测试方法之前执行这个标签
     */
    @Before
    public void init() {
        ac = new ClassPathXmlApplicationContext("spring-shiro.xml");
    }
	@Test
	public void testName() throws Exception {
      DefaultWebSecurityManager securityManager = ac.getBean("securityManager", DefaultWebSecurityManager.class);
      System.out.println(securityManager);
      LifecycleBeanPostProcessor lifecycleBeanPostProcessor = ac.getBean("lifecycleBeanPostProcessor", LifecycleBeanPostProcessor.class);
      System.out.println("lifecycleBeanPostProcessor = " + lifecycleBeanPostProcessor);
      ShiroRealm shiroRealm = ac.getBean("shiroRealm", ShiroRealm.class);
      System.out.println("shiroRealm = " + shiroRealm);
      ShiroFilterFactoryBean shiroFilter = ac.getBean("shiroFilter", ShiroFilterFactoryBean.class);
      System.out.println("shiroFilter = " + shiroFilter);
		System.out.println("ac="+ac.toString());
	}
}

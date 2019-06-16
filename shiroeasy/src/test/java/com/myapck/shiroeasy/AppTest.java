package com.myapck.shiroeasy;

import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
	@Test
	public void testName() throws Exception {
		//1:创建SecurityManager工厂对象，加载配置文件，创建工厂对象
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		//2:通过工厂对象创建出SecurityManager对象
		SecurityManager manager = factory.getInstance();
		//3:将securityManager对象绑定到当前运行环境中，让系统随时随地地都可以访问的到securityManager对象
		SecurityUtils.setSecurityManager(manager);
		
		
		//4：创建当前登录的主题，注意，此时的主题没有经过认证
		Subject subject = SecurityUtils.getSubject();
		//5:收集主题登录时的身份/凭证，即账号密码
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","666");
		
		//6:主题登录
		try {
			
			subject.login(token);
		} catch (Exception e) {
			//登录失败
		}
		//7:登录是否成功
		System.out.println("验证登录是否成功"+subject.isAuthenticated());
		subject.logout();
		System.out.println("是否登录成功"+subject.isAuthenticated());
	}
	@Test
	public void testName1() throws Exception {
		//1:创建SecurityManager工厂对象，加载配置文件，创建工厂对象
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
		//2:通过工厂对象创建出SecurityManager对象
		SecurityManager manager = factory.getInstance();
		//3:将securityManager对象绑定到当前运行环境中，让系统随时随地地都可以访问的到securityManager对象
		SecurityUtils.setSecurityManager(manager);
		
		
		//4：创建当前登录的主题，注意，此时的主题没有经过认证
		Subject subject = SecurityUtils.getSubject();
		//5:收集主题登录时的身份/凭证，即账号密码
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","666");
		
		//6:主题登录
		try {
			
			subject.login(token);
		} catch (Exception e) {
			//登录失败
			e.printStackTrace();
		}
		//7:登录是否成功
		System.out.println("验证登录是否成功"+subject.isAuthenticated());
		subject.logout();
		System.out.println("是否登录成功"+subject.isAuthenticated());
	}
	
	@Test
	public void testmd() throws Exception {
		//1:创建SecurityManager工厂对象，加载配置文件，创建工厂对象
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-md.ini");
		//2:通过工厂对象创建出SecurityManager对象
		SecurityManager manager = factory.getInstance();
		//3:将securityManager对象绑定到当前运行环境中，让系统随时随地地都可以访问的到securityManager对象
		SecurityUtils.setSecurityManager(manager);
		
		
		//4：创建当前登录的主题，注意，此时的主题没有经过认证
		Subject subject = SecurityUtils.getSubject();
		//5:收集主题登录时的身份/凭证，即账号密码
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","666");
		
		//6:主题登录
		try {
			
			subject.login(token);
		} catch (Exception e) {
			//登录失败
			e.printStackTrace();
		}
		//7:登录是否成功
		System.out.println("验证登录是否成功"+subject.isAuthenticated());
		subject.logout();
		System.out.println("是否登录成功"+subject.isAuthenticated());
	}
	@Test
	public void testHasRoles() throws Exception {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-permission.ini");
		SecurityManager manager = factory.getInstance();
		SecurityUtils.setSecurityManager(manager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","666");
		subject.login(token);
		//进行授权操作时，用户必须通过认证
		
		//判断当前用户是否拥有某个角色，返回true表示有，返回false表示没有
		
		System.out.println(subject.hasRole("role1"));
		System.out.println(Arrays.toString(subject.hasRoles(Arrays.asList("role1","role2","role3"))));
		System.out.println(subject.hasAllRoles(Arrays.asList("role1","role2")));
		//这个也时判断有没有权限，不过如果有的话就正常运行，如果没有的话就报错
		subject.checkRole("role1");
		subject.checkRoles("role1","role2");
	}
	@Test
	public void testHasPermission() throws Exception {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-permission.ini");
		SecurityManager manager = factory.getInstance();
		SecurityUtils.setSecurityManager(manager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","666");
		subject.login(token);
		//判断当前用户是否拥有某个权限
		System.out.println(Arrays.toString(subject.isPermitted("user:delete","user:update")));
		System.out.println(subject.isPermittedAll("user:delete","user:update"));
		
		
		subject.checkPermission("user:update");
	}
	
	@Test
	public void testPermissionAndRoles() throws Exception {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-permission-realm.ini");
		SecurityManager manager = factory.getInstance();
		SecurityUtils.setSecurityManager(manager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","666");
		subject.login(token);
		//判断当前用户是否拥有某个权限
		System.out.println(subject.isPermitted("user:delete"));
		
		System.out.println(subject.hasRole("role1"));
	}
}

package cn.wolfcode.springboot.utilstest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {

	@Before("execution(* cn.wolfcode.springboot.utilstest.*Service.*(..))")
	public void advisor() {
		System.out.println("do before");
	}

	@Before("execution(* cn.wolfcode.springboot.utilstest.MyComponent.*(..))")
	public void advisor2() {
		System.out.println("do before");
	}

	@DeclareParents(value = "cn.wolfcode.springboot.utilstest.IEmployeeService+", 
				defaultImpl = AdditionImpl.class)
	public IAddition addition;
}

package com.mypack;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {
	//@Test(expected=ArithmeticException.class)断言报什么错
	@Test(timeout=2000)//2s内没有运行出来就报错
	public void test1() throws Exception {
		int z = new T().add(3, 3);
//		assertEquals(6, z);
		assertTrue("z太小了", z>8);
		
	}
}

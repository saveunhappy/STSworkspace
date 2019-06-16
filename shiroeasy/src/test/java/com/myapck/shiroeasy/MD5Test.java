package com.myapck.shiroeasy;

import static org.junit.Assert.*;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class MD5Test {
	@Test
	public void testName() throws Exception {
		String password = "666";
		//加密:md5
		Md5Hash md = new Md5Hash(password);
		System.out.println(md);
		 md = new Md5Hash(password,"zhangsan");
			System.out.println(md);
			md = new Md5Hash(password,"zhangsan",3);
			System.out.println(md);
			//cd757bae8bd31da92c6b14c235668091
		
		
	}
}

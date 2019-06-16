package cn.wolfcode.springboot.utilstest;

import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesLoaderUtilsTest {

	@Test
	public void testLoadPropertiesResource() throws Exception {
		Properties ret = PropertiesLoaderUtils
				.loadProperties(new ClassPathResource("test.properties"));
		System.out.println(ret);
//		assertEquals("value", ret.getProperty("key"));
//		assertEquals("中文", ret.getProperty("key2"));
	}

	@Test
	public void testLoadPropertiesResourceXml() throws Exception {
		Properties ret = PropertiesLoaderUtils
				.loadProperties(new ClassPathResource("test.xml"));
		assertEquals("value", ret.getProperty("key"));
		assertEquals("中文", ret.getProperty("key2"));
	}


	@Test
	public void testLoadPropertiesEncodedResource() throws Exception {
		Properties ret = PropertiesLoaderUtils.loadProperties(
				new EncodedResource(new ClassPathResource("test.properties"),
						"UTF-8"));
		assertEquals("value", ret.getProperty("key"));
		assertEquals("中文", ret.getProperty("key2"));
	}

	@Test
	public void testLoadAllPropertiesString() throws Exception {
		Properties ret = PropertiesLoaderUtils
				.loadAllProperties("test.properties");
		assertEquals("value", ret.getProperty("key"));
		assertEquals("value", ret.getProperty("key3"));
	}

	@Test
	public void testFillPropertiesPropertiesResource() throws Exception {
		Resource res = new ClassPathResource("test.properties");
		Properties ret = new Properties();
		PropertiesLoaderUtils.fillProperties(ret, res);
		assertEquals("value", ret.getProperty("key"));
	}

}

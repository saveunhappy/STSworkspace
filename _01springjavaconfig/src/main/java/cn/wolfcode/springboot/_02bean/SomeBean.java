package cn.wolfcode.springboot._02bean;

public class SomeBean {

	// @PostConstruct
	public void init() {
		System.out.println("===init===");
	}

	// @PreDestroy
	public void destory() {
		System.out.println("===destory===");
	}
}

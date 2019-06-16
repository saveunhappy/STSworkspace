package cn.wolfcode.springboot._03factorybean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SomeBean {
	
	public void init() {
		System.out.println("===init===");
	}

	public void destory() {
		System.out.println("===destory===");
	}
}

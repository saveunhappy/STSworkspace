package cn.wolfcode.springboot.utilstest;

public class ConcreateClass implements IGenericInterface<String> {

	@Override
	public String get(String param) {
		return "hello";
	}

}

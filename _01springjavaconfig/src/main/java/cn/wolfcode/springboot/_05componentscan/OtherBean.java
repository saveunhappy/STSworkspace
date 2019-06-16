package cn.wolfcode.springboot._05componentscan;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OtherBean {

	private String name;
}

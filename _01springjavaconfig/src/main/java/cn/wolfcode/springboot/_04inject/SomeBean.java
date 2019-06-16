package cn.wolfcode.springboot._04inject;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SomeBean {

	private OtherBean otherBean;
}

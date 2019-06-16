package cn.wolfcode.springboot._10conditional2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class DependencyCondition implements Condition {

	/**
	 * 用来执行匹配，如果这个方法返回的是false，spring会忽略@Conditional标签标注的bean的实例化， 如果是true，正常实例化
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 得到ifexist标签中的value值，这个值，就是spring里面要作为依赖判断的bean的类型；
		MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(IfExist.class.getName());
		if (attrs != null) {
			for (Object value : attrs.get("value")) {
				if (context.getBeanFactory().getBeansOfType((Class<?>) value).size() > 0) {
					return true;
				}
			}
			return false;
		}
		// 把这个类型交给spring上下文查询，如果能够查到，返回true，否则返回false
		return true;
	}

}

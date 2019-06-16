package cn.wolfcode.springboot._10conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DependencyCondition implements Condition {

	/**
	 * 用来执行匹配，如果这个方法返回的是false，spring会忽略@Conditional标签标注的bean的实例化， 如果是true，正常实例化
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 如果spring上下文中存在DependencyBean，则创建当前的bean
		return context.getBeanFactory().getBeansOfType(DependencyBean.class).size() > 0;
	}

}

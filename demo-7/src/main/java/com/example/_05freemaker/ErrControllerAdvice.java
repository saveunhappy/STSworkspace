package com.example._05freemaker;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class ErrControllerAdvice {
	@ExceptionHandler(Exception.class)
	public void handlerError(Exception ex,HandlerMethod method) {
		System.out.println("统一异常处理");
		System.out.println(ex.getMessage());
		System.out.println(method.getBean().getClass());
		System.out.println(method.getMethod().getName());
	}
}

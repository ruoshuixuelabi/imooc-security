package com.imooc.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.service.HelloService;

/**
 * 第一个泛型代表要验证的注解是哪个
 * 要验证的东西的类型是什么
 * @author zhailiang
 */
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {
	@Autowired
	private HelloService helloService;
	@Override
	public void initialize(MyConstraint constraintAnnotation) {
		System.out.println("my validator init");
	}
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		helloService.greeting("tom");
		System.out.println(value);
		return true;
	}
}
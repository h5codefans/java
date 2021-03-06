package com.bjsxt.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtMyAnnotation01 {
      
	String studentName() default "";
	int age() default 0;
	int id() default -1;   //表示不存在
	
	String[] schools() default{"清华大学","北京尚学堂"};
}

package com.example.demo.aop;

import java.lang.annotation.*;

// 声明注解的保留期限
@Retention(RetentionPolicy.RUNTIME)
// 声明可以使用该注解的目标类型
@Target(ElementType.METHOD)
@Documented
public @interface NeedAop {
    // 声明注解成员
    boolean value() default false;
}

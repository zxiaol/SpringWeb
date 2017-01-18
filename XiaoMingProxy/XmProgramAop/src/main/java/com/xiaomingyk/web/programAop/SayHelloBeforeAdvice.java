package com.xiaomingyk.web.programAop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by My on 1/12/2017.
 */
public class SayHelloBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("before calling method in SayHelloBeforeAdvice");

    }
}

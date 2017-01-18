package com.xiaomingyk.web.programAop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by My on 1/13/2017.
 */
public class SayHelloAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("After calling method in SayHelloAfterAdvice");


    }
}

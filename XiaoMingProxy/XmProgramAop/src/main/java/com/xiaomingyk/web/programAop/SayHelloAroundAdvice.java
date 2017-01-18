package com.xiaomingyk.web.programAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by My on 1/13/2017.
 */
public class SayHelloAroundAdvice implements org.aopalliance.intercept.MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        
        before();
        Object result = methodInvocation.proceed();
        after();
        return result;
    }

    private void after() {

        System.out.println("After calling say hello in SayHelloAroundAdvice");
    }

    private void before() {

        System.out.println("Before calling say hello in SayHelloAroundAdvice");

    }
}

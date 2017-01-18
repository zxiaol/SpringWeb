package com.xiaomingyk.web.programAop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by My on 1/13/2017.
 */
public class AopMain {

    public static void main(String[] args){

        CallSpringAopThroughAdvice();

        System.out.println("--------------------------------------------------------------");

        CallSpringAopThroughInterceptor();
    }

    private static void CallSpringAopThroughInterceptor(){

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new SayHelloImpl());
        proxyFactory.addAdvice(new SayHelloAroundAdvice());
        SayHello sayHello = (SayHello)proxyFactory.getProxy();
        sayHello.SayHelloMsg("aroud");


    }

    private static void CallSpringAopThroughAdvice() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new SayHelloImpl());
        proxyFactory.addAdvice(new SayHelloBeforeAdvice());
        proxyFactory.addAdvice(new SayHelloAfterAdvice());
        SayHello sayHello = (SayHello)proxyFactory.getProxy();
        sayHello.SayHelloMsg("david");
    }

}

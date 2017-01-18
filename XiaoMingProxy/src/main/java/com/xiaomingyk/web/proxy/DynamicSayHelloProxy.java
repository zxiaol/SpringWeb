package com.xiaomingyk.web.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by My on 1/12/2017.
 */
public class DynamicSayHelloProxy implements InvocationHandler {

    private Object target;

    public DynamicSayHelloProxy(Object target){

        this.target = target;
    }
    @SuppressWarnings("unchecked")
    public <T> T getProxy(){

        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void after() {

        System.out.println("After calling say hello in dynamic proxy");
    }

    private void before() {

        System.out.println("before calling say hello in dynamic proxy");

    }
}

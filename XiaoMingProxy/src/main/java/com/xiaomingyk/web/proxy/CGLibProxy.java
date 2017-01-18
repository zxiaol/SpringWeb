package com.xiaomingyk.web.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by My on 1/12/2017.
 */
public class CGLibProxy implements MethodInterceptor {

    private static CGLibProxy instance = new CGLibProxy();

    public static CGLibProxy getInstance(){

        return instance;
    }


    public <T> T getProxy(Class<T> cls){

        return (T) Enhancer.create(cls,this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        before();
        Object result = methodProxy.invokeSuper(o,args);
        after();
        return result;
    }

    private void after() {

        System.out.println("After calling say hello in CGLib proxy");

    }

    private void before() {

        System.out.println("Before calling say hello in CGLib proxy");

    }
}

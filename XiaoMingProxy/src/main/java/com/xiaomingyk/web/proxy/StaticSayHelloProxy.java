package com.xiaomingyk.web.proxy;

/**
 * Created by My on 1/12/2017.
 */
public class StaticSayHelloProxy implements SayHello {

    private SayHello hello;

    public StaticSayHelloProxy(SayHello hello){
        this.hello = hello;
    }
    public void SayHelloMsg() {

        before();
        hello.SayHelloMsg();
        after();
    }

    private void before() {

        System.out.println("before calling say hello in static proxy");
    }


    private void after() {

        System.out.println("After calling say hello in static proxy");
    }
}

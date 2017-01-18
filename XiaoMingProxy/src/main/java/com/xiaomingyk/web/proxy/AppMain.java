package com.xiaomingyk.web.proxy;

/**
 * Created by My on 1/12/2017.
 */
public class AppMain {

    public static void main(String[] args){

        CallImplDirectly();

        CallImplFromStaticProxy();

        CallImplFromDynamicProxy();

        CallImplFromCGLibProxy();

    }

    private static void CallImplFromCGLibProxy() {

        CGLibProxy.getInstance().getProxy((new SayHelloImpl()).getClass()).SayHelloMsg();
    }

    private static void CallImplFromDynamicProxy() {


        DynamicSayHelloProxy proxy = new DynamicSayHelloProxy(new SayHelloImpl());

        SayHello hello = proxy.getProxy();

        hello.SayHelloMsg();


    }

    private static void CallImplFromStaticProxy() {

        SayHelloImpl hello = new SayHelloImpl();

        StaticSayHelloProxy helloProxy = new StaticSayHelloProxy(hello);

        helloProxy.SayHelloMsg();
    }

    private static void CallImplDirectly() {

        SayHelloImpl hello = new SayHelloImpl();
        hello.SayHelloMsg();
    }
}

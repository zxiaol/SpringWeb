package com.xiaomingyk.web.declareAop;

/**
 * Created by My on 1/13/2017.
 */
public class SayHelloImpl implements SayHello {

    @Override
    public void SayHelloMsg(String name) {

        System.out.println("Hello my friend " + name);

    }
}

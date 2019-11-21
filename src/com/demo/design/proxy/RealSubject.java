package com.demo.design.proxy;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 19:21
 * @Description:
 */
public class RealSubject implements  Subject {


    @Override
    public void request() {
        System.out.println("aaaa");
    }
}

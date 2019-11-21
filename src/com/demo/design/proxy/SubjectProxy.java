package com.demo.design.proxy;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 19:19
 * @Description:
 */
public class SubjectProxy implements Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        before();
        realSubject.request();
        after();

    }

    public void before(){
        System.out.println("=======");
    }
    public void after(){
        System.out.println("============");
    }
}

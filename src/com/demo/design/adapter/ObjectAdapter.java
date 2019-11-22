package com.demo.design.adapter;

/**
 * @Auther: ghost
 * @Date: 2019/11/21 17:07
 * @Description:
 */
public class ObjectAdapter implements Target {


    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

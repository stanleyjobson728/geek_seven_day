package com.demo.design.adapter;

/**
 * @Auther: ghost
 * @Date: 2019/11/21 17:04
 * @Description:
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}

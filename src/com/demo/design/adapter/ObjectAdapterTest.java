package com.demo.design.adapter;

/**
 * @Auther: ghost
 * @Date: 2019/11/21 17:08
 * @Description:
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}

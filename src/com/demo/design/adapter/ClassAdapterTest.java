package com.demo.design.adapter;

/**
 * @Auther: ghost
 * @Date: 2019/11/21 17:05
 * @Description:
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
    
}

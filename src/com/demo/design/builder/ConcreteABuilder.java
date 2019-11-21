package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:12
 * @Description:
 */
public class ConcreteABuilder extends Builder{


    @Override
    public void bulidPartA() {
        product.setPartA("A类商品 A");
    }

    @Override
    public void bulidPartB() {
        product.setPartB("A类商品 b");

    }

    @Override
    public void bulidPartC() {
        product.setPartc("A类商品 c");

    }
}

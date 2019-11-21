package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:17
 * @Description:
 */
public class ConcreteBBuilder extends Builder {
    @Override
    public void bulidPartA() {
        product.setPartA(" B类商品 A ");
    }

    @Override
    public void bulidPartB() {
        product.setPartB(" B类商品 B ");
    }

    @Override
    public void bulidPartC() {
        product.setPartc(" B类商品 C ");
    }
}

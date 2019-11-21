package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:09
 * @Description:
 */
public abstract class Builder {

    public Product product = new Product();

    public abstract void bulidPartA();

    public abstract void bulidPartB();

    public abstract void bulidPartC();

    public Product getResult(){
        return  this.product;
    }

}

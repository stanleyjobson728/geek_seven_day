package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:14
 * @Description:
 */
public class Director {

    public Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public Product construct() {
        builder.bulidPartA();
        builder.bulidPartB();
        builder.bulidPartC();
        return builder.getResult();
    }

    public static void main(String[] args) {
        Builder builder = new ConcreteABuilder();
        Director director = new Director(builder);
        Product construct = director.construct();
        construct.show();

        Builder builderb = new ConcreteBBuilder();
        Director directorb  = new Director(builderb);
        Product construct1 = directorb.construct();
        construct1.show();
    }
}




package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:07
 * @Description:
 */
public class Product {

    private String partA;
    private String partB;
    private String partc;

    public void show(){
        System.out.println("=================");
        System.out.println(this.partA);
        System.out.println(this.partB);
        System.out.println(this.partc);
        System.out.println("=================");
    }


    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartc() {
        return partc;
    }

    public void setPartc(String partc) {
        this.partc = partc;
    }
}

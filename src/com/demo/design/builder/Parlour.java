package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:49
 * @Description:
 */
public class Parlour {

    public String tv;

    public String wall;

    public String sofa;

    public void show(){
        System.out.println(tv);
        System.out.println(wall);
        System.out.println(sofa);

    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
}

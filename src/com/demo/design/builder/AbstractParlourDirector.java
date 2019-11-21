package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:49
 * @Description:
 */
public abstract class AbstractParlourDirector {

    public Parlour parlour = new Parlour();

    public abstract void bulidWall();
    public abstract void bulidTv();
    public abstract void bulidSofa();


    public Parlour getResult(){
        return parlour;
    }

}

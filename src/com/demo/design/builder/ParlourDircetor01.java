package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:55
 * @Description:
 */
public class ParlourDircetor01 extends AbstractParlourDirector {


    @Override
    public void bulidWall() {
        this.parlour.setWall(" a   wall");
    }

    @Override
    public void bulidTv() {
        this.parlour.setTv(" a   tv");
    }

    @Override
    public void bulidSofa() {
        this.parlour.setSofa(" a   sofa");
    }
}

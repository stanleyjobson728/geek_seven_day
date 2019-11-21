package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:57
 * @Description:
 */
public class ParlourDircetor02 extends AbstractParlourDirector {

    @Override
    public void bulidWall() {
        this.parlour.setWall(" b   wall");
    }

    @Override
    public void bulidTv() {
        this.parlour.setTv(" b   tv");
    }

    @Override
    public void bulidSofa() {
        this.parlour.setSofa(" b  sofa");
    }
}

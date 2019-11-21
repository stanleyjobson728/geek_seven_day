package com.demo.design.builder;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 18:34
 * @Description:
 */
public class ProjectManager {

    public  AbstractParlourDirector abstractParlourDirector;

    public ProjectManager(AbstractParlourDirector abstractParlourDirector){
        this.abstractParlourDirector = abstractParlourDirector;
    }


    public Parlour decorate(){
        abstractParlourDirector.bulidSofa();
        abstractParlourDirector.bulidTv();
        abstractParlourDirector.bulidWall();
        Parlour result = abstractParlourDirector.getResult();
        return result;
    }

    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager(new ParlourDircetor01());
        Parlour decorate = projectManager.decorate();
        decorate.show();


        ProjectManager projectManager2 = new ProjectManager(new ParlourDircetor02());
        Parlour decorate2 = projectManager2.decorate();
        decorate2.show();
    }

}

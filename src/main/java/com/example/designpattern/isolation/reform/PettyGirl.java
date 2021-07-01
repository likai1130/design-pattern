package com.example.designpattern.isolation.reform;

/**
 * @ClassName PettyGirl
 * @Description 美女具体实现
 * @Author likai
 * @date 2021/6/27 15:01
 **/
public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

    private String  name;

    //美女都有名字
    public PettyGirl(String _name){
        this.name = _name;
    }

    //脸蛋漂亮
    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮！");
    }

    //好身材
    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒！");
    }

    //有气质
    @Override
    public void greatTemperameent() {
        System.out.println(this.name + "---气质非常好！");
    }
}

package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName AbstractWhiteHuman
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:36
 **/
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话,一般使用双字符");
    }

}

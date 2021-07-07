package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName AbstractWhiteHuman
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:36
 **/
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般是双字节");
    }

}

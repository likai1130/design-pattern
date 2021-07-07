package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName MaleYellowHuman
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:42
 **/
public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}

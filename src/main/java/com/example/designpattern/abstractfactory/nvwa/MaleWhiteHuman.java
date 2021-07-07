package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName MaleWhiteHuman
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:42
 **/
public class MaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}

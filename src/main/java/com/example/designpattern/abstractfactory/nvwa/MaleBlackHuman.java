package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName MaleBlackHuman
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:42
 **/
public class MaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}

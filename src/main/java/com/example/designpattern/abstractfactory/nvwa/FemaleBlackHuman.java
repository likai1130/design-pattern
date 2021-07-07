package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName FamaleYellowHuman
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:41
 **/
public class FemaleBlackHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}

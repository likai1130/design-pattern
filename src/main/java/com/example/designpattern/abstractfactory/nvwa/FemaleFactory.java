package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName FemaleFactory
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:52
 **/
public class FemaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackwHuman() {
        return new FemaleBlackHuman();
    }
}

package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName FemaleFactory
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 17:52
 **/
public class MaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackwHuman() {
        return new MaleBlackHuman();
    }
}

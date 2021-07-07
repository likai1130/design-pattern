package com.example.designpattern.abstractfactory.nvwa;

/**
 * @ClassName NvWa
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 18:04
 **/
public class NvWa {
    public static void main(String[] args) {

        MaleFactory maleFactory = new MaleFactory();
        FemaleFactory femaleFactory = new FemaleFactory();

        Human yellowHuman = maleFactory.createYellowHuman();
        yellowHuman.getColor();
        yellowHuman.getSex();
        yellowHuman.talk();

        Human whiteHuman = maleFactory.createWhiteHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        whiteHuman.getSex();

        Human blackwHuman = maleFactory.createBlackwHuman();
        blackwHuman.getColor();
        blackwHuman.getSex();
        blackwHuman.talk();


        Human yellowHuman1 = femaleFactory.createYellowHuman();
        yellowHuman1.getColor();
        yellowHuman1.talk();
        yellowHuman1.getSex();

        Human whiteHuman1 = femaleFactory.createWhiteHuman();
        whiteHuman1.getColor();
        whiteHuman1.getSex();
        whiteHuman1.talk();

        Human blackwHuman1 = femaleFactory.createBlackwHuman();
        blackwHuman1.getColor();
        blackwHuman1.talk();
        blackwHuman1.getSex();

    }
}

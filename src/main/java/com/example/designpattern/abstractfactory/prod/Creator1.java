package com.example.designpattern.abstractfactory.prod;

/**
 * @ClassName Creator1
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 18:28
 **/
public class Creator1 extends AbstractCreator{
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}

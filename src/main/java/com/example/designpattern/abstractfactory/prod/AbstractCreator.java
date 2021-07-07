package com.example.designpattern.abstractfactory.prod;

/**
 * @ClassName AbstractCreator
 * @Description 抽象工厂类
 * @Author likai
 * @date 2021/7/7 18:25
 **/
public abstract class AbstractCreator {
    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();
}

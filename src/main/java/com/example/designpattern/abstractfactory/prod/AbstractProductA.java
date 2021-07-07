package com.example.designpattern.abstractfactory.prod;

/**
 * @ClassName AbstractProductA
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 18:21
 **/
public abstract class AbstractProductA {

    //每个产品共有的方法
    void shareMethod(){}

    //每个产品相同方法不用实现
    abstract void doSomeThing();
}

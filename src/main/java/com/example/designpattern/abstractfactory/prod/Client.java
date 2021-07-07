package com.example.designpattern.abstractfactory.prod;

/**
 * @ClassName Client
 * @Description TODO
 * @Author likai
 * @date 2021/7/7 18:34
 **/
public class Client {
    public static void main(String[] args) {
        Creator1 creator1 = new Creator1();
        Creator2 creator2 = new Creator2();

        AbstractProductA productA1 = creator1.createProductA();
        AbstractProductA productA2 = creator2.createProductA();

        AbstractProductB productB1 = creator1.createProductB();
        AbstractProductB productB2 = creator2.createProductB();

        productA1.doSomeThing();
        productA2.doSomeThing();

        productB1.doSomeThing();
        productB2.doSomeThing();

    }
}

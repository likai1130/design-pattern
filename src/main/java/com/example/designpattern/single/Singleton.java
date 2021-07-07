package com.example.designpattern.single;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author likai
 * @date 2021/7/5 15:15
 **/
public class Singleton {
    private static final Singleton singleton =  new Singleton();

    //限制创建多个对象
    Singleton(){}

    //通过该方法获得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    //类中其他方法，尽量是static
    public static void doSomething(){}
}

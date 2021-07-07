package com.example.designpattern.single;

/**
 * @ClassName Emperor
 * @Description TODO
 * @Author likai
 * @date 2021/7/5 15:06
 **/
public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor() {}

    public static Emperor getInstance(){
        return emperor;
    }

    static void say(){
        System.out.println("我是皇帝xxx");
    }
}

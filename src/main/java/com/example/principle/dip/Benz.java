package com.example.principle.dip;

/**
 * @ClassName Benz
 * @Description 奔驰车
 * @Author likai
 * @date 2021/6/19 13:38
 **/
public class Benz implements ICar{

    /**
     *  汽车就会跑
     */
    public void run() {
        System.out.println("奔驰汽车开始运行。。。");
    }
}

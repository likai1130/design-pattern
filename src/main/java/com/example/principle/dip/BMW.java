package com.example.principle.dip;

/**
 * @ClassName BMW
 * @Description 宝马车
 * @Author likai
 * @date 2021/6/19 13:41
 **/
public class BMW implements ICar{

    /**
     *  汽车肯定会跑
     */
    public void run(){
        System.out.println("宝马汽车开始运行...");
    }
}

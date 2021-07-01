package com.example.designpattern.dip;

/**
 * @ClassName Client
 * @Description TODO
 * @Author likai
 * @date 2021/6/19 13:39
 **/
public class Client {

    /**
     * Java中只要定义变量就必然要有类型，一个变量有两种类型
     * 表面类型：定义时候赋予的类型
     * 实际类型: 对象的类型，zhangsan的表面类型是IDriver,实际类型Driver
     * @param args
     */
    public static void main(String[] args){
        Benz benz = new Benz();
        BMW bmw = new BMW();
        Driver zhangsan = new Driver(benz);

        //张三开奔驰
        zhangsan.drive();

    }
}

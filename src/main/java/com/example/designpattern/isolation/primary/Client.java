package com.example.designpattern.isolation.primary;

/**
 * @ClassName Client
 * @Description 场景测试
 * @Author likai
 * @date 2021/6/27 15:10
 **/
public class Client {
    //搜索并且展示美女信息
    public static void main(String[] args) {
        //定义美女
        PettyGirl yanYan = new PettyGirl("艳艳");
        Searcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}

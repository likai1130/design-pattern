package com.example.designpattern.dip;

/**
 * @ClassName ICar
 * @Description 接口抽象，不依赖BWM和Benz
 * 新增低层模块啊，只修改高层模块
 * @Author likai
 * @date 2021/6/19 13:52
 **/
public interface ICar {
    //是汽车就跑
    void run();
}

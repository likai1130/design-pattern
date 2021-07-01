package com.example.designpattern.dip;

/**
 * @ClassName Driver
 * @Description 司机
 * @Author likai
 * @date 2021/6/19 13:37
 **/
public class Driver implements IDriver{

    private ICar car;

    /**
     *  司机职责就是驾驶汽车
     * @param _car
     */
    public Driver(ICar _car){
        this.car = _car;
    }
    public void drive() {
        car.run();
    }
}

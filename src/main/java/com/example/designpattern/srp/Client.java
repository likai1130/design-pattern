package com.example.designpattern.srp;

/**
 * @ClassName Client
 * @Description 测试
 * @Author likai
 * @date 2021/6/28 17:04
 **/
public class Client {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.dial("12312312313");
        iPhone.dataTransfer(iPhone);
        iPhone.hangup();

    }
}

package com.example.designpattern.single;

/**
 * @ClassName Minister
 * @Description TODO
 * @Author likai
 * @date 2021/7/5 15:10
 **/
public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3 ; day ++){
            Emperor instance = Emperor.getInstance();
            instance.say();
        }
    }
}

package com.example.principle.lsp.definition3;

import java.util.HashMap;

/**
 * @ClassName Client
 * @Description 场景三：
 * @Author likai
 * @date 2021/7/1 12:19
 **/
public class Client {

    public static void invoker(){
        //父类存在的地方子类就应该存在
        //Father father = new Father();
        Son son = new Son();
        HashMap hashMap = new HashMap();
        son.doSomething(hashMap);
    }

    public static void main(String[] args) {
       invoker();
    }

}

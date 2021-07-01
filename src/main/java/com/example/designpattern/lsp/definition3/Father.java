package com.example.designpattern.lsp.definition3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Father
 * @Description 覆盖或实现父类的方法时输入参数可以被放大
 * @Author likai
 * @date 2021/6/30 16:48
 **/
public class Father {
    public Collection doSomething(Map map){
        System.out.println("父类被执行");
        return  map.values();

    }
}

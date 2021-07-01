package com.example.designpattern.lsp.definition3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Son
 * @Description TODO
 * @Author likai
 * @date 2021/6/30 16:54
 **/
public class Son extends Father{
        public Collection doSomething(Map map){
        System.out.println("子类被执行");
        return  map.values();

    }
}

package com.example.principle.lsp.definition2;

import com.example.principle.lsp.definition1.Rifle;

/**
 * @ClassName AUG
 * @Description 狙击枪
 * @Author likai
 * @date 2021/6/30 14:15
 **/
public class AUG extends Rifle{
    void zoomOut(){
        System.out.println("通过望远镜观察敌人");
    }

    void shoot(){
        System.out.println("AUG射击");
    }
}

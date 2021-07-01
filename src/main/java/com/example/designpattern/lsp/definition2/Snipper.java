package com.example.designpattern.lsp.definition2;

/**
 * @ClassName Snipper
 * @Description 狙击手
 * @Author likai
 * @date 2021/6/30 14:21
 **/
public class Snipper {

    void KillEnemy(AUG aug){
        //先查看敌人 情况
        aug.zoomOut();
        //射击
        aug.shoot();
    }

}


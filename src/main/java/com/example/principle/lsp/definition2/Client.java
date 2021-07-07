package com.example.principle.lsp.definition2;

import com.example.principle.lsp.definition1.Rifle;

/**
 * @ClassName Client
 * @Description 场景二：狙击手使用AUG杀死敌人
 * @Author likai
 * @date 2021/6/30 15:35
 **/
public class Client {
    public static void main(String[] args) {
        Snipper sanmao = new Snipper();

        //sanmao.KillEnemy(new AUG());

        sanmao.KillEnemy((AUG) new Rifle());//异常，有子类出现的地方父类未必就可以出现

    }
}

package com.example.designpattern.lsp.definition1;

/**
 * @ClassName Client
 * @Description 场景类一
 *
 * 给三毛一把步枪然后就开始杀敌了。如果三毛使用机枪也可以。sanmao.setGun(new Rifle());该为sanmao.setGun(new MachineGun())；
 *
 * 在编写程序时候Soldier士兵根本不需要知道是哪个类型的枪（子类）被传入
 *
 * 注意：
 *      在类中调用其他类时务必要使用父类或者接口，如果不能使用父类或者接口，则说明类的设计已经违背了LSP原则
 *
 * 问题：
 *
 *      如果我们有玩具枪如果和定义？
 *
 * @Author likai
 * @date 2021/6/28 19:05
 **/
public class Client {
    public static void main(String[] args) {
        //产生三毛这个士兵
        Soldier sanmao = new Soldier();
        //给三毛一支枪
       // sanmao.setGun(new Rifle());
        sanmao.setToyGun(new ToyGun());
        sanmao.killEnemy();

    }
}

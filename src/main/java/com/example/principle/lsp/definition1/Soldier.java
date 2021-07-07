package com.example.principle.lsp.definition1;

/**
 * @ClassName Soldier
 * @Description 士兵的实现类
 * @Author likai
 * @date 2021/6/28 18:57
 **/
public class Soldier {

    //定义士兵的枪支
    private AbstractGun gun;

    //定义士兵的枪支
    private AbstractToy tpyGun;

    //给士兵一支枪
    void setToyGun(AbstractToy _toyGun){
        this.tpyGun = _toyGun;
    }
    //给士兵一支枪
    void setGun(AbstractGun _gun){
        this.gun = _gun;
    }

    void killEnemy(){
        if (tpyGun != null){
            System.out.println("士兵是个玩具枪。。。");
        }else {
            System.out.println("士兵开始杀敌人。。。");
            gun.shoot();
        }

    }
}

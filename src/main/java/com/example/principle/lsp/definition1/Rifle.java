package com.example.principle.lsp.definition1;

/**
 * @ClassName Rifle
 * @Description 步枪实现类
 * @Author likai
 * @date 2021/6/28 18:59
 **/
public class Rifle extends AbstractGun{
    //步枪特点射程远，威力大
    @Override
    void shoot() {
        System.out.println("步枪射击。。。");
    }
}

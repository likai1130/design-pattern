package com.example.designpattern.lsp.definition1;

/**
 * @ClassName Handgun
 * @Description 手枪实现类
 * @Author likai
 * @date 2021/6/28 18:59
 **/
public class Handgun extends AbstractGun{

    //手枪特点携带方便，射程短
    @Override
    void shoot() {
        System.out.println("手枪射击。。。");
    }
}

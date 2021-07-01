package com.example.designpattern.lsp.definition1;

/**
 * @ClassName ToyGun
 * @Description 玩具枪
 * @Author likai
 * @date 2021/6/28 19:16
 **/
public class ToyGun extends AbstractToy {

    @Override
    void play() {
        System.out.println("玩具枪击无法杀敌人");
    }
}

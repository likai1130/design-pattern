package com.example.principle.lsp.definition1;

/**
 * @ClassName MachineGun
 * @Description 机枪实现类
 * @Author likai
 * @date 2021/6/28 18:59
 **/
public class MachineGun extends AbstractGun{

    @Override
    void shoot() {
        System.out.println("机枪射击。。。");
    }
}

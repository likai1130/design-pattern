package com.example.designpattern.srp;

/**
 * @IntefaceName IPhone
 * @Description  组合模式完成电话通话
 * @Author likai
 * @date 2021/6/28 16:50
 **/
public class IPhone implements IConnectionManager, IDataTransfer {

    @Override
    public void dial(String phoneNumber) {
        System.out.println(phoneNumber + "通话连接成功");
    }

    @Override
    public void hangup() {
        System.out.println("通话结束已挂断");
    }

    @Override
    public void dataTransfer(IConnectionManager cm) {
        System.out.println("正在通话");
    }
}


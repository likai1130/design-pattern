package com.example.principle.srp;

/**
 * @IntefaceName IConnectionManager
 * @Description 单一职责，连接管理
 * @Author likai
 * @date 2021/6/28 16:54
 **/
public interface IConnectionManager {
    //拨通电话
    void dial(String phoneNumber);
    //通话完毕，挂电话
    void hangup();
}

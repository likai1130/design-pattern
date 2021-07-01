package com.example.designpattern.srp;

/**
 * @IntefaceName IDataTransfer
 * @Description 单一职责: 数据交换
 * @Author likai
 * @date 2021/6/28 16:55
 **/
public interface IDataTransfer {
    void dataTransfer(IConnectionManager cm);
}

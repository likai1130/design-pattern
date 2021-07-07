package com.example.principle.isolation.primary;

/**
 * @ClassName AbstractSearcher
 * @Description 星探功能
 * @Author likai
 * @date 2021/6/27 15:05
 **/
public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher (IPettyGirl _pettyGirl){
        this.pettyGirl = _pettyGirl;
    }

    //搜索美女，列出美女信息
    public abstract void show();
}

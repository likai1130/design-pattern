package com.example.principle.isolation.reform;



/**
 * @ClassName Searcher
 * @Description 星探类
 * @Author likai
 * @date 2021/6/27 15:07
 **/
public class Searcher extends AbstractSearcher {

    public Searcher(PettyGirl _pettyGirl) {
        super(_pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("------------美女信息如下: --------------");

        //展示面容
        super.pettyGirl.goodLooking();
        //展示身材
        super.pettyGirl.niceFigure();
        //展示气质
        super.pettyGirl.greatTemperameent();

    }
}

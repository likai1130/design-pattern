package com.example.principle.ocp;

import com.example.principle.ocp.primary.NovelBook;

/**
 * @ClassName OffNoveIBook
 * @Description TODO
 * @Author likai
 * @date 2021/7/3 17:24
 **/
public class OffNoveIBook extends NovelBook {

    public OffNoveIBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice();
        int offPrice = 0;
        if (price  > 4000){
            //原价 大于40打九折
            offPrice =  price * 90 / 100;
        }else {
            offPrice = price * 80 / 100;
        }
        return offPrice;
    }
}

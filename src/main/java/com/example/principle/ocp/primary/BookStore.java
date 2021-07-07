package com.example.principle.ocp.primary;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @ClassName BookStore
 * @Description 如果出现打折情况需要重构
 *  1. 修改接口
 *  2. 修改实现类
 *  3. 通过扩展实现变化
 * @Author likai
 * @date 2021/7/3 13:51
 **/
public class BookStore {

    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
    static {
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new NovelBook("金瓶梅",4300,"兰陵笑笑生"));

    }

    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setMaximumFractionDigits(2);
        System.out.println("---------------书店卖出的书籍如下:---------------");
        for (IBook book:bookList){
            System.out.println("数据名称：" + book.getName() + "\t书籍作者：" + book.getAuthor() + "\t书籍价格：" + currencyInstance.format(book.getPrice()/100.0 ) + "元");
        }
    }

}

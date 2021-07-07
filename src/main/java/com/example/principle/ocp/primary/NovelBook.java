package com.example.principle.ocp.primary;

/**
 * @ClassName NovelBook
 * @Description TODO
 * @Author likai
 * @date 2021/7/3 13:47
 **/
public class NovelBook implements IBook{
    private String name;

    private int price;

    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }



    @Override
    public String getName() {
       return this.name = name;

    }

    @Override
    public int getPrice() {
       return this.price = price;
    }

    @Override
    public String getAuthor() {
       return this.author = author;
    }
}

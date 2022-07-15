package com.company.exam01;

public class Shop {

    private static Shop shop = new Shop();

    private Shop(){}

    static Shop getInstance(){
        return shop;
    }

}

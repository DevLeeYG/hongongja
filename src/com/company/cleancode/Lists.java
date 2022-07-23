package com.company.cleancode;

import java.util.ArrayList;

public class Lists<T> {
    public T info;

    public static void main(String[] args) {

        Lists<String> s1 = new Lists<String>();
        Lists<Integer> s2 = new Lists<>();

        s1.info = "123";
        s2.info = 3;



    }

}

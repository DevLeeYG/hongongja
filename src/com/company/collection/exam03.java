package com.company.collection;

import java.util.*;

public class exam03 {

    public static void main(String[] args) {
        //List 인터페이스에의 변수에 생성자를 대입하는것
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i = 0 ; i<10000; i++){
            list2.add(0,String.valueOf(i)); //int 를 String 형태로 변환한다.
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList 걸린시간" + (endTime-startTime)+"ns");
        startTime = System.nanoTime();
        for(int i = 0 ; i<10000; i++){
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();

    }

}

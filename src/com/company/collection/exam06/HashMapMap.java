package com.company.collection.exam06;

import java.util.*;

public class HashMapMap {
    public static void main(String[] args) {
        Map<Student,Integer> map = new HashMap<>();

        map.put(new Student(1,"홍길동"),95);
        map.put(new Student(1,"홍길동"),95);

        System.out.println(map.get(new Student(1,"홍길동")));

    }
}

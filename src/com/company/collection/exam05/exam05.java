package com.company.collection.exam05;

import java.util.*;

public class exam05 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));

        System.out.println(set.size());
    }
}

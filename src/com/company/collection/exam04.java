package com.company.collection;

import java.util.*;

public class exam04 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();


        set.add("Java");
        set.add("JDBC");
        set.add("Servelt/JSP");
        set.add("Java");
        set.add("ibatis");


        int size = set.size();
        System.out.println("객체수 :" + size);

        System.out.println("----------------------------------------------");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

            set.remove("JDBC");
            set.remove("ibatis");


        System.out.println("객체수 :" + set.size());


        iterator = set.iterator();
        for(String element : set){
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()){
            System.out.println("???");
        }


    }


}

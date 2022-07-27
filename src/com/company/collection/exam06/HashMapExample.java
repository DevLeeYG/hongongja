package com.company.collection.exam06;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95);
        System.out.println("총 Entry 수 : " + map.size());



        //객체 찾기
        System.out.println( map.get("홍길동")); //밸류를 가져온다.
        System.out.println();


        //객체를 하나씩 처리

        Set<String> keySet = map.keySet();


        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()){

            String key = keyIterator.next();
            Integer value = map.get(key);

            System.out.println("\t" + key +" : " + value);

        }

        System.out.println();

        map.remove("홍길동");

        System.out.println("총 Entry 수 : " + map.size());

        System.out.println();



        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        System.out.println(entrySet);

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key= entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value);
        }

        System.out.println();

        map.clear();

        System.out.println(map.size());





//        Iterator<String> iterator = keySet.iterator();
//
//
//
//        ArrayList<String> a = new ArrayList<>();
//
//        while(iterator.hasNext()){
//            a.add(iterator.next());
//        }
//
//        System.out.println("1123"+ a.get(0));




    }
}

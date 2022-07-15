package com.company.person;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567","홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //한번 지정하면 바꿀수 없다.
    }
}

package com.company.exam01;

public class ClassName {

    int field1;
    void method1(){}

    static int field2;
    static void method2(){}

    static void method3(){
        ClassName cls = new ClassName();

        cls.field1 = 3;
        cls.method1();
    }

}

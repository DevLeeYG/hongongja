package com.company.p2.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;
        child.field2 = "yyy";
        child.method3();

    }
}

//부모를 자식의 형태로 강제 형변환 해버려서 child 에있는 필드와 메소드를 쓸수있다 이것은 자식타입이 부모타입으로 변환되었다가 다시 자식으로 돌아가는것.
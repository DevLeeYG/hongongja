package com.company.p2.exam2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();



    }
}
//카 클래스는 4개의 Tire 필드를 가지고 있다. Car클래스로부터 Car객체를 생성하면 4개의 Tire 필드에 각각 하나씩
//Tire 객체가 들어가게 된다. 그런데 fontRightTire 와 backLeftTire를 HankookTire와 kumhoTire로 교체할 이유가 생겼다.
//그러면 다음과 같은 코드를 사용해서 교체할수 있다.

//Car my Car = new Car;
//myCar.frontRightTire = new HankookTire();
//myCar.backLeftTire = new KumhoTire();
//myCar.run().
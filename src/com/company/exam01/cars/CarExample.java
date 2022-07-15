package com.company.exam01.cars;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar.run();
        yourCar.run();

        myCar.setSpeed(50);




    }
}

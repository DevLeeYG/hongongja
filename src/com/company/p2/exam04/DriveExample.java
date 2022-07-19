package com.company.p2.exam04;

public class DriveExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(vehicle);
        driver.drive(taxi);

    }
}

//상속받은 객체의 재정의된 메소드를 따른다.
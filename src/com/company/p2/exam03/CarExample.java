package com.company.p2.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for(int i = 1; i<=5 ; i++){

            int problemlocation = car.run();

            switch (problemlocation){
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽",15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumHoTire로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽",13);
                case 3:
                    System.out.println("뒤왼쪽 hankooktire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽",14);
                case 4:
                    System.out.println("뒤오른쪽 kumhotire로 교체");
                    car.backLeftTire = new KumhoTire("뒤오른쪽",17);
            }

            System.out.println("-----------------------------------------------------");

        }

    }
}

//금호타이어와 한국타이어는 타이어 객체를 상속했고
//필드에 금호타이어와 한국타이어를 새로 넣어도 타입은 유지가되며 재정의한 메소드가 호출이된다.

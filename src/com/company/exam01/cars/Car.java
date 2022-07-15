package com.company.exam01.cars;

public class Car {

    private String company = "현대자동차";
    private int speed;
    private String model;
    private String color;
    private int maxSpeed;


 Car(String model){
     this.model = model;
 }


 int getSpeed(){
     return speed;
 }

 void keyTurnOn(){
     System.out.println("키를 돌립니다");
 }


 void setSpeed(int speed){
     this.speed = speed;
     System.out.println(this.speed);
 }


 void run(){
     for(int i = 0 ; i <= 50; i+=10){
         speed = i;
         System.out.println(this.model+"달립니다.(시속:" + speed +"km/h");
     }
 }

}

package com.company.exam01.cars;

public class Car {

 String company = "현대자동차";
 String model;
 String color;
 int maxSpeed;


 Car(){

 }

 Car(String model){
  this(model,"ㅁㄴㅇ",250);
 }

 Car(String model, String color){
     this.model = model;
     this.color = color;
     this.maxSpeed = 250;
 }
 Car(String model, String color, int maxSpeed){
     this.model = model;
     this.color = color;
     this.maxSpeed = maxSpeed;
 }

}

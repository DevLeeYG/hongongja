package com.company.calculate;

public class Calculator {

    static double pi = 3.14159;

    static int plus(int x,int y){
        return x + y;
    };

    static int minus(int x, int y){
        return x-y;
    }

    void powerOn(){
        System.out.println("전원을 켭니다");
    }


    double avg(int x, int y){
        double sum = plus(x, y);
        double result = sum /2;
        return result;
    }

    void execute(){
        double result = avg(7,10);
        println("실행결과 :"+ result);
    }

    void println(String message){
        System.out.println(message);
    }

    double areaRectangle(double width){
        return width * width;
    }

    double areaRectangle(double width , double height){
        return width * width;
    }


    double divide(int x, int y){
        double result = (double)x / (double) y;//형변환
        return result;
    }




}

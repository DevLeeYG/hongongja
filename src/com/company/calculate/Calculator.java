package com.company.calculate;

public class Calculator {
    void powerOn(){
        System.out.println("전원을 켭니다");
    }

    int plus(int x, int y){
        int result;
        result = x + y;
        return result;
    }

    double divide(int x, int y){
        double result = (double)x / (double) y;//형변환
        return result;
    }

    void powerOf(){
        System.out.println("전원을 끕니다.");
    }


}

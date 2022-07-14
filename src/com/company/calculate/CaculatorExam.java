package com.company.calculate;

public class CaculatorExam {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.powerOn();

        int result = myCal.plus(5,6);
        System.out.println(result);

        double result1 = myCal.divide(5,6);
        System.out.println(result1);

        byte a = 5;
        byte b = 6;


        double resuilt2 =  myCal.divide(a,b);

        System.out.println(resuilt2);
    }
}

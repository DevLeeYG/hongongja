package com.company.compu;

public class ComputerExam {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int[] val = {1,2,3,4,5,6,7};

        int result = myCom.sum1(val);
        int result2 = myCom.sum2(val);
        int result3 = myCom.sum3(val);
        System.out.println(result2+result3);
    }
}

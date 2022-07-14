package com.company.compu;

import java.util.Arrays;

public class Computer {

    int sum1(int ...values){
        int sum = Arrays.stream(values).sum();
        return sum;
    }

    int sum2(int[] values){
        int sum = Arrays.stream(values).reduce(0,(a,b)->a+b);
        return sum;
    }

    int sum3(int ...values){
        int sum = 0;
        for(int i = 0 ; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

}

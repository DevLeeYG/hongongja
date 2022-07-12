package com.company.ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {

        int[] scores = {83,90,87};

        String[] nammesss = null;

        nammesss = new String[] {"1","2","3"};

        System.out.println("123123"+ Arrays.toString(nammesss));


        System.out.println("scores[0]: " + scores[0]);
        System.out.println("scores[1]: " + scores[1]);
        System.out.println("scores[2]: " + scores[2]);
        
        int sum = 0;
        
        for(int i = 0 ; i<scores.length ; i++){
            sum += scores[i];
        }

        System.out.println(sum);
       double avg;



        avg = (double) sum/3;

        System.out.println(avg);




    }
}

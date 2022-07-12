package com.company.ex1;


import java.util.Arrays;

public class ArrayCreateByValueList2 {
    public static void main(String[] args) {
        int[] scores = null;

        scores = new int[30];

        System.out.println(Arrays.toString(scores));

        String[] nm = new String[30];



        nm[0] = "asd";
        System.out.println("asdf"+ Arrays.toString(nm));


        int sum1 = 0;

        for(int i = 0 ; i<scores.length; i++){
            sum1 += scores[i];
        }

        System.out.println(sum1);


      int sum3 = avg(new int[]{30,40,50});

        System.out.println(sum3);

    }

    private static int avg(int[] ints) {

        int sum = 0;

        for(int i = 0 ; i<3;i++){
            sum += ints[i];
        }
        return sum;
    }


}

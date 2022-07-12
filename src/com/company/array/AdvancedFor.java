package com.company.array;

public class AdvancedFor {
    public static void main(String[] args) {
        int[] scores = {95,71,84,93,87};

        int sum = 0;
        for(int score : scores){
            sum += score;
        }
        System.out.println((double) sum/scores.length);

        int[] array = {1,2,3};


        int[][] arraya = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        System.out.println(arraya[2].length);

    }
}

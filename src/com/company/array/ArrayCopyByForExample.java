package com.company.array;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i = 0 ; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        newIntArray[2] = 4;

        System.out.println(Arrays.toString(newIntArray));
        System.out.println(oldIntArray[0] == newIntArray[0]);
    }
}

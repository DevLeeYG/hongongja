package com.company.exam01;

public class SingleToneExam {
    public static void main(String[] args) {


        SingleTone sgt1 = SingleTone.getInstance();
        SingleTone sgt2 = SingleTone.getInstance();

        if(sgt1 == sgt2){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
}

package com.company.exam01;

public class SingleTone {
    private static SingleTone singleTone = new SingleTone();

    private SingleTone(){}

    static SingleTone getInstance(){
        return singleTone;
    }


}

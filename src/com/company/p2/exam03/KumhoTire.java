package com.company.p2.exam03;

public class KumhoTire extends Tire {

    public KumhoTire(String location, int maxRotation){
        super(location,maxRotation);
    }

    @Override
    public boolean roll(){
        accmulatedRotation++;
        if(accmulatedRotation<maxRotation){
            System.out.println(location + " kumhotire수명:" + (maxRotation - accmulatedRotation) +"회");
            return true;
        }else{
            System.out.println("***" + location + "kumhotire 펑크 ***");
            return false;
        }
    }
}

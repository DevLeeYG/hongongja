package com.company.p2.exam03;

public class Tire {

    public int maxRotation; //최대 회전수(타이어수명)
    public int accmulatedRotation; //누적 회전수
    public String location; // 타이어의 위치


    //생성자자
   public Tire(String location, int maxRotation){
        this.location = location; //초기화
        this.maxRotation = maxRotation; //초기화
    }

    public boolean roll(){
       accmulatedRotation++;
       if(accmulatedRotation<maxRotation){
           System.out.println(location + " Tire수명:" + (maxRotation - accmulatedRotation) +"회");
           return true;
       }else{
           System.out.println("***" + location + "Tire 펑크 ***");
           return false;
       }
    }





}

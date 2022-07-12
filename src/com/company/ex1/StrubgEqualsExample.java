package com.company.ex1;

public class StrubgEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "이영광";
        String strVar2 = "이영광";

        if(strVar1 == strVar2){
            System.out.println("참조 주소같음");
        }else{
            System.out.println("참조 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("문자열 같음");
        }

        String strVar3 = new String("이영광");
        String strVar4 = new String("이영광");


        if(strVar3 == strVar4){
            System.out.println("strVar3과 strvar4 참조가같음");
        }else{
            System.out.println("3과 4 는 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }

    }
}

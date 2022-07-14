package com.company.asd;


import java.util.Calendar;

public class EnumEnum  {


    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();


        int year = now.get(Calendar.YEAR);





        Week today = Week.SUNDAY;
        Week reservationDay;
        Week birthday = null;
        System.out.println(today);
    }
}

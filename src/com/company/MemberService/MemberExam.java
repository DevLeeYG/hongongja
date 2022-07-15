package com.company.MemberService;

import com.company.exam01.cars.FieldInitValue;
import com.company.person.Person;

public class MemberExam {
    public static void main(String[] args) {

        MemberService member = new MemberService();

        member.login("hong","1234");

        member.logout("hong");



    }
}

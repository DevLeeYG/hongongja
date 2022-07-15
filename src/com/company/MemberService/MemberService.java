package com.company.MemberService;

import com.company.person.Person;

public class MemberService {

    private String id = "";
    private String password ="1234";
    private boolean userState = false;


    void login(String id, String passwoard){
        if(id == "hong" && passwoard == password) {
            this.id = id;
            System.out.println(id + "님 께서 로그인 되었습니다");
            userState = true;
        }
    }

    void logout(String id){
        if(userState == true &&  this.id == "hong"){
            userState = false;
            System.out.println( this.id + "가 로그아웃 되었습니다");
        }

    }




}

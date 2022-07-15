package com.company.exam02;

public class StudentExam {
    public static void main(String[] args) {
        Student student = new Student("홍길동","123456789",123);

        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn );
        System.out.println("studentNo : " + student.studentNo);

    }
}

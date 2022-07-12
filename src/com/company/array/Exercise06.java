package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        int sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);

        while (run){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("선택>");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if(selectNo == 1){
                studentNum = 3;
                System.out.println(studentNum);

            }else if(selectNo == 2) {
                scores = new int[] {88,95,79};
                System.out.println("성적이 저장되었습니다");

            }else if(selectNo == 3) {
                System.out.println("scores[0] > " + scores[0]);
                System.out.println("scores[1] > " + scores[1]);
                System.out.println("scores[2] > " + scores[2]);

            }else if(selectNo == 4) {

                for(int i = 0 ; i<scores.length ; i++){
                    sum += scores[i];
                }
                avg = sum/scores.length;
                System.out.println(sum);
                System.out.println(avg);


            }else if(selectNo == 5) {
                run = false;
            }
            }

        System.out.println("프로그램 종료");

        }
}


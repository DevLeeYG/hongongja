package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ooI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //자료를 입력받는다

        int N = sc.nextInt(); //인트형으로 입력받는다

        System.out.println("N: "+ N);

        String sNum = sc.next(); //한번더 입력 받는다.



        System.out.println("sNum: "+ sNum);

        char[] cNum = sNum.toCharArray(); //한글자씩 쪼개서 넣어줍니다 배열에

        System.out.println("cNum: " + Arrays.toString(cNum));

        int sum = 0;
        for(int i = 0 ; i<cNum.length; i++){
            sum += cNum[i] - '0'; // 아스키코드 int형으로 변환

            System.out.println("sum in for :" + sum);
        }

        System.out.println(sum);
    }
}



package algorithm;

import java.util.Scanner;

public class al2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];


        for(int i=0 ; i<N; i++){
            A[i] = sc.nextInt();
        }

        long total = 0;
        long max = 0;

        for(int i = 0 ; i<N; i++){
            if(A[i]>max){
                max = A[i];
            }
            total+= A[i];
        }
        System.out.println(total*100.0/max/N);

    }
}
/*
* 자기점수중 최댓값을 골랐다. 최댓값을 m이라고 할때 모든 점수를 점수/m*100 으로 고쳤다.
* 최고점이 80 일때 점수를 40/80*100
* 우선 각 과목당 변환점수를 구한다. 그리고 그걸 전부다 더하고 과목 수로 나눈다.
* */

/**
 * 변수 N 에 과 목의 수 입력받기
 * 길이가 N 인 배열 A[] 선언
 * A에 저장
 * (A+B+C)*100/max/3
 */
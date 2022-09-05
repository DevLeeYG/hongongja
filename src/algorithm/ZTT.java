package algorithm;

import org.w3c.dom.ls.LSOutput;

public class ZTT {
    public int solution(String s) {
        int a =  Integer.parseInt(s);
        return  a;
    }
    public static void main(String[] args) {


    }
}
/**
 * 구간 합 알고리즘을 활용하려면 합 매열을 구해야한다.
 * 합배열은 기존의 배열을 전처리한 배열 이라고 생각하면된다.
 * 이렇게 합 배열을 미리 구해 놓으면 기존 배열을 일정 범위의 합을 구하는 시간 복잡도가 감소한다다
 *
 * */
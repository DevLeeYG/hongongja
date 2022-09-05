package algorithm;

public class A {

    public int[] solution(long n) {

        String str = String.valueOf(n);

        char[] charStr = str.toCharArray();

        int[] arr = new int[charStr.length];

        for(int i= charStr.length-1; i>= 0 ; i--){
            arr[charStr.length-1-i] = str.charAt(i)-'0';
        }
        return arr;

    }

    public static void main(String[] args) {

    }
}

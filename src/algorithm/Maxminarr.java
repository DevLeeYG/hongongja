package algorithm;


import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 우선 정렬
 */
public class Maxminarr {

    public int[] solution(int[] arr) {
            if (arr.length <= 1)  return new int[]{-1};

            int index = 0;

            for (int i = 1; i < arr.length; i++) {
                index = ((int)Math.min(arr[index], arr[i]) == arr[i]) ? i : index;
            }

            List<Integer> list = new ArrayList<>();

            for (int j : arr)
                list.add(j);

            list.remove(index);

            int[] arr2 = new int[list.size()];

            for (int k = 0; k < list.size(); k++) {
                arr2[k] = list.get(k);
            }
            return arr2;
        }



    public static void main(String[] args) {

        Maxminarr maxminarr = new Maxminarr();

       int[] a = maxminarr.solution(new int[] {4,3,2,1});

        System.out.println(Arrays.toString(a));


    }



}

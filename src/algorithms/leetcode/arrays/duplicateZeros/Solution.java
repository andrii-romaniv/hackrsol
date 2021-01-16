package algorithms.leetcode.arrays.duplicateZeros;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void duplicateZeros(int[] arr) {
        List<Integer> ls = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ls.add(0);

            }
            ls.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ls.get(i);
        }
    }

    public static void main(String[] args) {
        duplicateZeros(new int[] {1,0,2,3,0,4,5,0});
    }
}

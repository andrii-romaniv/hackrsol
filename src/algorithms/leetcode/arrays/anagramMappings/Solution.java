package algorithms.leetcode.arrays.anagramMappings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] anagramMappings(int[] A, int[] B) {
        int [] res = new int[A.length];
        Map<Integer, Integer> first = new HashMap<>();

        for (int i=0; i < B.length; i++){
            first.put(B[i], i);
        }
        for (int j=0; j < A.length; j++){
            res[j] = first.get(A[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] res = anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});
        System.out.println(res);
    }

}
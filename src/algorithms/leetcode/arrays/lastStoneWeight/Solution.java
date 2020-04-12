package algorithms.leetcode.arrays.lastStoneWeight;

import java.util.Arrays;

class Solution {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        if (stones.length == 2) return Math.abs(stones[stones.length-1]-stones[stones.length-2]) ;
        int a[] = returnNewInt(stones);
        if (a.length == 1){
            return a[0];
        }
        return 0;
    }

    public static int [] returnNewInt(int [] arr){
        int[] newArr = new int[0];
        int n = arr.length;
        while (n >= 2) {
            Arrays.sort(arr);
            int a = arr[n - 1] - arr[n - 2];
            if (a > 0) {
                newArr = new int[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    newArr[i] = arr[i];
                }
                newArr[n - 2] = a;
            } else {
                newArr = new int[n - 2];
                for (int i = 0; i < n - 2; i++) {
                    newArr[i] = arr[i];
                }
            }
            n = newArr.length;
            arr = newArr;
        }
        return newArr;
    }

    public static void main(String[] args) {
//        int a = lastStoneWeight(new int [] {2,7,4,1,8,1});
        int a = lastStoneWeight(new int [] {3,7,2});
        System.out.println(a);
    }
}
package algorithms.leetcode.arrays.climbStairs;

public class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 0;
        for (int i=1; i <=n; i++){
            if (i == 1) {
                second = 1;
            } else {
                int temp = second;
                second = first + second;
                first = temp;
            }
        }
        return second;
    }
}
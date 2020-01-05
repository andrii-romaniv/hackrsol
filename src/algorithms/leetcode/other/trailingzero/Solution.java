package algorithms.leetcode.other.trailingzero;

public class Solution {
    public int trailingZeroes(int n) {
        if (n < 5) return 0;
        int result = 0;
        while (n >=5){
            result += n/5;
            n/=5;
        }
        return result;
    }

}

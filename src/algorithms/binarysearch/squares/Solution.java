package algorithms.binarysearch.squares;

public class Solution {
    public static int[] solve(int[] nums) {
        int [] res = new int [nums.length];
        int lo = 0;
        int hi = nums.length-1;
        for (int i = nums.length-1; i>=0;i--) {
            if (Math.abs(nums[lo]) > Math.abs(nums[hi])) {
                res[i] = nums[lo] * nums[lo];
                lo++;
            } else {
                res[i] = nums[hi] * nums[hi];
                hi--;
            }
        }
        return res;

    }

    public static void main(String[] args) {
       int [] nums = {-4, -3, 0};
       solve(nums);
    }
}
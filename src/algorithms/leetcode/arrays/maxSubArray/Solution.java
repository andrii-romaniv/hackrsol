package algorithms.leetcode.arrays.maxSubArray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i=1; i < nums.length; i++){
            currSum = Math.max(currSum, currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
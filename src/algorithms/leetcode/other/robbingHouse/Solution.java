package algorithms.leetcode.other.robbingHouse;

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] maxRobs = new int[nums.length];
        maxRobs[0] = nums[0];
        maxRobs[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i ++){
            maxRobs[i] = Math.max(maxRobs[i-1], nums[i] + maxRobs[i-2]);
        }
        return maxRobs[nums.length-1];
    }
}
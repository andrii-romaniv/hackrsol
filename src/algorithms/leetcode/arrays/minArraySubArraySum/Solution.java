package algorithms.leetcode.arrays.minArraySubArraySum;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        int sum = 0;
        int left = 0;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++){
            sum += nums[i];
            while (sum >= s){
                answer = Math.min(answer, i+1-left);
                sum-=nums[left++];
            }
        }
        return (answer != Integer.MAX_VALUE) ? answer : 0;
    }
}

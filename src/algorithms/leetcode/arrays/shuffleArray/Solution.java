package algorithms.leetcode.arrays.shuffleArray;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index = 0;
        int [] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            res[index++] = nums[i];
            res[index++] = nums[i + n];
        }
        return res;
    }
}
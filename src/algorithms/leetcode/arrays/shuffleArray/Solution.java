package algorithms.leetcode.arrays.shuffleArray;

class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int index = 0;
        int [] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            res[index++] = nums[i];
            res[index++] = nums[i + n];
        }
        return res;
    }

    public static void main(String[] args) {
        shuffle(new int[]{2,5,1,3,4,7}, 3);
    }
}
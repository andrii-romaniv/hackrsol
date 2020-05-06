package algorithms.leetcode.arrays.containsDupl;

import java.util.Arrays;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        Arrays.sort(nums);
        for (int j=0; j < nums.length-1; j++){
            if (nums[j] == nums[j+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int [] {2,4,8,22,22}));
    }
}
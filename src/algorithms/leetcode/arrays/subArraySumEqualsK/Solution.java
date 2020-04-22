package algorithms.leetcode.arrays.subArraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        numbers.put(0,1);
        for (int i = 0; i<nums.length; i++){
            sum +=nums[i];
            if (numbers.containsKey(sum-k)){
                count+=numbers.get(sum-k);
            }
            numbers.put(sum, numbers.getOrDefault(sum, 0) + 1);
        }
        return count;

    }
}
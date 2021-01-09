package algorithms.binarysearch.firstPositiveInt;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int solve(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int minPositive = 1;
        for(int num:nums){
            if(num>0){
                minPositive = Math.min(minPositive,num);
                numbers.add(num);
            }
        }
        int from = minPositive;
        while(numbers.contains(from)){
            from++;
        }

        return from;
    }

    public static void main(String[] args) {
//        int [] nums = {3, 4, -1, 1};
        int [] nums = {1, 2, 0};
        System.out.println(solve(nums));
    }

}
package algorithms.binarysearch.missingNumber;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static int[] solve(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int n: nums){
            unique.add(n);
        }
        int [] result = new int[nums.length-unique.size()];
        int expectedNumCount = nums.length + 1;
        List<Integer> al = new ArrayList<Integer>();
        for (int number = 1; number < expectedNumCount; number++) {
            if (!unique.contains(number)) {
               al.add(number);
            }
        }
        for (int i=0; i < al.size(); i++){
            result[i] = al.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
       int [] nums = {3, 3, 1, 1, 5, 5};
       solve(nums);
    }
}

package algorithms.leetcode.arrays.smallestPositiveInt;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        Set<Integer> numbers = new HashSet<>();
        for (int i : A){
            if (i > 0){
                numbers.add(i);
            }
        }
        for (int a=1; a <=length+1; a++){
            if (!numbers.contains(a)){return a;}
        }
        return 1;
    }
}


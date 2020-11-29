package algorithms.leetcode.arrays.kidsWithCandies;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> k = new ArrayList<>();
        int max = 0;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : candies){
                if (max <= (i+extraCandies)){
                    k.add(true);
                } else {
                    k.add(false);
                }
            }
        return k;
    }

    public static void main(String[] args) {
        kidsWithCandies(new int[]{2,3,5,1,3}, 3);
    }
}
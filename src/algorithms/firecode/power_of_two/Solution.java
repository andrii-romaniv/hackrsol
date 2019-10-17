package algorithms.firecode.power_of_two;

public class Solution {
    public static boolean isPowOfTwo(int num) {
        return num>0 && (num&num-1)==0;

    }
}

package algorithms.firecode.level_3.missing_number;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,10};
        int r = findMissingNumber(arr);

        }

    private static int findMissingNumber(int[] arr) {
        int sum = 0;
        int sumOften = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        for (int i=1; i <=10; i++){
            sumOften += i;
        }
        return sumOften - sum;
    }
}

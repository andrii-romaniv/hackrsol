package algorithms.hackerrank.algorithms.equalizeArray;

import java.util.Arrays;

public class Solution {
    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int count = 0;
        for (int j=1; j < arr.length; j++){
            if (arr[i]!=arr[j]){
                i++;
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }

}

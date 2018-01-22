package minmux;

import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
            long max = 0;
            long min = Long.MAX_VALUE;
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                sum +=arr[i];
            }
           long maxsum = sum - max;
           long minsum = sum - min;
            System.out.println(maxsum+ " "+ minsum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

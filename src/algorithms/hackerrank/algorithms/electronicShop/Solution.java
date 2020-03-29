package algorithms.hackerrank.algorithms.electronicShop;

public class Solution {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum <=b) {
                    if (sum > max)
                        max = sum;
                }
            }
        }
        return max;
    }
}

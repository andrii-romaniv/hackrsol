package algorithms.leetcode.arrays.richestCustomer;

public class Solution {
    public static int maximumWealth(int[][] accounts) {

        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int max = 0;
            for (int j=0; j < accounts[i].length; j++) {
                    max += accounts[i][j];
                    res = Math.max(res, max);

            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [] [] accounts = {{1,5},{7,3},{3,5}};
        maximumWealth(accounts);
    }

}

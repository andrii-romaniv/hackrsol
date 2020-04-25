package algorithms.hackerrank.algorithms.beautifulDays;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }


    static int beautifulDays(int i, int j, int k) {
        List<Integer> rangeDays = new ArrayList<>();
        for (int b = i; b <= j; b++) {
            rangeDays.add(b);
        }
        int res = 0;
        for (int a : rangeDays) {
            if ((a - reverse(a)) % k == 0) {
                res++;
            }
        }
        return res;
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
}
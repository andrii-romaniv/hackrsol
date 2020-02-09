package algorithms.hackerrank.algorithms.bonApetit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int sum = bill.stream().reduce(0, Integer::sum);
        int sumToRefund = b-(sum/2);
        if (sumToRefund > 0){
            System.out.println(sumToRefund);
        } else {
            System.out.println("Bon Appetit");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 10, 2, 9));
        bonAppetit(list, 1, 7);
    }
}

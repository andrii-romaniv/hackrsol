package algorithms.hackerrank.algorithms.divisibleSumPairs;

public class Solution2 {
    //brutforce complexity O(n^2)
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int sum = 0;
        for (int i=0; i <n; i ++){
            for (int j=0; j < i; j++){
                if ((ar[i] + ar[j]) % k == 0){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}

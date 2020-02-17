package algorithms.hackerrank.algorithms.divisibleSumPairs;

public class Solution {
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int[] frequency =  new int[k];
        for (int i =0; i < n; i++){
            ++frequency[ar[i]%k];
        }
        // If both pairs are divisible by 'K'
        int sum = frequency[0] * (frequency[0] - 1) / 2;

        // count for all i and (k-i)
        // freq pairs
        for (int i = 1; i <= k / 2 && i != (k - i); i++)
            sum += frequency[i] * frequency[k - i];
        // If K is even
        if (k % 2 == 0)
            sum += (frequency[k / 2] * (frequency[k / 2] - 1) / 2);
        return sum;


    }
}

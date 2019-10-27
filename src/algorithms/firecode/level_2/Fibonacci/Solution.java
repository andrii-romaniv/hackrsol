package algorithms.firecode.level_2.Fibonacci;

public class Solution {
    public static int betterFibonacci(int n) {
        if ( n==0) return 0;
        if ( n==1 || n==2) return 1;
        int last=1, secondToLast = 1;
        int cur = 0;
        for (int i = 3; i <= n; i++){
            cur = last + secondToLast;
            secondToLast = last;
            last = cur;

        }
        return cur;

    }
}

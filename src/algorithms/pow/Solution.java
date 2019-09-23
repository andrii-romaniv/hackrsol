package algorithms.pow;

public class Solution {
    public static double pow(double x, int n) {
        if (n == 1 || x == 0) return x;
        if (n == 0) return 1;
        if ( n < 0) {
            x = 1/x;
            n = -n;
        }
        if ( n%2 > 0) {
            return x * pow(x*x, n/2);
        } else return pow (x*x, n/2);


    }
}

package algorithms.hackerrank.algorithms.cangaroo;

public class Solution {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if( x2>x1 && v2>=v1) return "NO";
        int a = Math.abs(x1 - x2);
        int b = Math.abs(v2 - v1);
        if (a%b==0) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 2, 5, 3));
    }
}

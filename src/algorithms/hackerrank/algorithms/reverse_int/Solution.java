package algorithms.hackerrank.algorithms.reverse_int;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseInt(-321));
    }
    public static int reverseInt(int x) {
        boolean negative = false;
        if (x < 0){
            negative = true;
            x *= -1;
        }
        int rev = 0;
        while(x > 0)
        {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return negative ? -1*rev : rev;


    }
}

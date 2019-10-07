package algorithms.firecode.integer_palindrome;

public class Solution {

    public static Boolean isIntPalindrome(int x) {
        if (x < 0) return false;
        int n = x;
        int reverse = 0;
        while (x > 0) {
            int remain = x % 10;
            reverse = reverse * 10 + remain;
            x = x / 10;
        }
        return reverse == n;
    }
}
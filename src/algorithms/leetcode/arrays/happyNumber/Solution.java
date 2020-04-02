package algorithms.leetcode.arrays.happyNumber;

class Solution {
    public static boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = numSquare(slow);
            fast = numSquare(numSquare(fast));
        } while (slow != fast);
        return (slow == 1);
    }

    public static int numSquare(int n){
        int squareSum = 0;
        while (n != 0){
            squareSum += (n%10) * (n%10);
            n/=10;
        }
        return squareSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
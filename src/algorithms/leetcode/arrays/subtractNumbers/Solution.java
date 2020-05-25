package algorithms.leetcode.arrays.subtractNumbers;

class Solution {
    public static int subtractProductAndSum(int n) {
        int length = String.valueOf(n).length();
        int [] digits = new int [length];
        int sum = 0;
        int prod = 1;
        for (int i=0; i < length; i++){
            digits[i] = n%10;
            n/=10;
            sum+=digits[i];
            prod*=digits[i];
        }
        return prod-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
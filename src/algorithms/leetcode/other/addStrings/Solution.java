package algorithms.leetcode.other.addStrings;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int sum= 0;
        int carry = 0;
        int digit1 = 0;
        int digit2 = 0;
        while (i>=0 || j>=0 || carry!=0){
            digit1= i>=0 ? num1.charAt(i--)-'0' : 0;
            digit2= j>=0 ? num2.charAt(j--)-'0' : 0;
            sum =digit1 + digit2 + carry;
            carry = sum/10;
            stringBuilder.insert(0, sum%10);
        }
        return stringBuilder.toString();

    }
}
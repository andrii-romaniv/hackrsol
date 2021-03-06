package algorithms.leetcode.other.addBinary;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry= 0;
        int sum = 0;
        while (i >= 0 || j >= 0){
            sum = carry;
            if (i >=0) {
                sum +=a.charAt(i--)-'0';
            }
            if (j >=0){
                sum += b.charAt(j--)-'0';
            }
            builder.append(sum%2);
            carry = sum/2;
        }
        if (carry > 0){
            builder.append(1);
        }
        return builder.reverse().toString();

    }
}

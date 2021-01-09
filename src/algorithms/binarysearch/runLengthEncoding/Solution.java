package algorithms.binarysearch.runLengthEncoding;

class Solution {
    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < s.length(); i++){
            int count = 1;
            while (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbccdaa";
        System.out.println(solve(s));
    }
}
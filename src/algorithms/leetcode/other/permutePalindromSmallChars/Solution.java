package algorithms.leetcode.other.permutePalindromSmallChars;

class Solution {
    public static void main(String[] args) {
        String a = "a";
        String b = "aaa";
        String c = "aab";
        String d = "abc";
        String e = "abba";
        String f = "carerac";
        String g = "nope";
        String h = "nopen";
        System.out.println(canPermutePalindrome(a));
        System.out.println(canPermutePalindrome(b));
        System.out.println(canPermutePalindrome(c));
        System.out.println(canPermutePalindrome(d));
        System.out.println(canPermutePalindrome(e));
        System.out.println(canPermutePalindrome(f));
        System.out.println(canPermutePalindrome(g));
        System.out.println(canPermutePalindrome(h));
    }
    public static boolean canPermutePalindrome(String s) {
        int mycount = 0;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for (int c : count){
            if (s.length() % 2 == 0){
                if (c==1) mycount--;
            } else {
                if (c==1) mycount++;
            }
        }
        if (mycount == 0) return true;
        if (s.length() % 2 == 0 && mycount < 0) return false;
        if (s.length() % 2 != 0 && mycount == 1) return true;
        return false;

    }
}
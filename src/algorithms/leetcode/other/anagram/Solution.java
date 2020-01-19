package algorithms.leetcode.other.anagram;

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
        System.out.println(isAnagram(a));
        System.out.println(isAnagram(b));
        System.out.println(isAnagram(c));
        System.out.println(isAnagram(d));
        System.out.println(isAnagram(e));
        System.out.println(isAnagram(f));
        System.out.println(isAnagram(g));
        System.out.println(isAnagram(h));
    }
    public static boolean isAnagram(String s) {
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
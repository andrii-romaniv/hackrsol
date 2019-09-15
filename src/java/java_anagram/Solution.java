package java.java_anagram;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String input1, String input2) {
        if(input1 == null || input2 == null) return false;
        if (input1.length() != input2.length()) return false;

        int[] chars = new int[256];
        if(input1.length() != input2.length() ) return false;
        for(int i = 0; i < input1.length(); i++ ) {
            chars[input1.charAt(i) % 256]++;
        }
        for(int i = 0; i < input2.length(); i++ ) {
            chars[input2.charAt(i) % 256]--;
        }

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != 0) return false;
        }
        return true;

    }
}

package algorithms.leetcode.arrays.romanToInt;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanDigits = new HashMap<>();
        romanDigits.put('I', 1);
        romanDigits.put('V', 5);
        romanDigits.put('X', 10);
        romanDigits.put('L', 50);
        romanDigits.put('C', 100);
        romanDigits.put('D', 500);
        romanDigits.put('M', 1000);
        if (s == null) return 0;
        //we grab last element
        int result = romanDigits.get(s.charAt(s.length()-1));
        //then iterate through others from the second last element
        for (int  i = s.length() -2; i >=0; i--){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            if (romanDigits.get(c1) < romanDigits.get(c2)){
                result -= romanDigits.get(c1);
            } else {
                result += romanDigits.get(c1);
            }
        }

        return result;
    }

    //test
    public static void main(String[] args) {
        String s = "XIX";
        System.out.println(romanToInt(s));
    }
}

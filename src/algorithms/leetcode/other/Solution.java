package algorithms.leetcode.other;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()){
            if (!chars.add(c))
                chars.remove(c);
        }
        return chars.size() <=1;
    }
}
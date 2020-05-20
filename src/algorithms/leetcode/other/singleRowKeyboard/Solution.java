package algorithms.leetcode.other.singleRowKeyboard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static int calculateTime(String keyboard, String word) {
        int sum = 0;
        int j = 0;
        int index = 0;
        for (int i=0; i < word.length(); i++){
            index = keyboard.indexOf(word.charAt(i));
            sum+=Math.abs(index - j);
            j = index;
        }
        return sum;
    }

    public static void main(String[] args) {
        String k = "pqrstuvwxyzabcdefghijklmno";
//        String k = "abcdefghijklmnopqrstuvwxyz";
//        String word = "leetcocbade";
        String word = "cba";
        calculateTime(k, word);
    }
}
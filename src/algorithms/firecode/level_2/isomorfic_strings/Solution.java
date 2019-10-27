package algorithms.firecode.level_2.isomorfic_strings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("a", "b"));
    }
    public static boolean isIsomorphic(String input1, String input2) {
        if (input1 == null || input2 == null) return false;
        if (input1.length() != input2.length()) return false;
        if (input1 == null && input2 == null) return true;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        fillMap(input1, map1);
        fillMap(input2, map2);
        for (int i = 0; i < input2.length(); i++) {
            int first = map1.get(input1.charAt(i));
            int sec = map2.get(input2.charAt(i));
            if (first != sec) return false;
        }
        return true;
    }
    public static void fillMap(String input, Map<Character, Integer> map) {
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                int count = map.get(a);
                count++;
                map.put(a, count);
            }
        }
    }
}

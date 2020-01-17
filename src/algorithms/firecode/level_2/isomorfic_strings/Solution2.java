package algorithms.firecode.level_2.isomorfic_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (b != map.get(a))
                    return false;
                } else {
                    if (set.contains(b)) return false;
                    set.add(b);
                    map.put(a, b);
                }
            }
        return true;
    }
}

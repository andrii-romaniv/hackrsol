package algorithms.firecode.level_2.sting_compres;

import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static String compressString(String text) {
        if(text== null || text.length() == 1 ) return text;
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < text.length(); i ++){
            char key = text.charAt(i);
            if (!map.containsKey(key)){
                map.put(key, 1);
            } else {
                int count = map.get(key);
                count++;
                map.put(key, count);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            res.append(key);
            if (value > 1){
                res.append(value);
            }

        }

        return res.toString();
    }
}

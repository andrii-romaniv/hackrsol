package algorithms.binarysearch.GroupAnagrams;

import java.util.*;

public class Solution {
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : words) {
            char [] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            if (anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            } else {
                anagrams.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
            }
        }
        return new ArrayList(anagrams.values());
    }
}

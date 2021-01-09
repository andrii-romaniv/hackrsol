package algorithms.binarysearch.largestAnagramGroup;

import java.util.*;

class Solution {
    public int solve(String[] words) {
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
        OptionalInt max = anagrams.values().stream().mapToInt(List::size).max();
        if (max.isPresent()) {
            return max.getAsInt();
        }
        return -1;
    }
}
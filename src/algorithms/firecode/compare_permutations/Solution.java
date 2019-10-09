package algorithms.firecode.compare_permutations;

import java.util.Arrays;

public class Solution {
    public static boolean permutation(String str1, String str2) {
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        int NO_OF_CHARS = 256;
        if (str1.length() != str2.length()) return false;
        if (str1 == null && str2 == null) return true;
        if (str1 == null || str2 == null) return true;
        int [] count1 = new int [NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int [] count2 = new int [NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;
        for (i = 0; i <ch1.length && i < ch2.length; i++){
            count1[ch1[i]]++;
            count2[ch2[i]]++;
        }
        for (i = 0; i < NO_OF_CHARS; i++){
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

}

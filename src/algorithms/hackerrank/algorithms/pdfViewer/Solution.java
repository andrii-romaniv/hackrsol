package algorithms.hackerrank.algorithms.pdfViewer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int designerPdfViewer(int[] h, String word) {
        char [] c = word.toCharArray();
        int count = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
                    map.put(ch, count++);
            }
        int[] positions = new int[word.length()];
        int[] positionsInSecond = new int[word.length()];
        for(int i = 0; i < word.length(); i++){
            positions[i] = map.get(c[i]);
            positionsInSecond[i] = h[positions[i]];
        }
        int max = 0;
        for (int i = 0; i < positionsInSecond.length;i++){
            if (positionsInSecond[i] > max){
                max = positionsInSecond[i];
            }
        }
    return max*positionsInSecond.length;
    }

    public static void main(String[] args) {
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba"));
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc"));
    }
}

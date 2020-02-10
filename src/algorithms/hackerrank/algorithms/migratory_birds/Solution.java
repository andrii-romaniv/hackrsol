package algorithms.hackerrank.algorithms.migratory_birds;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static int migratoryBirds(List<Integer> arr) {
        int[] counter = new int[arr.size()];
        for(int i : arr){
            counter[i]++;
        }

        int max= 0;
        int answer= 0;
        for (int i=0; i < counter.length; i++){
            if (counter[i] > max){
                answer = i;
                max= counter[i];

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        System.out.println(migratoryBirds(list));
    }
}

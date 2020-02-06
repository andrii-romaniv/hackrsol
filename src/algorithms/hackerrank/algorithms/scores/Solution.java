package algorithms.hackerrank.algorithms.scores;


import java.io.IOException;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int max = 0, min = 0;
        int highest = scores[0];
        int lowest = scores[0];
        for(int i = 1; i < scores.length; i++){
            if (scores[i] > highest){
                highest = scores[i];
                max++;
            } else if(scores[i] < lowest){
                lowest = scores[i];
                min++;
            }
        }
        return new int[] {max, min};
    }

    public static void main(String[] args) throws IOException {

        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

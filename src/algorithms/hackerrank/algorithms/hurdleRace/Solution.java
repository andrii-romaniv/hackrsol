package algorithms.hackerrank.algorithms.hurdleRace;

public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for(int i=0; i <height.length; i++){
            if (height[i] > max){
                max = height[i];
            }
        }
        if ((max-k) > 0) return max-k;
        return 0;

    }

    public static void main(String[] args) {
        hurdleRace(4, new int[]{1,6,3,5,2});
    }
}

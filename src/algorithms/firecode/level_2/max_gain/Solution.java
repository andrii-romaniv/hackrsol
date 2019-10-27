package algorithms.firecode.level_2.max_gain;

public class Solution {
    public static int maxGain(int[] a) {
        int min = Integer.MAX_VALUE;
        int gain = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > min) {
                int currGain = a[i] - min;
                if (Math.abs(currGain) > Math.abs(gain)) {
                    gain = currGain;
                }
            }

        }
        return Math.abs(gain);


    }
}

package algorithms.leetcode.arrays.replaceElements;

public class Solution {
    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int maxValue = -1;
        for(int x = arr.length-1; x >=0; x--) {
            result[x] = maxValue;
            maxValue = Math.max(arr[x], maxValue);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] n = new int[] {17,18,5,4,6,1};
        replaceElements(n);
    }

}

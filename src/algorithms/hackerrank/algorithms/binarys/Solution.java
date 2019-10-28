package algorithms.hackerrank.algorithms.binarys;

import java.util.Arrays;

class Solution {
    // Returns either the index of the location in the array,
    // or -1 if the array did not contain the targetValue
    public static int doSearch(int[] array, int targetValue) {
        int min = 0;
        System.out.println(Arrays.toString(array));
        int max = array.length - 1;

        while (min <= max){
            int mid = min + (max-min)/2;
            if (array[mid] == targetValue){
                return mid;
            }
            if (array[mid] < targetValue){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = doSearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " +
                    "index " + result);

    }
}



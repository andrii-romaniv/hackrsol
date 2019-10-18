package algorithms.firecode.binary_search;

public class Solution {
    public static Boolean binarySearch(int[] arr, int n){
        if (findIndex(arr, n) != -1) return true;
        return false;
    }
    public static int findIndex(int[] arr, int n){
        int min = 0;
        int max = arr.length - 1;

        while (min <= max){
            int mid = min + (max-min)/2;
            if (arr[mid] == n){
                return mid;
            }
            if (arr[mid] < n){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }


        return -1;

    }
}

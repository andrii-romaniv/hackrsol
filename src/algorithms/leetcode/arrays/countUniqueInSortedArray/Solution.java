package algorithms.leetcode.arrays.countUniqueInSortedArray;

class Solution {
    public static int countUniqueInSortedArrayElements(int[] arr) {
        int count = 1;
            for (int j =0 ; j < arr.length-1; j++){
                if (arr[j] != arr[j+1]){
                    count ++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countUniqueInSortedArrayElements(new int []{1, 1, 1, 1, 2, 2, 2, 2, 5, 5, 5, 7, 7, 8, 8, 10}));
    }
}
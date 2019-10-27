package algorithms.firecode.level_2.selection_sort;

public class Solution {
    public static int[] selectionSortArray(int[] arr){
        for (int i=0; i < arr.length-1; i++){
            int small = i;
            for (int j=i+1; j < arr.length; j++){
                if (arr[j] < arr[small]){
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        return arr;
    }
}

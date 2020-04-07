package algorithms.leetcode.arrays.countingElements;



class Solution {
    public static int countElements(int[] arr) {
        int count = 0;
        for (int i=0; i < arr.length; i++){
            for (int j =0 ; j < arr.length; j++){
                if (arr[j] == arr[i]+1){
                    count ++;
                    break;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countElements(new int []{1,1,2,2}));
    }
}

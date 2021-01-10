package algorithms.binarysearch.productOfArr;

public class Solution {
    public static int[] arrayOfProducts(int[] array) {
        int [] res = new int [array.length];
        int [] left = new int [array.length];
        int [] right = new int [array.length];
        int leftRun = 1;

        for (int i = 0; i < array.length; i++) {
            left[i] = leftRun;
            leftRun *=array[i];
        }
        int rightRun = 1;
        for (int i = array.length-1; i >= 0; i--) {
            right[i] = rightRun;
            rightRun *= array[i];
        }
        for (int i=0; i < array.length; i++) {
            res[i] = left[i] * right[i];
        }

        return res;

}

    public static void main(String[] args) {
        int [] a = {5,1,4,2};
        arrayOfProducts(a);
    }

}

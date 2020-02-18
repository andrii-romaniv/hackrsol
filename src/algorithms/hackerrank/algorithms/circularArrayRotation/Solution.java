package algorithms.hackerrank.algorithms.circularArrayRotation;

public class Solution {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for (int i =0; i < k;i++){
            rotate(a);
        }
        int [] newAr = new int[queries.length];
        for (int i=0;i < queries.length; i++){
            newAr[i] = a[queries[i]];
        }
        return newAr;
    }

    private static void rotate(int[] a) {
        int temp = a[a.length-1];
        for (int i=a.length-1; i >0; i--){
            a[i] = a[i-1];
        }
        a[0]= temp;
    }

    public static void main(String[] args) {
        circularArrayRotation(new int[]{1,2,3}, 2, new int[]{2});
    }
}

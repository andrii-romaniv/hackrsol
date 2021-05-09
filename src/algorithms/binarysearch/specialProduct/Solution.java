package algorithms.binarysearch.specialProduct;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5}));

    }
    public static int[] solve(int[] nums) {
        int [] res = new int[nums.length];
        int [] below = new int[nums.length];
        int [] above = new int [nums.length];
        int p = 1;
        int a = 1;
        for (int i=0; i < nums.length; i++){
            below[i] = p;
            p*=nums[i];
        }
        for (int i=nums.length-1; i >= 0; i--){
            above[i] = a;
            a*=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = below[i] * above [i];
        }
        return res;
    }
}

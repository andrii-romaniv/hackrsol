package algorithms.binarysearch.madmax;

class Solution {
    public static int[] solve(int[] nums, int k) {
        int j, max;
        int [] res= new int [nums.length-k+1];

        for (int i = 0; i <= nums.length - k; i++) {

            max = nums[i];

            for (j = 1; j < k; j++) {
                if (nums[i + j] > max)
                    max = nums[i + j];
                res[i]=max;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] n = new int []{0,1};
        solve(n, 1);
    }
}
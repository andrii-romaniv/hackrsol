package algorithms.leetcode.arrays.duplicateNumber;

class Solution {
    public static int findDuplicate(int[] nums) {
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            int h = nums[hare];
            hare = nums[h];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }


    public static void main(String[] args) {
        int r = findDuplicate(new int [] {3,1,3,4,2});
        System.out.println(r);
    }
}

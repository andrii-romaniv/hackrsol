package algorithms.leetcode.other.maxdepth;

import algorithms.firecode.TreeNode;

import java.lang.Math;

class Solution {
    public int maxDepth(TreeNode root) {
        int leftD = 0;
        int rightD = 0;
        if (root == null){
            return 0;
        } else {
            leftD = maxDepth(root.left);
            rightD = maxDepth(root.right);
        }
        return Math.max(leftD, rightD)+1;
    }
}
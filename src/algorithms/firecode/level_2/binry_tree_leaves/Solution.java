package algorithms.firecode.level_2.binry_tree_leaves;

import algorithms.TreeNode;

public class Solution {
    public int numberOfLeaves(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        else
            return numberOfLeaves(root.left) + numberOfLeaves(root.right);
    }
}
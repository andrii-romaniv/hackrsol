package algorithms.firecode.binary_tree_sum_all;

import algorithms.TreeNode;

public class Solution {
    public int sum(TreeNode root) {
        if (root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }
}

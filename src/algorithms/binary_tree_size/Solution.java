package algorithms.binary_tree_size;

import algorithms.TreeNode;

public class Solution {
    public int size(TreeNode root) {
        if (root == null) return 0;
        return (size(root.left) + 1 + size(root.right));
    }
}
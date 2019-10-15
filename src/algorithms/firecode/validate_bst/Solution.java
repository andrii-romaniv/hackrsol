package algorithms.firecode.validate_bst;

import algorithms.TreeNode;

public class Solution {

    public static boolean validateBST(TreeNode root) {
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);


    }

    public static boolean isBst(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.data < min || root.data > max) {
            return false;
        }
        return (isBst(root.left, min, root.data - 1) && isBst(root.right, root.data + 1, max));


    }
}
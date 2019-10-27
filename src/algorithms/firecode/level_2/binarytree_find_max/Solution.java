package algorithms.firecode.level_2.binarytree_find_max;

import algorithms.TreeNode;

public class Solution {
    public int findMax(TreeNode root) {
        return find(root, Integer.MIN_VALUE);
    }

    public int find(TreeNode root, Integer max){
        if (root != null){
            if(root.data > max){
                max = root.data;
            }
            return Math.max(find(root.left, max), find(root.right, max));
        }
        return max;
    }
}

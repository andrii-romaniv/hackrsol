package algorithms.firecode.level_2.binary_tree_find_node;

import algorithms.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null){
                if (cur.data == val) return cur;
                queue.add(root.left);
                queue.add(cur.right);
            }
        }
        return null;
    }
}

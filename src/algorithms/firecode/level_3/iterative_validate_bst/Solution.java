package algorithms.firecode.level_3.iterative_validate_bst;

import algorithms.firecode.TreeNode;

import java.util.LinkedList;

public class Solution {

    public static boolean validateBSTItr(TreeNode root) {

        if(root == null)
            return true;

        LinkedList<TreeBoundaryNode> queue = new LinkedList<TreeBoundaryNode>();
        queue.add(new TreeBoundaryNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        while(!queue.isEmpty()){
            TreeBoundaryNode b = queue.poll();
            if(b.n.data <= b.left || b.n.data >=b.right){
                return false;
            }
            if(b.n.left!=null){
                queue.offer(new TreeBoundaryNode(b.n.left, b.left, b.n.data));
            }
            if(b.n.right!=null){
                queue.offer(new TreeBoundaryNode(b.n.right, b.n.data, b.right));
            }
        }
        return true;
    }

    static class TreeBoundaryNode{
        TreeNode n;
        int left;
        int right;
        public TreeBoundaryNode(TreeNode n, int left, int right){
            this.n = n;
            this.left = left;
            this.right = right;
        }
    }
}

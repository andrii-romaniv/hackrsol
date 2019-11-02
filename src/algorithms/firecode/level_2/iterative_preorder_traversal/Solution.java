package algorithms.firecode.level_2.iterative_preorder_traversal;

import algorithms.firecode.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<>();
        myStack.push(root);
        while(!myStack.isEmpty()){
            TreeNode curr = myStack.pop();
            if (curr != null){
                myList.add(curr.data);
                myStack.push(curr.right);
                myStack.push(curr.left);
            }
        }
        return myList;
    }
}

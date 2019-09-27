package algorithms.binary_tree_size;

public class Solution {
        if (root == null) return 0;
    return (size(root.left) + 1 + size(root.right));
}

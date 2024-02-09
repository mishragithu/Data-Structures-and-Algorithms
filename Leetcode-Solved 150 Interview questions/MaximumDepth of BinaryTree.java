class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if root is null, return 0
        if (root == null)
            return 0;
        
        // Recursively find the maximum depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // Return the maximum depth among left and right subtrees, plus 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

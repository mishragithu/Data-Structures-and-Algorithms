
class Solution {
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        inorderTraversal(root, queue);
        
        int minDiff = Integer.MAX_VALUE;
        TreeNode prev = null;
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (prev != null) {
                minDiff = Math.min(minDiff, node.val - prev.val);
            }
            prev = node;
        }
        
        return minDiff;
    }
    
    private void inorderTraversal(TreeNode root, Queue<TreeNode> queue) {
        if (root == null)
            return;
        
        inorderTraversal(root.left, queue);
        queue.offer(root);
        inorderTraversal(root.right, queue);
    }
}

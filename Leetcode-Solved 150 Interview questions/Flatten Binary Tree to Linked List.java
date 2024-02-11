class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currNode = stack.pop();

            if (currNode.right != null)
                stack.push(currNode.right);
            if (currNode.left != null)
                stack.push(currNode.left);

            // Connect the current node to the next node in the flattened structure
            if (!stack.isEmpty())
                currNode.right = stack.peek();

            // Set the left child to null
            currNode.left = null;
        }
    }
}

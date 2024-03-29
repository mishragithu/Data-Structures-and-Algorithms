class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res=new ArrayList<>();
        
        if(root == null)
            return res;
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n=queue.size();
            Double sum=0.0;
            
            for(int i=0;i < n;i++){
                TreeNode node= queue.poll();
                sum += node.val;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

            }
            res.add(sum/n);
        }
        return res;
    }
}

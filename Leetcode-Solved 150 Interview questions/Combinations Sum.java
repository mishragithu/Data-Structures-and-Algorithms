class Solution {
    private void function(int[] candidates, int target, int strt, List<List<Integer>> ans, List<Integer> lst,int sum) {
            if(strt==candidates.length){
            if(sum==target){
                ans.add(new ArrayList<>(lst));
                return;
            }
            else
                return;
            }
            if(candidates[strt]+sum<=target){
            sum+=candidates[strt];
            lst.add(candidates[strt]);
            function(candidates,target,strt,ans,lst,sum);
            lst.remove(lst.size()-1);
            sum-=candidates[strt];
            }
            
            function(candidates,target,strt+1,ans,lst,sum);
           
            // function(candidates,target,strt+1,ans,lst,sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList();
        List<Integer> lst = new ArrayList();
        int sum = 0;
        function(candidates, target, 0, ans, lst,sum);
        return ans;
    }
}

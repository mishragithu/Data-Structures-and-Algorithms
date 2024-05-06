class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        
        // Create an array to store the maximum amount of money that can be robbed
        // up to the ith house.
        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 0;
        dp[1] = nums[0];
        
        // Iterate through the houses and calculate the maximum amount of money
        // that can be robbed up to the current house.
        for (int i = 2; i <= n; i++) {
            // Two options: rob the current house or skip it.
            // If rob the current house, add the money from the current house
            // to the money robbed from the previous house that was not adjacent.
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        
        // Return the maximum amount of money that can be robbed without alerting the police.
        return dp[n];
    }
}

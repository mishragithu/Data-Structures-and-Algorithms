class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Edge case: empty array
        if (nums.length == 0) {
            return result;
        }
        
        // Find the leftmost index of the target
        int left = search(nums, target, true);
        if (left == -1) {
            return result;
        }
        
        // Find the rightmost index of the target
        int right = search(nums, target, false);
        
        // Update the result array
        result[0] = left;
        result[1] = right;
        
        return result;
    }
    
    // Helper method to find the leftmost or rightmost index of the target
    private int search(int[] nums, int target, boolean leftmost) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (leftmost) {
                    right = mid - 1; // Search towards the left for leftmost index
                } else {
                    left = mid + 1; // Search towards the right for rightmost index
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return index;
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int targetIndex = nums.length - k; // Index of the kth largest element
        
        while (start <= end) {
            int pivotIndex = partition(nums, start, end);
            if (pivotIndex == targetIndex)
                return nums[pivotIndex];
            else if (pivotIndex < targetIndex)
                start = pivotIndex + 1;
            else
                end = pivotIndex - 1;
        }
        return -1; // If k is out of range
    }
    
    // Helper method to partition the array
    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, end);
        return i + 1;
    }
    
    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

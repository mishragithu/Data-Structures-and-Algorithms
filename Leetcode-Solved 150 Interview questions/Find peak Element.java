class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is a peak
            if (nums[mid] > nums[mid + 1]) {
                end = mid; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        // At the end of the loop, 'start' and 'end' will converge to the peak element
        return start; // or return end; they will be equal by that time
    }
}

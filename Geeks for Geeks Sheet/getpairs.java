public class PairSum {
    public static int getPairsCount(int[] arr, int n, int k) {
        int count = 0;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // For each element, check the rest of the elements for pairs
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair is equal to k
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 5, 7, 1};
        int n1 = 4;
        int k1 = 6;
        System.out.println("Example 1 Output: " + getPairsCount(arr1, n1, k1)); // Output: 2

        // Example 2
        int[] arr2 = {1, 1, 1, 1};
        int n2 = 4;
        int k2 = 2;
        System.out.println("Example 2 Output: " + getPairsCount(arr2, n2, k2)); // Output: 6
    }
}

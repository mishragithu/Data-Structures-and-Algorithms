import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        // Create an ArrayList to store the indices where the condition is satisfied
        ArrayList<Integer> result = new ArrayList<>();
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element's value equals its 1-based index
            if (arr[i] == i + 1) {
                // Add the 1-based index to the result list
                result.add(i + 1);
            }
        }
        
        // Return the list of indices
        return result;
    }
}

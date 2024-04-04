import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        if(nums.length==0)
            return result; // Return empty result list if nums is empty
        
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            queue.add(num); 
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size(); 
            List<Integer> permutation = new ArrayList<>(); 
            
            for (int i = 0; i < size; i++) {
                int current = queue.poll(); // Dequeue the element
                permutation.add(current); // Add it to the current permutation
                
                for (int j = 0; j < nums.length; j++) {
                    if (current == nums[j]) {
                        queue.add(current); // Re-add the current element to the queue for future permutations
                    }
                }
            }
            result.add(permutation); 
        }
        
        return result; // Return the list of permutations
    }
}

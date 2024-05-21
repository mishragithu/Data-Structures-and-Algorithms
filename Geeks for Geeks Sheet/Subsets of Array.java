import java.util.HashSet;

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        // Create a hash set to store elements of a1
        HashSet<Long> set = new HashSet<>();
        
        // Add elements of a1 to the set
        for (long num : a1) {
            set.add(num);
        }
        
        // Check if all elements of a2 are present in the set
        for (long num : a2) {
            if (!set.contains(num)) {
                return "No";
            }
        }
        
        // If all elements of a2 are found in a1
        return "Yes";
    }
}

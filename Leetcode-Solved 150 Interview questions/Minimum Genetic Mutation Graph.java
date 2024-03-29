import java.util.*;

public class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(endGene)) {
            return -1; // Target sequence not in the bank
        }

        char[] possibleMutations = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(startGene);
        visited.add(startGene);

        int mutations = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(endGene)) {
                    return mutations;
                }
                char[] currentArray = current.toCharArray();
                for (int j = 0; j < currentArray.length; j++) {
                    char originalChar = currentArray[j];
                    for (char c : possibleMutations) {
                        currentArray[j] = c;
                        String mutated = new String(currentArray);
                        if (bankSet.contains(mutated) && !visited.contains(mutated)) {
                            queue.offer(mutated);
                            visited.add(mutated);
                        }
                    }
                    currentArray[j] = originalChar; // Revert back to original character
                }
            }
            mutations++;
        }

        return -1; // Target sequence not reachable
    }
}

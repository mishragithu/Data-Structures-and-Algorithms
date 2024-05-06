import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return wordBreakHelper(s, wordSet, 0);
    }
    
    private boolean wordBreakHelper(String s, Set<String> wordSet, int start) {
        if (start == s.length()) {
            return true;
        }
        
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordSet.contains(s.substring(start, end)) && wordBreakHelper(s, wordSet, end)) {
                return true;
            }
        }
        
        return false;
    }
}

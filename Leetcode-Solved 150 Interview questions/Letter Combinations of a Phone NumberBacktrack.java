import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;
        
        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        
        result.add(""); // Add an empty string to start the combination
        
        for (int i = 0; i < digits.length(); i++) {
            String letters = phoneMap.get(digits.charAt(i));
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < letters.length(); j++) {
                for (String combination : result) {
                    temp.add(combination + letters.charAt(j));
                }
            }
            result = temp;
        }
        
        return result;
    }
}

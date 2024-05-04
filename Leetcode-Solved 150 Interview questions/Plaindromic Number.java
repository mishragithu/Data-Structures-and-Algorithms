class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        
        return original.equals(reversed);
    }
}

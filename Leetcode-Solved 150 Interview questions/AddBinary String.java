public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // StringBuilder to store the result
        
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        // Iterate through both strings from right to left
        while (i >= 0 || j >= 0) {
            int sum = carry;
            // Add the corresponding bits of 'a' and 'b' to the sum
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            
            // Calculate the carry and append the sum bit to the result
            carry = sum / 2;
            result.insert(0, sum % 2); // Insert at the beginning to maintain the order
            
            // If both strings are processed but there's still carry, add it to the result
            if (i < 0 && j < 0 && carry > 0) {
                result.insert(0, carry);
            }
        }
        
        return result.toString();
    }
}

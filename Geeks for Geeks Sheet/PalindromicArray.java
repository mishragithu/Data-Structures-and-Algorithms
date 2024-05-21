class GfG {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0; // If any number is not a palindrome, return 0
            }
        }
        return 1; // All numbers are palindromes, return 1
    }

    // Helper method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        
        // Reverse the number
        while (num > 0) {
            int temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num / 10;
        }
        
        // Check if the original number is equal to its reverse
        return original == reverse;
    }

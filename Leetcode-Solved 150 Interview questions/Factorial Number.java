public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // It is the number to calculate factorial
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        Solution solution = new Solution();
        int zeroCount = solution.trailingZeroes(factorial);
        System.out.println("Number of zeros in the factorial: " + zeroCount);
    }

    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

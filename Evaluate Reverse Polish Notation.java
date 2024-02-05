import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> expressions = new HashSet<>(Set.of("+", "-", "*", "/"));
        
        for (String element : tokens) {
            if (!expressions.contains(element)) {
                stack.push(Integer.parseInt(element));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                
                if (element.equals("+")) {
                    stack.push(num1 + num2);
                } else if (element.equals("-")) {
                    stack.push(num1 - num2);
                } else if (element.equals("*")) {
                    stack.push(num1 * num2);
                } else {
                    stack.push(num1 / num2);
                }
            }
        }
        
        return stack.pop();
    }
} {
    
}

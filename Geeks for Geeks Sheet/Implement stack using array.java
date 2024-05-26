class MyStack {
    int top;
    int arr[];

    MyStack() {
        top = -1;
        arr = new int[100];
    }

    // Function to push an integer into the stack.
    void push(int x) {
        if (top < 99) { // Prevent overflow
            arr[++top] = x;
        } else {
            System.out.println("Stack overflow");
        }
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            return -1; // Indicate stack is empty
        }
    }
}

// Main class to demonstrate the usage of the stack
public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Example 1
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // Should print 3
        stack.push(4);
        System.out.println(stack.pop()); // Should print 4

        // Example 2
        System.out.println(stack.pop()); // Should print -1
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop()); // Should print 5
    }
}

class Compute {
    
    public void rotate(int arr[], int n) {
        // Step 1: Save the last element of the array
        int lastElement = arr[n - 1];
        
        // Step 2: Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Step 3: Place the saved last element at the first position
        arr[0] = lastElement;
    }
}

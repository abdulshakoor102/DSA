public class Task3 {
    char arr[];
    int top = 0, size;
    
    // Constructor to initialize stack
    Task3(int size) {
        this.size = size;
        arr = new char[size];
    }

    // Push method to add elements
    void push(char data) {
        if (top >= size) {
            System.out.println("Stack is Full!!");
        } else {
            arr[top] = data;
            top++;
        }
    }

    // Method to find the first non-repeating character
    void check() {
        boolean isRepeating;
        
        // Iterate through each character
        for (int i = 0; i < top; i++) {
            isRepeating = false;

            // Compare arr[i] with every other character
            for (int j = 0; j < top; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break; // Exit inner loop if repeating character is found
                }
            }

            // If not repeating, print it as the first non-repeating character
            if (!isRepeating) {
                System.out.println("Output: " + arr[i]);
                System.out.println("Explanation: " + arr[i] + " is the first character in the array that does not repeat.");
                return; // Exit after finding the first non-repeating character
            }
        }

        // If no non-repeating character is found
        System.out.println("No non-repeating character found.");
    }

    // Method to display the array content
    void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3(10);
        t3.push('S');
        t3.push('U');
        t3.push('H');
        t3.push('A');
        t3.push('I');
        t3.push('L');
        t3.display();
        t3.check();
    }
}

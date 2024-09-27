public class Task2 {
    char arr[];
    int top = 0, size;
    
    // Constructor to initialize stack
    Task2(int size) {
        this.size = size;
        arr = new char[size];
    }
    
    // Push method to add elements to the stack
    void push(char data) {
        if (top >= size) {
            System.out.println("Stack is Full!!");
        } else {
            arr[top] = data;
            top++;
        }
    }

    // Method to check if brackets are balanced
    void check() {
        int rb = 0, cb = 0, sb = 0;

        for (int i = 0; i < top; i++) {
            if (arr[i] == '(') {
                rb++;
            } else if (arr[i] == ')') {
                rb--;
            } else if (arr[i] == '{') {
                cb++;
            } else if (arr[i] == '}') {
                cb--;
            } else if (arr[i] == '[') {
                sb++;
            } else if (arr[i] == ']') {
                sb--;
            }

            // If any count goes negative, it means we have a closing bracket without a matching opening bracket
            if (rb < 0 || cb < 0 || sb < 0) {
                System.out.println("Unbalanced Brackets");
                return;
            }
        }

        // Check if all brackets are balanced (all counts should be zero)
        if (rb == 0 && cb == 0 && sb == 0) {
            System.out.println("Balanced Brackets");
        } else {
            System.out.println("Unbalanced Brackets");
        }
    }

    // Display the current stack
    void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2(6);
        t2.push('(');
        t2.push('{');
        t2.push('}');
        t2.push(')');
        t2.push(']');
        t2.display();  
        t2.check();    
    }
}

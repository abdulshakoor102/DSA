public class Task4 {
    char arr[]; // Stack array
    int top = 0, size;

    // Constructor to initialize the stack with given size
    Task4(int size) {
        this.size = size;
        arr = new char[size];
    }

    // Push method to add operators to the stack
    void push(char data) {
        if (top >= size) {
            System.out.println("Stack is Full!!");
        } else {
            arr[top] = data;
            top++;
        }
    }

    // Pop method to remove elements from the stack
    char pop() {
        if (top == 0) {
            System.out.println("Stack is Empty!!");
            return '\0'; // Return null character when stack is empty
        } else {
            top--;
            return arr[top];
        }
    }

    // Peek method to get the top element of the stack without removing it
    char peek() {
        if (top == 0) {
            return '\0'; // Return null character if stack is empty
        } else {
            return arr[top - 1];
        }
    }

    // Method to check the precedence of operators
    int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Method to check if the character is an operand (letter or digit)
    boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    // Method to convert infix to postfix
    void convertToPostfix(String expression) {
        StringBuilder result = new StringBuilder(); // Resultant postfix expression

        // Iterate over each character of the infix expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is an operand, append it to result
            if (isOperand(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                push(c);
            }
            // If the character is ')', pop and append to result until '(' is encountered
            else if (c == ')') {
                while (top > 0 && peek() != '(') {
                    result.append(pop());
                }
                pop(); // Pop the '(' from the stack
            }
            // If the character is an operator
            else {
                while (top > 0 && precedence(c) <= precedence(peek())) {
                    result.append(pop());
                }
                push(c); // Push the current operator to the stack
            }
        }

        // Pop all remaining operators from the stack
        while (top > 0) {
            result.append(pop());
        }

        // Display the final postfix expression
        System.out.println("Postfix Expression: " + result);
    }

    public static void main(String[] args) {
        Task4 converter = new Task4(20); // Stack size 100 for simplicity
        String expression = "A+B*C+D";
        System.out.println("Infix Expression: " + expression);
        converter.convertToPostfix(expression);
    }
}

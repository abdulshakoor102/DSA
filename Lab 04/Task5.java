class Node
{
    int data; // integer data
    Node next; // pointer to the next node
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack
{
    private Node top;
    int size = 0;
    
    public Stack() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) {
        Node newNode = new Node(x);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return the top element in the stack
    public int top() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return top.data;
    }

    // Utility function to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;  // or throw an exception
        } else {
            int poppedData = top.data;
            top = top.next;
            size--;
            return poppedData;
        }
    }
}

class Task5
{
    private Stack s1, s2; 

    // Constructor
    Task5() {
        s1 = new Stack();
        s2 = new Stack();
    }

    // Enqueue an item to the queue
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue an item from the queue
    public int dequeue() {
        // If both stacks are empty, queue is empty
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        // If s2 is empty, move elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop from s2 (the oldest element)
        return s2.pop();
    }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};
        Task5 q = new Task5(); 

        // Insert above keys
        for (int key : keys) {
            q.enqueue(key);
        }

        System.out.println(q.dequeue()); // Prints 1
        System.out.println(q.dequeue()); // Prints 2
    }
}

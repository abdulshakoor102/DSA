// A linked list node 
class Node { 
    int data; // integer data 
    Node next; // pointer to the next node 
    public Node(int data) { 
        // set the data in allocated node and return the node 
        this.data = data; 
        this.next = null; 
    } 
} 

class Queue { 
    private static Node rear = null, front = null;
// Utility function to remove front element from the queue and check for Queue Underflow 
public static void dequeue() // delete at the beginning 
{ 
     System.out.println("Removing " + front.data);
    front = front.next;
} 

// Utility function to add an item in the queue 
public static void enqueue(int item) // insertion at the end 
{ 
    Node node = new Node(item);
    if (front == null) {
        System.out.println("Inserting " + item);
        front = node;
        rear = node;
    } else {
        System.out.println("Inserting " + item);
        rear.next = node;
        rear = node;
    }
} 
    // Utility function to return top element in a queue 
    public static int peek() { 
         return front.data;
    } 
        // Utility function to check if the queue is empty or not 
    public static boolean isEmpty() { 
        if (front == null) {
            return true;
        } else {
            return false;
        } 
    } 
    } 
class Task4 { 
    public static void main(String[] args) { 
        Queue q = new Queue(); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        q.enqueue(4); 
        System.out.println("Front element is " + q.peek()); 
        q.dequeue(); 
        q.dequeue(); 
        q.dequeue(); 
        q.dequeue(); 
        if (q.isEmpty()) { 
            System.out.println("Queue is empty"); 
        } 
        else { 
            System.out.print("Queue is not empty");
        } 
    } 
}
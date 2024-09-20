// Class for queue 
class Queue { 
    private int arr[]; 
    private int front; 
    private int rear; 
    private int capacity; 
    private int count; 
    // Constructor to initialize queue 
    Queue(int size) { 
        arr = new int[size]; 
        capacity = size; 
        front = 0; 
        rear = 0; 
        count = 0; 
    } 
    // Utility function to remove front element from the queue and check for Queue Underflow 
    public void dequeue() { 
         System.out.println("Removing " + arr[0]);
         count--;
         for(int i=0 ; i< arr.length-1; i++){
            arr[i] = arr[i+1];
         }
         front = arr[0];
         capacity++;
        } 
        // Utility function to add an item to the queue and check for queue overflow 
    public void enqueue(int item) {
        if(count == 0){
            System.out.println("Inserting " + item);
            arr[count] = item;
            front = item;
            capacity--;
            count++;
        }
        else if(count == 5){
            System.out.println("Queue is Full");
        }
        else{
            System.out.println("Inserting " + item);
            arr[count] = item;
            rear = arr[count];
            capacity--;
            count++;
        }
    } 
    // Utility function to return front element in the queue and check for Queue Underflow 
    public int peek() { 
        return arr[0]; 
    } 
    // Utility function to return the size of the queue 
    public int size() { 
        return count;
    } // Utility function to check if the queue is empty or not 
    public Boolean isEmpty() { 
        if(count == 0) {
            return true;
        }
        else{
            return false;
        }
    } 
    // Utility function to check if the queue is empty or not 
    public Boolean isFull() { 
        if(capacity == 0){
            return true;
        } 
        else{
            return false;
        }
    } 
} 

class Task3 { 
    // main function 
    public static void main (String[] args) { 
        // create a queue of capacity 5 
        Queue q = new Queue(5); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        System.out.println("Front element is: " + q.peek()); 
        q.dequeue(); 
        System.out.println("Front element is: " + q.peek()); 
        System.out.println("Queue size is " + q.size());
        q.dequeue(); 
        q.dequeue(); 
        if (q.isEmpty()) 
        System.out.println("Queue Is Empty"); 
        else System.out.println("Queue Is Not Empty"); 
    } 
}
class Task1 { 
    private int arr[]; 
    private int top; 
    private int capacity;
    // Constructor to initialize stack 
    Task1(int size) { 
        arr = new int[size];
        capacity = size; 
        top = -1; 
    } 
    
    // Utility function to add an element x in the stack and check for stack overflow 
    public void push(int x) { 
        arr[++top] = x;
        capacity--;
        System.out.println("Inserting " + x); 
        } 
        
        // Utility function to pop top element from the stack and check for stack underflow 
        public void pop() { 
            System.out.println("Removing " + arr[top--]); 
            capacity++;
            } 
            
        // Utility function to return top element in a stack 
        public void top() { 
            if(top == -1){
                System.out.println("Stack is Empty");
            }
            else{
                System.out.println("Top Element is " + arr[top]);
            }
            } 
                
        // Utility function to return the size of the stack 
        public void size() { 
            System.out.println("Stack Capacity is " + capacity);
            } 
                    
            // Utility function to check if the stack is empty or not
    public Boolean isEmpty() { 
        if (top == -1) {
            return true;
        } else {
            return false;
        } 
        } 
    
    // Utility function to check if the stack is full or not 
    public Boolean isFull() { 
        if (capacity == 0) {
            return true;
        } else {
            return false;
        }
        } 
        
        public static void main (String[] args) { 
            Task1 t1 = new Task1(3); 
            t1.push(1); // Inserting 1 in the stack 
            t1.push(2); // Inserting 2 in the stack 
            t1.pop(); // removing the top 2 
            t1.pop(); // removing the top 1 
            t1.push(3); // Inserting 3 in the stack 
            t1.top();
            t1.size(); 
            t1.pop(); // removing the top 3 
             // check if stack is empty 
             if (t1.isEmpty()) 
             System.out.println("Stack Is Empty"); 
             else 
             System.out.println("Stack Is Not Empty"); } }
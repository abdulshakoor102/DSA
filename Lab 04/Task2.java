// A linked list node 
class Node { 
    int data; // integer data 
    Node next; // pointer to the next node 
    }; 
    
class Stack { 
    private Node top; 
    public Stack() { 
        this.top = null; 
    } 
    // Utility function to add an element x in the stack 
    public void push(int x) // insert at the beginning 
    { 
        Node node = new Node();
        if(top == null){
        node.data = x;
        top = node;
        System.out.println("Inserting " + x);
        }
        else{
            node.data = x;
            node.next = top;
            top = node;
            System.out.println("Inserting " + x);
        }
    } 
        // Utility function to check if the stack is empty or not 
    public boolean isEmpty() { 
        if(top == null){
            return true;
        }
        else{
        return false;
        }
        }
    // Utility function to return top element in a stack 
    public int top() { 
        if(top == null){
            
            return 0;
        } 
        else{
            return top.data;
        }
        } 
        // Utility function to pop top element from the stack and check for Stack underflow 
    public void pop() // remove at the beginning 
    { 
        if (top == null) {
            System.err.println("Stack is empty");
        } else {
            System.out.println("Removing " + top.data);
            top = top.next;
        }
    } 
} 

class Task2 { 
    public static void main(String[] args) { 
        Stack st = new Stack(); 
        st.push(1); 
        st.push(2); 
        st.push(3); 
        System.out.println("Top element is " + st.top()); 
        st.pop(); 
        st.pop(); 
        st.pop(); 
        if (st.isEmpty()) { 
            System.out.println("Stack is empty"); 
        } 
        else { 
            System.out.println("Stack is not empty"); 
        } 
    } 
}
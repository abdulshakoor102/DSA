class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public int search(int no) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == no) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; 
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class T01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        
        list.addFirst(1);   
        list.addLast(2);    
        list.addFirst(3);   
        list.addLast(4);  
        list.addLast(8);
        list.addLast(10);  

        
        System.out.print("LinkedList: ");
        list.display();

        
        int elementToFind = 8;
        int index = list.search(elementToFind);

        
        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the list.");
        }
    }
}
